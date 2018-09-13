package com.repository.crm.Po;

import lombok.Data;

import java.util.Date;

@Data
public class AnlanCallRecordFile {
    private Long id;

    private String userLogin;

    private String uniqueId;

    private String ossKey;

    private Integer status;

    private String createUserId;

    private String updateUserId;

    private Date createDate;

    private Date updateDate;
}