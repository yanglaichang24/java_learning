package yang.dao.model;

import java.io.Serializable;
import java.util.Date;

public class AccountModel implements Serializable {
    private Long id;

    private Integer mediaId;

    private String platformAccountId;

    private String accountName;

    private Short optStatus;

    private Short status;

    private Double addedPayment;

    private Double balance;

    private Double budget;

    private Short budgetMode;

    private String regionTarget;

    private String excludeIp;

    private String budgetOfflineTime;

    private String regionPriceFactor;

    private Short userLevel;

    private Date createTime;

    private Date updateTime;

    private Date mediaCreateTime;

    private Date mediaUpdateTime;

    private String operator;

    private Byte syncStatus;

    private String syncFailure;

    private Date syncTime;

    private Boolean deleted;

    private String creator;

    private String mediaInfo;

    private Short bg;

    private Long tenantId;

    private String app;

    private String platform;

    private Integer deliveryId;

    private Integer cityTypeId;

    private String bgAlias;

    private String manager;

    private Integer managerId;

    private String maincate;

    private Integer maincateId;

    private Integer adtypeId;

    private Integer resourceId;

    private Long superAccountId;

    private String authInfo;

    private Long createUserId;

    private Long updateUserId;

    private String bgDirection;

    private Integer bgDirectionId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMediaId() {
        return mediaId;
    }

    public void setMediaId(Integer mediaId) {
        this.mediaId = mediaId;
    }

    public String getPlatformAccountId() {
        return platformAccountId;
    }

    public void setPlatformAccountId(String platformAccountId) {
        this.platformAccountId = platformAccountId == null ? null : platformAccountId.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public Short getOptStatus() {
        return optStatus;
    }

    public void setOptStatus(Short optStatus) {
        this.optStatus = optStatus;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Double getAddedPayment() {
        return addedPayment;
    }

    public void setAddedPayment(Double addedPayment) {
        this.addedPayment = addedPayment;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public Short getBudgetMode() {
        return budgetMode;
    }

    public void setBudgetMode(Short budgetMode) {
        this.budgetMode = budgetMode;
    }

    public String getRegionTarget() {
        return regionTarget;
    }

    public void setRegionTarget(String regionTarget) {
        this.regionTarget = regionTarget == null ? null : regionTarget.trim();
    }

    public String getExcludeIp() {
        return excludeIp;
    }

    public void setExcludeIp(String excludeIp) {
        this.excludeIp = excludeIp == null ? null : excludeIp.trim();
    }

    public String getBudgetOfflineTime() {
        return budgetOfflineTime;
    }

    public void setBudgetOfflineTime(String budgetOfflineTime) {
        this.budgetOfflineTime = budgetOfflineTime == null ? null : budgetOfflineTime.trim();
    }

    public String getRegionPriceFactor() {
        return regionPriceFactor;
    }

    public void setRegionPriceFactor(String regionPriceFactor) {
        this.regionPriceFactor = regionPriceFactor == null ? null : regionPriceFactor.trim();
    }

    public Short getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Short userLevel) {
        this.userLevel = userLevel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getMediaCreateTime() {
        return mediaCreateTime;
    }

    public void setMediaCreateTime(Date mediaCreateTime) {
        this.mediaCreateTime = mediaCreateTime;
    }

    public Date getMediaUpdateTime() {
        return mediaUpdateTime;
    }

    public void setMediaUpdateTime(Date mediaUpdateTime) {
        this.mediaUpdateTime = mediaUpdateTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Byte getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(Byte syncStatus) {
        this.syncStatus = syncStatus;
    }

    public String getSyncFailure() {
        return syncFailure;
    }

    public void setSyncFailure(String syncFailure) {
        this.syncFailure = syncFailure == null ? null : syncFailure.trim();
    }

    public Date getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Date syncTime) {
        this.syncTime = syncTime;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getMediaInfo() {
        return mediaInfo;
    }

    public void setMediaInfo(String mediaInfo) {
        this.mediaInfo = mediaInfo == null ? null : mediaInfo.trim();
    }

    public Short getBg() {
        return bg;
    }

    public void setBg(Short bg) {
        this.bg = bg;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app == null ? null : app.trim();
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Integer getCityTypeId() {
        return cityTypeId;
    }

    public void setCityTypeId(Integer cityTypeId) {
        this.cityTypeId = cityTypeId;
    }

    public String getBgAlias() {
        return bgAlias;
    }

    public void setBgAlias(String bgAlias) {
        this.bgAlias = bgAlias == null ? null : bgAlias.trim();
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager == null ? null : manager.trim();
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getMaincate() {
        return maincate;
    }

    public void setMaincate(String maincate) {
        this.maincate = maincate == null ? null : maincate.trim();
    }

    public Integer getMaincateId() {
        return maincateId;
    }

    public void setMaincateId(Integer maincateId) {
        this.maincateId = maincateId;
    }

    public Integer getAdtypeId() {
        return adtypeId;
    }

    public void setAdtypeId(Integer adtypeId) {
        this.adtypeId = adtypeId;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public Long getSuperAccountId() {
        return superAccountId;
    }

    public void setSuperAccountId(Long superAccountId) {
        this.superAccountId = superAccountId;
    }

    public String getAuthInfo() {
        return authInfo;
    }

    public void setAuthInfo(String authInfo) {
        this.authInfo = authInfo == null ? null : authInfo.trim();
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getBgDirection() {
        return bgDirection;
    }

    public void setBgDirection(String bgDirection) {
        this.bgDirection = bgDirection == null ? null : bgDirection.trim();
    }

    public Integer getBgDirectionId() {
        return bgDirectionId;
    }

    public void setBgDirectionId(Integer bgDirectionId) {
        this.bgDirectionId = bgDirectionId;
    }
}