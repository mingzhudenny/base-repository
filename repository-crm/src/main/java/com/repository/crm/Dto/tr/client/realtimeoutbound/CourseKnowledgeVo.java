package com.repository.crm.Dto.tr.client.realtimeoutbound;

/**
 * @Author shitongtong
 * <p>
 * Created by shitongtong on 2017/4/13.
 */
public class CourseKnowledgeVo {
    private String value;   //CourseKnowledgeUuid
    private String label;   //CourseKnowledgeName
    private String subject;
    private Object children;

    public Object getChildren() {
        return children;
    }

    public void setChildren(Object children) {
        this.children = children;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
