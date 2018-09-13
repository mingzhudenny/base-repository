package com.repository.tcrm.Po;

import java.util.Date;

/**
 * 课件图片表
 * @author ywj
 * Created by ywj on 2018/04/09
 */
public class CoursewareImage  {
    /**  */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = -7178280406624223698L;

	private Long id;

    private String coursewareImageUuid;

    /**
     * 课件uuid
     */
    private String coursewareUuid;

    /**
     * 图片url
     */
    private String imageUrl;

    /**
     * 服务器路径
     */
    private String imagePath;

    /**
     * 图片名称
     */
    private String imageName;
    
    /**
     * 图片内容MD5加密后的值
     */
    private String imageMd5;

    /**
     * 宽
     */
    private Integer width;

    /**
     * 高
     */
    private Integer height;

    /**
     * 状态:0:删除，1：正常
     */
    private Integer status;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建人uuid
     */
    private String createUid;

    /**
     * 更新人uuid
     */
    private String updateUid;

    
    public String getImageMd5() {
		return imageMd5;
	}

	public void setImageMd5(String imageMd5) {
		this.imageMd5 = imageMd5;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCoursewareImageUuid() {
        return coursewareImageUuid;
    }

    public void setCoursewareImageUuid(String coursewareImageUuid) {
        this.coursewareImageUuid = coursewareImageUuid == null ? null : coursewareImageUuid.trim();
    }

    public String getCoursewareUuid() {
        return coursewareUuid;
    }

    public void setCoursewareUuid(String coursewareUuid) {
        this.coursewareUuid = coursewareUuid == null ? null : coursewareUuid.trim();
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath == null ? null : imagePath.trim();
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName == null ? null : imageName.trim();
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public String getCreateUid() {
        return createUid;
    }

    public void setCreateUid(String createUid) {
        this.createUid = createUid == null ? null : createUid.trim();
    }

    public String getUpdateUid() {
        return updateUid;
    }

    public void setUpdateUid(String updateUid) {
        this.updateUid = updateUid == null ? null : updateUid.trim();
    }
}