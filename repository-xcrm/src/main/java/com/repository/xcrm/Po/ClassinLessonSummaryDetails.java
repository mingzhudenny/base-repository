package com.repository.xcrm.Po;

import lombok.Data;

import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-05-23 16:46
 **/
@Data
public class ClassinLessonSummaryDetails {
   private Integer id;
   private String classId;
   private String courseId;
   private String closeTime;
   private String startTime;
   private String stageUid;
   private String downCount;
   private String upTotal;
   private String upCount;
   private String downTotal;
   private String handsUpUid;
   private String handsUpCtime;
   private String handsUpTotal;
   private String inoutUid;
   private String inoutTotal;
   private String inoutType;
   private String inoutTime;
   private String inoutIdentity;
   private String awardUid;
   private String awardTotal;
   private String timerCount;
   private String mutePersons;
   private String personsTotal;
   private String muteCount;
   private String muteTotal;
   private String smallBoardCount;
   private String smallBoardTotal;
   private String smallBoardPeriod;
   private String smallBoardDcount;
   private String authorizeUid;
   private String authorizeCount;
   private String authorizeTotal;
   private String diceCount;
   private String answerCount;
   private String answerAverageAccuracy;
   private String answersUid;
   private String answersSelectedItem;
   private String answersLastCommitTime;
   private String answersRecvQuestionTime;
   private String participantsIdentity;
   private String participantsUid;
   private String correctItems;
   private String participantsShowName;
   private String accuracy;
   private String screenShareCount;
   private String screenShareTotal;
   private String screenSharepriod;
   private String responderCount;
   private String responderPersonsUid;
   private String responderPersonsCount;
   private String responderPersonsScount;
   private String kickOutUid;
   private String kickOutDuration;
   private String kickOutTime;
   private String shareWidgetFilesEndTime;
   private String shareWidgetFilesStartTime;
   private String shareWidgetFilesFileName;
   private String shareWidgetCount;
   private String shareWidgetTotal;
   private Date createTime;
   private Date updateTime;
}
