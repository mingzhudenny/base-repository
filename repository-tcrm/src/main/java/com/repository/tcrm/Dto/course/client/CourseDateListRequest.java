package com.repository.tcrm.Dto.course.client;


import java.util.List;

/**
 * @Author ywj
 * <p>
 */
public class CourseDateListRequest extends BaseRequest {
//    @NotBlank(message = "课程日期不可为空！")
//    @Pattern(regexp = "^(\\d{4}-\\d{2}-\\d{2})|$", message = "课程日期格式错误，正确格式：yyyy-MM-dd")
    private List<String> courseDateList;    //课程日期集合，格式：yyyy-MM-dd

    public List<String> getCourseDateList() {
        return courseDateList;
    }

    public void setCourseDateList(List<String> courseDateList) {
        this.courseDateList = courseDateList;
    }

    @Override
    public String toString() {
        return "CourseDateListRequest{" +
                "courseDateList=" + courseDateList +
                "} " + super.toString();
    }
}
