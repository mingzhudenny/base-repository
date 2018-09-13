package com.repository.xcrm.Dto.account.server.teacher;

import java.io.Serializable;

/**
 * @description：老师在classIn下账号信息
 * @author： denny
 * @create： 2018-03-20 17:43
 **/
public class TeacherClassInDto extends TeacherDto implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 老师科目
     */
    private String subject;
    /**
     * 机构和老师的关系 ID
     */
    private String classInId;

    /**
     *老师常用的联系电话
     */
    private String contactInformation;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getClassInId() {
        return classInId;
    }

    public void setClassInId(String classInId) {
        this.classInId = classInId;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    @Override
    public String toString() {
        return "TeacherClassInDto{" +
                "subject='" + subject + '\'' +
                ", classInId='" + classInId + '\'' +
                ", contactInformation='" + contactInformation + '\'' +
                '}';
    }
}
