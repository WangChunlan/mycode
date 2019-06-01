package com.smartpos.service.online;

import com.smartpos.controller.Constants;
import com.smartpos.domain.online.CloudMonopolyBranch;
import com.smartpos.model.cloudmonopoly.BatchSaveBranchModel;

import com.smartpos.model.cloudmonopoly.DeleteBranchModel;
import com.smartpos.model.cloudmonopoly.ListBranchesModel;
import com.smartpos.util.*;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import saas.api.common.ApiRest;

import java.io.IOException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.util.*;

/**
 * Created by liuyandong on 2019-05-15.
 */
@Service
public class CloudMonopolyService {
    /**
     * 批量保存门店信息
     *
     * @param batchSaveBranchModel
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public ApiRest batchSaveBranch(BatchSaveBranchModel batchSaveBranchModel) {
        BigInteger tenantId = batchSaveBranchModel.getTenantId();
        List<BatchSaveBranchModel.BranchInfo> branchInfos = batchSaveBranchModel.getBranchInfos();
        List<CloudMonopolyBranch> insertCloudMonopolyBranches = new ArrayList<CloudMonopolyBranch>();
        for (BatchSaveBranchModel.BranchInfo branchInfo : branchInfos) {
            BigInteger id = branchInfo.getId();
            String name = branchInfo.getName();
            String phone = branchInfo.getPhone();
            String pushUrl = branchInfo.getPushUrl();
            String contacts = branchInfo.getContacts();
            String code = branchInfo.getCode();
            String memo = branchInfo.getMemo();
            Integer elemeAccountType = branchInfo.getElemeAccountType();
            Boolean pushed = branchInfo.getPushed();

            CloudMonopolyBranch cloudMonopolyBranch = null;
            if (id != null) {
                SearchModel searchModel = new SearchModel(true);
                searchModel.addSearchCondition("tenant_id", Constants.SQL_OPERATION_SYMBOL_EQUALS, tenantId);
                searchModel.addSearchCondition("id", Constants.SQL_OPERATION_SYMBOL_EQUALS, id);
                cloudMonopolyBranch = DatabaseHelper.find(CloudMonopolyBranch.class, searchModel);
                ValidateUtils.notNull(cloudMonopolyBranch, "门店不存在！");
            } else {
                cloudMonopolyBranch = new CloudMonopolyBranch();
                cloudMonopolyBranch.setBranchType(7);
                cloudMonopolyBranch.setStatus(1);
            }

            cloudMonopolyBranch.setTenantId(tenantId);
            cloudMonopolyBranch.setName(name);
            cloudMonopolyBranch.setPhone(phone);
            cloudMonopolyBranch.setPushUrl(pushUrl);
            cloudMonopolyBranch.setContacts(contacts);
            cloudMonopolyBranch.setCode(code);
            cloudMonopolyBranch.setMemo(memo);
            cloudMonopolyBranch.setElemeAccountType(elemeAccountType);
            cloudMonopolyBranch.setPushed(pushed);

            Date now = new Date();
            cloudMonopolyBranch.setCreateAt(now);
            cloudMonopolyBranch.setLastUpdateAt(now);

            if (id != null) {
                DatabaseHelper.update(cloudMonopolyBranch);
            } else {
                insertCloudMonopolyBranches.add(cloudMonopolyBranch);
            }
        }

        if (CollectionUtils.isNotEmpty(insertCloudMonopolyBranches)) {
            DatabaseHelper.insertAll(insertCloudMonopolyBranches);
        }

        ApiRest apiRest = new ApiRest();
        apiRest.setData(null);
        apiRest.setMessage("保存门店信息成功！");
        apiRest.setIsSuccess(true);
        return apiRest;
    }

    /**
     * 查询门店信息
     *
     * @param listBranchesModel
     * @return
     */
    @Transactional(readOnly = true)
    public ApiRest listBranches(ListBranchesModel listBranchesModel) throws IOException {
        BigInteger tenantId = listBranchesModel.getTenantId();
        SearchModel searchModel = new SearchModel(true);
        searchModel.addSearchCondition("tenant_id", Constants.SQL_OPERATION_SYMBOL_EQUALS, tenantId);
        List<CloudMonopolyBranch> cloudMonopolyBranches = DatabaseHelper.findAll(CloudMonopolyBranch.class, searchModel);

        String appKey = ConfigurationUtils.getConfigurationSafe(Constants.ELEME_APP_KEY);
        String developerId = ConfigurationUtils.getConfigurationSafe(Constants.MEI_TUAN_DEVELOPER_ID);
        String signKey = ConfigurationUtils.getConfigurationSafe(Constants.MEI_TUAN_SIGN_KEY);
        String timestamp = String.valueOf(System.currentTimeMillis());
        for (CloudMonopolyBranch cloudMonopolyBranch : cloudMonopolyBranches) {
            BigInteger id = cloudMonopolyBranch.getId();
            String state = tenantId + "Z" + id + "Z" + cloudMonopolyBranch.getElemeAccountType();
            cloudMonopolyBranch.setElemeBindLink(ElemeUtils.generateAuthorizeUrl(appKey, state, "all"));

            Map<String, String> sortedMap = new TreeMap<String, String>();
            sortedMap.put("businessId", "2");
            sortedMap.put("timestamp", timestamp);

            String meituanToken = cloudMonopolyBranch.getMeituanToken();
            if (StringUtils.isBlank(meituanToken)) {
                sortedMap.put("developerId", developerId);
                sortedMap.put("ePoiId", tenantId + "Z" + id);
                sortedMap.put("ePoiName", cloudMonopolyBranch.getName());
            } else {
                sortedMap.put("appAuthToken", meituanToken);
            }

            List<String> pairs = new ArrayList<String>();
            StringBuilder stringBuilder = new StringBuilder(signKey);
            for (Map.Entry<String, String> entry : sortedMap.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                stringBuilder.append(key).append(value);
                pairs.add(URLEncoder.encode(key, Constants.CHARSET_UTF8) + "=" + URLEncoder.encode(value, Constants.CHARSET_UTF8));
            }
            pairs.add("sign=" + DigestUtils.md5Hex(stringBuilder.toString()));

            if (StringUtils.isBlank(meituanToken)) {
                cloudMonopolyBranch.setMeiTuanBindLink("https://open-erp.meituan.com/storemap?" + StringUtils.join(pairs, "&"));
            } else {
                cloudMonopolyBranch.setMeiTuanUnbindLink("https://open-erp.meituan.com/releasebinding?" + StringUtils.join(pairs, "&"));
            }
        }

        ApiRest apiRest = new ApiRest();
        apiRest.setData(cloudMonopolyBranches);
        apiRest.setMessage("查询门店信息成功！");
        apiRest.setIsSuccess(true);
        return apiRest;
    }

    /**
     * 删除门店信息
     *
     * @param deleteBranchModel
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public ApiRest deleteBranch(DeleteBranchModel deleteBranchModel) {
        BigInteger tenantId = deleteBranchModel.getTenantId();
        BigInteger branchId = deleteBranchModel.getBranchId();

        UpdateModel updateModel = new UpdateModel(true);
        updateModel.setTableName("branch");
        updateModel.addContentValue("is_deleted", 1, "#");
        updateModel.addContentValue("last_update_at", new Date(), "#");
        updateModel.addSearchCondition("tenant_id", Constants.SQL_OPERATION_SYMBOL_EQUALS, tenantId);
        updateModel.addSearchCondition("id", Constants.SQL_OPERATION_SYMBOL_EQUALS, branchId);
        DatabaseHelper.universalUpdate(updateModel);

        ApiRest apiRest = new ApiRest();
        apiRest.setMessage("删除成功！");
        apiRest.setIsSuccess(true);
        return apiRest;
    }
}
