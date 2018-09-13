package com.repository.crm.Po;

import java.util.Date;

public class LeadsToutiao {
    private Integer id;

    private String name;

    private String phone;

    private String grade;

    private String subject;

    private String email;

    private String sex;

    private String signUpDate;

    private String area;

    private String content;

    private String moreContent;

    private String dropDown;

    private String oneChoice;

    private String moreChoice;

    private Integer status;

    private Date createDate;

    private Date updateDate;

    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getSignUpDate() {
        return signUpDate;
    }

    public void setSignUpDate(String signUpDate) {
        this.signUpDate = signUpDate == null ? null : signUpDate.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getMoreContent() {
        return moreContent;
    }

    public void setMoreContent(String moreContent) {
        this.moreContent = moreContent == null ? null : moreContent.trim();
    }

    public String getDropDown() {
        return dropDown;
    }

    public void setDropDown(String dropDown) {
        this.dropDown = dropDown == null ? null : dropDown.trim();
    }

    public String getOneChoice() {
        return oneChoice;
    }

    public void setOneChoice(String oneChoice) {
        this.oneChoice = oneChoice == null ? null : oneChoice.trim();
    }

    public String getMoreChoice() {
        return moreChoice;
    }

    public void setMoreChoice(String moreChoice) {
        this.moreChoice = moreChoice == null ? null : moreChoice.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}