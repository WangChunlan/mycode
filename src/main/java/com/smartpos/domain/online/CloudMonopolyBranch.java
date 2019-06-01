package com.smartpos.domain.online;



import com.smartpos.annotations.Table;
import com.smartpos.annotations.Transient;

import java.math.BigInteger;
import java.util.Date;

/**
 * Created by liuyandong on 2019-05-20.
 */
@Table(name = "branch")
public class CloudMonopolyBranch {
    /**
     * ID
     */
    private BigInteger id;

    /**
     * 商户ID
     */
    private BigInteger tenantId;

    /**
     * 0总部1配送中心2直营店3加盟店4积分商城5农贸市场6农贸档口
     */
    private Integer branchType;

    /**
     * 状态0 停用1启用
     */
    private Integer status;

    /**
     * 门店名称
     */
    private String name;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 惠商+外卖推送地址
     */
    private String pushUrl;

    /**
     * 联系人
     */
    private String contacts;

    /**
     * 门店编码
     */
    private String code;

    /**
     * 备注
     */
    private String memo;

    /**
     * 饿了么账号类型，1-连锁账号，2-独立账号
     */
    private Integer elemeAccountType;

    private String meituanToken;

    private BigInteger shopId;
    private String meituanBusiness;

    /**
     * 是否开启订单推送
     */
    private boolean pushed;
    private Date createAt;
    private String createBy;
    private Date lastUpdateAt;
    private String lastUpdateBy;
    private boolean isDeleted;

    @Transient
    private String elemeBindLink;
    @Transient
    private String meiTuanBindLink;
    @Transient
    private String meiTuanUnbindLink;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getTenantId() {
        return tenantId;
    }

    public void setTenantId(BigInteger tenantId) {
        this.tenantId = tenantId;
    }

    public Integer getBranchType() {
        return branchType;
    }

    public void setBranchType(Integer branchType) {
        this.branchType = branchType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getMeituanToken() {
        return meituanToken;
    }

    public void setMeituanToken(String meituanToken) {
        this.meituanToken = meituanToken;
    }

    public BigInteger getShopId() {
        return shopId;
    }

    public void setShopId(BigInteger shopId) {
        this.shopId = shopId;
    }

    public String getMeituanBusiness() {
        return meituanBusiness;
    }

    public void setMeituanBusiness(String meituanBusiness) {
        this.meituanBusiness = meituanBusiness;
    }

    public boolean isPushed() {
        return pushed;
    }

    public void setPushed(boolean pushed) {
        this.pushed = pushed;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getLastUpdateAt() {
        return lastUpdateAt;
    }

    public void setLastUpdateAt(Date lastUpdateAt) {
        this.lastUpdateAt = lastUpdateAt;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getElemeBindLink() {
        return elemeBindLink;
    }

    public void setElemeBindLink(String elemeBindLink) {
        this.elemeBindLink = elemeBindLink;
    }

    public String getMeiTuanBindLink() {
        return meiTuanBindLink;
    }

    public void setMeiTuanBindLink(String meiTuanBindLink) {
        this.meiTuanBindLink = meiTuanBindLink;
    }

    public String getMeiTuanUnbindLink() {
        return meiTuanUnbindLink;
    }

    public void setMeiTuanUnbindLink(String meiTuanUnbindLink) {
        this.meiTuanUnbindLink = meiTuanUnbindLink;
    }

    public static class Builder {
        private final CloudMonopolyBranch instance = new CloudMonopolyBranch();

        public Builder id(BigInteger id) {
            instance.setId(id);
            return this;
        }

        public Builder tenantId(BigInteger tenantId) {
            instance.setTenantId(tenantId);
            return this;
        }

        public Builder branchType(Integer branchType) {
            instance.setBranchType(branchType);
            return this;
        }

        public Builder status(Integer status) {
            instance.setStatus(status);
            return this;
        }

        public Builder name(String name) {
            instance.setName(name);
            return this;
        }

        public Builder phone(String phone) {
            instance.setPhone(phone);
            return this;
        }

        public Builder pushUrl(String pushUrl) {
            instance.setPushUrl(pushUrl);
            return this;
        }

        public Builder contacts(String contacts) {
            instance.setContacts(contacts);
            return this;
        }

        public Builder code(String code) {
            instance.setCode(code);
            return this;
        }

        public Builder memo(String memo) {
            instance.setMemo(memo);
            return this;
        }

        public Builder elemeAccountType(Integer elemeAccountType) {
            instance.setElemeAccountType(elemeAccountType);
            return this;
        }

        public Builder meituanToken(String meituanToken) {
            instance.setMeituanToken(meituanToken);
            return this;
        }

        public Builder shopId(BigInteger shopId) {
            instance.setShopId(shopId);
            return this;
        }

        public Builder meituanBusiness(String meituanBusiness) {
            instance.setMeituanBusiness(meituanBusiness);
            return this;
        }

        public Builder pushed(boolean pushed) {
            instance.setPushed(pushed);
            return this;
        }

        public Builder createAt(Date createAt) {
            instance.setCreateAt(createAt);
            return this;
        }

        public Builder createBy(String createBy) {
            instance.setCreateBy(createBy);
            return this;
        }

        public Builder lastUpdateAt(Date lastUpdateAt) {
            instance.setLastUpdateAt(lastUpdateAt);
            return this;
        }

        public Builder lastUpdateBy(String lastUpdateBy) {
            instance.setLastUpdateBy(lastUpdateBy);
            return this;
        }

        public Builder isDeleted(boolean isDeleted) {
            instance.setIsDeleted(isDeleted);
            return this;
        }

        public CloudMonopolyBranch build() {
            CloudMonopolyBranch cloudMonopolyBranch = new CloudMonopolyBranch();
            cloudMonopolyBranch.setId(instance.getId());
            cloudMonopolyBranch.setTenantId(instance.getTenantId());
            cloudMonopolyBranch.setBranchType(instance.getBranchType());
            cloudMonopolyBranch.setStatus(instance.getStatus());
            cloudMonopolyBranch.setName(instance.getName());
            cloudMonopolyBranch.setPhone(instance.getPhone());
            cloudMonopolyBranch.setPushUrl(instance.getPushUrl());
            cloudMonopolyBranch.setContacts(instance.getContacts());
            cloudMonopolyBranch.setCode(instance.getCode());
            cloudMonopolyBranch.setMemo(instance.getMemo());
            cloudMonopolyBranch.setElemeAccountType(instance.getElemeAccountType());
            cloudMonopolyBranch.setMeituanToken(instance.getMeituanToken());
            cloudMonopolyBranch.setShopId(instance.getShopId());
            cloudMonopolyBranch.setMeituanBusiness(instance.getMeituanBusiness());
            cloudMonopolyBranch.setPushed(instance.isPushed());
            cloudMonopolyBranch.setCreateAt(instance.getCreateAt());
            cloudMonopolyBranch.setCreateBy(instance.getCreateBy());
            cloudMonopolyBranch.setLastUpdateAt(instance.getLastUpdateAt());
            cloudMonopolyBranch.setLastUpdateBy(instance.getLastUpdateBy());
            cloudMonopolyBranch.setIsDeleted(instance.getIsDeleted());
            return cloudMonopolyBranch;
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
