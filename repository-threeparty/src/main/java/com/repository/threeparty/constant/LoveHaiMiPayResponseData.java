package com.repository.threeparty.constant;

import lombok.Data;

/**
 * @description：
 * @author： denny
 * @create： 2018-06-21 14:50
 **/
@Data
public class LoveHaiMiPayResponseData {
    private String code;
    private String desc;
    private String access_token;
    private String content;
    private String pageInfo;
}
