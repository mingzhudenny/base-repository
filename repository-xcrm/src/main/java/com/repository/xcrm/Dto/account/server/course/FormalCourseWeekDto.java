package com.repository.xcrm.Dto.account.server.course;

import com.base.utils.validate.ValidateUtil;

/**
 * @description：
 * @author： denny
 * @create： 2018-03-21 11:22
 **/
public class FormalCourseWeekDto {

    private String nextFirstDay;
    private String nextFirstDayWeek;
    private String nextSecondDay;
    private String nextSecondDayWeek;
    private String nextThreeDay;
    private String nextThreeDayWeek;
    private String nextFourDay;
    private String nextFourDayWeek;
    private String nextFiveDay;
    private String nextFiveDayWeek;
    private String nextSixDay;
    private String nextSixDayWeek;
    private String nextSevenDay;
    private String nextSevenDayWeek;
    @Override
    public String toString() {
        return "FormalCourseWeekVo [nextFirstDay=" + nextFirstDay + ", nextFirstDayWeek=" + nextFirstDayWeek
                + ", nextSecondDay=" + nextSecondDay + ", nextSecondDayWeek=" + nextSecondDayWeek + ", nextThreeDay="
                + nextThreeDay + ", nextThreeDayWeek=" + nextThreeDayWeek + ", nextFourDay=" + nextFourDay
                + ", nextFourDayWeek=" + nextFourDayWeek + ", nextFiveDay=" + nextFiveDay + ", nextFiveDayWeek="
                + nextFiveDayWeek + ", nextSixDay=" + nextSixDay + ", nextSixDayWeek=" + nextSixDayWeek
                + ", nextSevenDay=" + nextSevenDay + ", nextSevenDayWeek=" + nextSevenDayWeek + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }
    public String getNextFirstDay() {
        return nextFirstDay;
    }
    public void setNextFirstDay(String nextFirstDay) {
        this.nextFirstDay = nextFirstDay;
    }
    public String getNextFirstDayWeek() {
        return parseWeek(nextFirstDayWeek);
    }
    public void setNextFirstDayWeek(String nextFirstDayWeek) {
        this.nextFirstDayWeek = nextFirstDayWeek;
    }
    public String getNextSecondDay() {
        return nextSecondDay;
    }
    public void setNextSecondDay(String nextSecondDay) {
        this.nextSecondDay = nextSecondDay;
    }
    public String getNextSecondDayWeek() {
        return parseWeek(nextSecondDayWeek);
    }
    public void setNextSecondDayWeek(String nextSecondDayWeek) {
        this.nextSecondDayWeek = nextSecondDayWeek;
    }
    public String getNextThreeDay() {
        return nextThreeDay;
    }
    public void setNextThreeDay(String nextThreeDay) {
        this.nextThreeDay = nextThreeDay;
    }
    public String getNextThreeDayWeek() {
        return parseWeek(nextThreeDayWeek);
    }
    public void setNextThreeDayWeek(String nextThreeDayWeek) {
        this.nextThreeDayWeek = nextThreeDayWeek;
    }
    public String getNextFourDay() {
        return nextFourDay;
    }
    public void setNextFourDay(String nextFourDay) {
        this.nextFourDay = nextFourDay;
    }
    public String getNextFourDayWeek() {
        return parseWeek(nextFourDayWeek);
    }
    public void setNextFourDayWeek(String nextFourDayWeek) {
        this.nextFourDayWeek = nextFourDayWeek;
    }
    public String getNextFiveDay() {
        return nextFiveDay;
    }
    public void setNextFiveDay(String nextFiveDay) {
        this.nextFiveDay = nextFiveDay;
    }
    public String getNextFiveDayWeek() {
        return parseWeek(nextFiveDayWeek);
    }
    public void setNextFiveDayWeek(String nextFiveDayWeek) {
        this.nextFiveDayWeek = nextFiveDayWeek;
    }
    public String getNextSixDay() {
        return nextSixDay;
    }
    public void setNextSixDay(String nextSixDay) {
        this.nextSixDay = nextSixDay;
    }
    public String getNextSixDayWeek() {
        return parseWeek(nextSixDayWeek);
    }
    public void setNextSixDayWeek(String nextSixDayWeek) {
        this.nextSixDayWeek = nextSixDayWeek;
    }
    public String getNextSevenDay() {
        return nextSevenDay;
    }
    public void setNextSevenDay(String nextSevenDay) {
        this.nextSevenDay = nextSevenDay;
    }
    public String getNextSevenDayWeek() {
        return parseWeek(nextSevenDayWeek);
    }
    public void setNextSevenDayWeek(String nextSevenDayWeek) {
        this.nextSevenDayWeek = nextSevenDayWeek;
    }

    public String parseWeek(String week){
        if(ValidateUtil.isNotEmpty(week)){
            if(week.equals("星期一")){
                return "一";
            }else if(week.equals("Monday")){
                return "一";
            }else if(week.equals("星期二")){
                return "二";
            }else if(week.equals("Tuesday")){
                return "二";
            }else if(week.equals("星期三")){
                return "三";
            }else if(week.equals("Wednesday")){
                return "三";
            }else if(week.equals("星期四")){
                return "四";
            }else if(week.equals("Thursday")){
                return "四";
            }else if(week.equals("星期五")){
                return "五";
            }else if(week.equals("Friday")){
                return "五";
            }else if(week.equals("星期六")){
                return "六";
            }else if(week.equals("Saturday")){
                return "六";
            }else if(week.equals("星期日")){
                return "七";
            }else if(week.equals("Sunday")){
                return "七";
            }
        }
        return "暂无";
    }
}
