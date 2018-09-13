package com.repository.crm.constant;

/**
 * @description：Crm业务监控子领域枚举
 * @author： denny
 * @create： 2018-01-24 15:12
 **/
public enum CrmChildOperationMonitorDomain {

         ONLINE_ORDER(10001,"线上订单"),
         OFFLINE_ORDER(10002,"线下订单"),
         EMPLOYEE(10003,"员工"),
         TEACHER(10004,"老师"),
         STUDENT(10005,"学生"),
         COURSE_CURRICULUM(10006,"课表"),
         COURSE_LESSON_SECTION(10007,"课节");

    CrmChildOperationMonitorDomain(Integer value, String name){
        this.name = name;
        this.value = value;
    }
    private String name;
    private Integer value;

    public Integer getValue() {
        return value;
    }
    public String getName() {
        return name;
    }

    public static CrmChildOperationMonitorDomain findByValue(Integer value) {
        switch (value) {
            case 10001:
                return ONLINE_ORDER;
            case 10002:
                return OFFLINE_ORDER;
            case 10003:
                return EMPLOYEE;
            case 10004:
                return TEACHER;
            case 10005:
                return STUDENT;
            case 10006:
                return COURSE_CURRICULUM;
            case 10007:
                return COURSE_LESSON_SECTION;
            default:
                return null;
        }
    }

}
