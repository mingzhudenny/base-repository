package com.repository.xcrm.Po;

import lombok.Data;

import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-05-23 16:44
 **/
@Data
public class ClassinLessonRecordFile {
    private Integer id;
    private String courseId;
    private String classId;
    private String vurl;
    private String vst;
    private String vet;
    private String duration;
    private String fileId;
    private Date createTime;
    private Date updateTime;
}
