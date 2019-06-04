package com.smartpos.model.cloudmonopoly;

import com.smartpos.utils.ApplicationHandler;
import com.smartpos.utils.BasicModel;

import org.apache.commons.lang.ArrayUtils;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.math.BigInteger;
import java.util.List;

/**
 * Created by liuyandong on 2019-05-15.
 */
public class BatchSaveBranchModel extends BasicModel {
    @NotNull
    private BigInteger tenantId;

    @NotEmpty
    private List<BranchInfo> branchInfos;

    public List<BranchInfo> getBranchInfos() {
        return branchInfos;
    }

    public void setBranchInfos(List<BranchInfo> branchInfos) {
        this.branchInfos = branchInfos;
    }

    public BigInteger getTenantId() {
        return tenantId;
    }

    public void setTenantId(BigInteger tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public void validateAndThrow() {
        super.validateAndThrow();
        for (BranchInfo branchInfo : branchInfos) {
            ApplicationHandler.isTrue(branchInfo.validate(), "branchInfos");
        }
    }

    public static class BranchInfo extends BasicModel {
        private BigInteger id;
        @NotNull
        @Length(max = 20)
        private String name;

        @Length(max = 20)
        private String phone;

        @NotNull
        @Length(max = 255)
        private String pushUrl;

        @Length(max = 20)
        private String contacts;

        @NotNull
        @Length(max = 20)
        private String code;

        @Length(max = 255)
        private String memo;

        @NotNull
        private Integer elemeAccountType;

        @NotNull
        private Boolean pushed;

        public BigInteger getId() {
            return id;
        }

        public void setId(BigInteger id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getPushUrl() {
            return pushUrl;
        }

        public void setPushUrl(String pushUrl) {
            this.pushUrl = pushUrl;
        }

        public String getContacts() {
            return contacts;
        }

        public void setContacts(String contacts) {
            this.contacts = contacts;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMemo() {
            return memo;
        }

        public void setMemo(String memo) {
            this.memo = memo;
        }

        public Integer getElemeAccountType() {
            return elemeAccountType;
        }

        public void setElemeAccountType(Integer elemeAccountType) {
            this.elemeAccountType = elemeAccountType;
        }

        public Boolean getPushed() {
            return pushed;
        }

        public void setPushed(Boolean pushed) {
            this.pushed = pushed;
        }

        @Override
        public boolean validate() {
            return super.validate() && ArrayUtils.contains(new Integer[]{1, 2}, elemeAccountType);
        }
    }
}
