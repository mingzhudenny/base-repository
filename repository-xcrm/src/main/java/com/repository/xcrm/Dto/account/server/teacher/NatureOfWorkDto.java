package com.repository.xcrm.Dto.account.server.teacher;

import java.io.Serializable;

/**
 * @description：老师工作性质
 * @author： denny
 * @create： 2018-03-20 17:41
 **/
public class NatureOfWorkDto implements Serializable{
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String atureOfWork;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getAtureOfWork() {
        return atureOfWork;
    }
    public void setAtureOfWork(String atureOfWork) {
        this.atureOfWork = atureOfWork;
    }
    @Override
    public String toString() {
        return "NatureOfWorkVo [id=" + id + ", atureOfWork=" + atureOfWork + ", getId()=" + getId()
                + ", getAtureOfWork()=" + getAtureOfWork() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }
}
