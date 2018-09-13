package com.repository.xcrm.Po;

import java.io.Serializable;
import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-03-21 11:40
 **/
public class Leads implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String uuid;

    private String stuNo;

    private String crUuid;

    private String ccUuid;

    private String name;

    private String password;

    private String phone;

    private String grade;

    private String subject;

    private Date signupDate;

    private String contactTime;

    private String channelUuid;

    private String connectStatus;

    private Boolean isIntroduced;

    private String introducer;

    private String connectDes;

    private String jh;

    private String dy;

    private String keyNum;

    private Byte studentStatus;

    private Byte distributeStatus;

    private Boolean status;

    private Date createDate;

    private Date updateDate;

    private Integer sex;

    private Integer age;

    private String examArea;

    private Boolean isSign;

    private Boolean signStatus;

    private Date signTime;

    private String recommendCcUuid;

    private String recommendCrUuid;

    private Boolean isRecommend;

    private String recommendCcName;

    private String recommendCrName;

    private Boolean isOldData;

    private Integer isManagerCourse;

    private Integer isPay;

    private String saleUuid;

    private String gradeRank;

    private String city;

    private String province;

    private String count;

    private String school;

    private String schoolLevel;

    private Integer isHaveMic;

    private Integer isHaveHeadset;

    private Integer isHaveComputer;

    private Integer isHavePad;

    private Integer cityId;

    private Integer provinceId;

    private Integer countId;

    private String phoneLocaltion;

    private String weaknessSubject;

    private String isDebugCourse;

    private Integer isDebugging;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo == null ? null : stuNo.trim();
    }

    public String getCrUuid() {
        return crUuid;
    }

    public void setCrUuid(String crUuid) {
        this.crUuid = crUuid == null ? null : crUuid.trim();
    }

    public String getCcUuid() {
        return ccUuid;
    }

    public void setCcUuid(String ccUuid) {
        this.ccUuid = ccUuid == null ? null : ccUuid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
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

    public Date getSignupDate() {
        return signupDate;
    }

    public void setSignupDate(Date signupDate) {
        this.signupDate = signupDate;
    }

    public String getContactTime() {
        return contactTime;
    }

    public void setContactTime(String contactTime) {
        this.contactTime = contactTime == null ? null : contactTime.trim();
    }

    public String getChannelUuid() {
        return channelUuid;
    }

    public void setChannelUuid(String channelUuid) {
        this.channelUuid = channelUuid == null ? null : channelUuid.trim();
    }

    public String getConnectStatus() {
        return connectStatus;
    }

    public void setConnectStatus(String connectStatus) {
        this.connectStatus = connectStatus == null ? null : connectStatus.trim();
    }

    public Boolean getIsIntroduced() {
        return isIntroduced;
    }

    public void setIsIntroduced(Boolean isIntroduced) {
        this.isIntroduced = isIntroduced;
    }

    public String getIntroducer() {
        return introducer;
    }

    public void setIntroducer(String introducer) {
        this.introducer = introducer == null ? null : introducer.trim();
    }

    public String getConnectDes() {
        return connectDes;
    }

    public void setConnectDes(String connectDes) {
        this.connectDes = connectDes == null ? null : connectDes.trim();
    }

    public String getJh() {
        return jh;
    }

    public void setJh(String jh) {
        this.jh = jh == null ? null : jh.trim();
    }

    public String getDy() {
        return dy;
    }

    public void setDy(String dy) {
        this.dy = dy == null ? null : dy.trim();
    }

    public String getKeyNum() {
        return keyNum;
    }

    public void setKeyNum(String keyNum) {
        this.keyNum = keyNum == null ? null : keyNum.trim();
    }

    public Byte getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(Byte studentStatus) {
        this.studentStatus = studentStatus;
    }

    public Byte getDistributeStatus() {
        return distributeStatus;
    }

    public void setDistributeStatus(Byte distributeStatus) {
        this.distributeStatus = distributeStatus;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getExamArea() {
        return examArea;
    }

    public void setExamArea(String examArea) {
        this.examArea = examArea == null ? null : examArea.trim();
    }

    public Boolean getIsSign() {
        return isSign;
    }

    public void setIsSign(Boolean isSign) {
        this.isSign = isSign;
    }

    public Boolean getSignStatus() {
        return signStatus;
    }

    public void setSignStatus(Boolean signStatus) {
        this.signStatus = signStatus;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public String getRecommendCcUuid() {
        return recommendCcUuid;
    }

    public void setRecommendCcUuid(String recommendCcUuid) {
        this.recommendCcUuid = recommendCcUuid == null ? null : recommendCcUuid.trim();
    }

    public String getRecommendCrUuid() {
        return recommendCrUuid;
    }

    public void setRecommendCrUuid(String recommendCrUuid) {
        this.recommendCrUuid = recommendCrUuid == null ? null : recommendCrUuid.trim();
    }

    public Boolean getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Boolean isRecommend) {
        this.isRecommend = isRecommend;
    }

    public String getRecommendCcName() {
        return recommendCcName;
    }

    public void setRecommendCcName(String recommendCcName) {
        this.recommendCcName = recommendCcName == null ? null : recommendCcName.trim();
    }

    public String getRecommendCrName() {
        return recommendCrName;
    }

    public void setRecommendCrName(String recommendCrName) {
        this.recommendCrName = recommendCrName == null ? null : recommendCrName.trim();
    }

    public Boolean getIsOldData() {
        return isOldData;
    }

    public void setIsOldData(Boolean isOldData) {
        this.isOldData = isOldData;
    }

    public Integer getIsManagerCourse() {
        return isManagerCourse;
    }

    public void setIsManagerCourse(Integer isManagerCourse) {
        this.isManagerCourse = isManagerCourse;
    }

    public Integer getIsPay() {
        return isPay;
    }

    public void setIsPay(Integer isPay) {
        this.isPay = isPay;
    }

    public String getSaleUuid() {
        return saleUuid;
    }

    public void setSaleUuid(String saleUuid) {
        this.saleUuid = saleUuid == null ? null : saleUuid.trim();
    }

    public String getGradeRank() {
        return gradeRank;
    }

    public void setGradeRank(String gradeRank) {
        this.gradeRank = gradeRank == null ? null : gradeRank.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count == null ? null : count.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getSchoolLevel() {
        return schoolLevel;
    }

    public void setSchoolLevel(String schoolLevel) {
        this.schoolLevel = schoolLevel == null ? null : schoolLevel.trim();
    }

    public Integer getIsHaveMic() {
        return isHaveMic;
    }

    public void setIsHaveMic(Integer isHaveMic) {
        this.isHaveMic = isHaveMic;
    }

    public Integer getIsHaveHeadset() {
        return isHaveHeadset;
    }

    public void setIsHaveHeadset(Integer isHaveHeadset) {
        this.isHaveHeadset = isHaveHeadset;
    }

    public Integer getIsHaveComputer() {
        return isHaveComputer;
    }

    public void setIsHaveComputer(Integer isHaveComputer) {
        this.isHaveComputer = isHaveComputer;
    }

    public Integer getIsHavePad() {
        return isHavePad;
    }

    public void setIsHavePad(Integer isHavePad) {
        this.isHavePad = isHavePad;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCountId() {
        return countId;
    }

    public void setCountId(Integer countId) {
        this.countId = countId;
    }

    public String getPhoneLocaltion() {
        return phoneLocaltion;
    }

    public void setPhoneLocaltion(String phoneLocaltion) {
        this.phoneLocaltion = phoneLocaltion == null ? null : phoneLocaltion.trim();
    }

    public String getWeaknessSubject() {
        return weaknessSubject;
    }

    public void setWeaknessSubject(String weaknessSubject) {
        this.weaknessSubject = weaknessSubject == null ? null : weaknessSubject.trim();
    }

    public Integer getIsDebugging() {
        return isDebugging;
    }

    public void setIsDebugging(Integer isDebugging) {
        this.isDebugging = isDebugging;
    }

    public Boolean getIntroduced() {
        return isIntroduced;
    }

    public void setIntroduced(Boolean introduced) {
        isIntroduced = introduced;
    }

    public Boolean getSign() {
        return isSign;
    }

    public void setSign(Boolean sign) {
        isSign = sign;
    }

    public Boolean getRecommend() {
        return isRecommend;
    }

    public void setRecommend(Boolean recommend) {
        isRecommend = recommend;
    }

    public Boolean getOldData() {
        return isOldData;
    }

    public void setOldData(Boolean oldData) {
        isOldData = oldData;
    }

    public String getIsDebugCourse() {
        return isDebugCourse;
    }

    public void setIsDebugCourse(String isDebugCourse) {
        this.isDebugCourse = isDebugCourse;
    }
}
