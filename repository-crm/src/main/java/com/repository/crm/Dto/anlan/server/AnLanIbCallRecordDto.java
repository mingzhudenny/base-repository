package com.repository.crm.Dto.anlan.server;

import com.base.utils.validate.ValidateUtil;
import lombok.Getter;
import lombok.Setter;

/**
 * @description：安莱呼入号码
 * @author： denny
 * @create： 2018-07-12 10:54
 **/
public class AnLanIbCallRecordDto {
    /**
     * 学生姓名
     */
    @Getter
    @Setter
    private String leadsName;
    /**
     * 学生手机号码
     */
    @Getter
    @Setter
    private String leadsPhone;
    /**
     * 销售姓名
     */
    private String saleName;
    /**
     * 销售类别
     */
    @Getter
    @Setter
    private String saleType;
    /**
     * 团队名称
     */
    @Getter
    @Setter
    private String teamName;
    /**
     * 呼入时间
     */
    @Getter
    @Setter
    private String startTime;
    @Getter
    @Setter
    private String ccName;
    @Getter
    @Setter
    private String crName;

    public String getSaleName() {
        if (ValidateUtil.isNotEmpty(this.crName)) {
            this.saleName = this.crName;
        } else if (ValidateUtil.isNotEmpty(this.ccName)) {
            this.saleName = this.ccName;
        }

        return this.saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }
}


