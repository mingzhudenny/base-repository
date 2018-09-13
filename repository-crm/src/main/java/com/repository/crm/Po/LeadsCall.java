package com.repository.crm.Po;

import java.util.Date;

public class LeadsCall {
    private Integer id;

    private String name;

    private String phone;

    private String saleName;

    private Date distributDate;

    private Integer total;

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

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName == null ? null : saleName.trim();
    }

    public Date getDistributDate() {
        return distributDate;
    }

    public void setDistributDate(Date distributDate) {
        this.distributDate = distributDate;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}