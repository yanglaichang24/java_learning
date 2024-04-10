package com.bj58.lianmeng.td.promotion.lib.dao.model;

import java.io.Serializable;
import java.util.Date;

public class ImageModel implements Serializable {
    private Long id;

    private Integer mediaId;

    private String platformAccountId;

    private Byte pause;

    private Short status;

    private Date createTime;

    private Date updateTime;

    private Date mediaCreateTime;

    private Date mediaUpdateTime;

    private String operator;

    private Byte syncStatus;

    private String syncFailure;

    private Date syncTime;

    private Byte isDeleted;

    private String creator;

    private String mediaInfo;

    private String imageId;

    private String imageName;

    private Integer sourceType;

    private Integer width;

    private Integer height;

    private Integer size;

    private String url;

    private String format;

    private String signature;

    private Byte isCollect;

    private String platformMaterialId;

    private Byte materialType;

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

    public Byte getPause() {
        return pause;
    }

    public void setPause(Byte pause) {
        this.pause = pause;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
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

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
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

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId == null ? null : imageId.trim();
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName == null ? null : imageName.trim();
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format == null ? null : format.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public Byte getIsCollect() {
        return isCollect;
    }

    public void setIsCollect(Byte isCollect) {
        this.isCollect = isCollect;
    }

    public String getPlatformMaterialId() {
        return platformMaterialId;
    }

    public void setPlatformMaterialId(String platformMaterialId) {
        this.platformMaterialId = platformMaterialId == null ? null : platformMaterialId.trim();
    }

    public Byte getMaterialType() {
        return materialType;
    }

    public void setMaterialType(Byte materialType) {
        this.materialType = materialType;
    }
}