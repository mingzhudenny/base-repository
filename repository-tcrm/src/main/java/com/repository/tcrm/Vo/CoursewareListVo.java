package com.repository.tcrm.Vo;

import java.util.List;

/**
 * @Author ywj
 * <p>
 * Created by ywj on 2018/4/8.
 */
public class CoursewareListVo {
    private List<CoursewareDirVo> coursewareDirList;
    private List<CoursewareVo> coursewareList;

    public List<CoursewareDirVo> getCoursewareDirList() {
        return coursewareDirList;
    }

    public void setCoursewareDirList(List<CoursewareDirVo> coursewareDirList) {
        this.coursewareDirList = coursewareDirList;
    }

    public List<CoursewareVo> getCoursewareList() {
        return coursewareList;
    }

    public void setCoursewareList(List<CoursewareVo> coursewareList) {
        this.coursewareList = coursewareList;
    }
}
