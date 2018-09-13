package com.repository.threeparty.constant;

import lombok.Data;

/**
 * @description：
 * @author： denny
 * @create： 2018-06-11 14:29
 **/
@Data
public class LianYinPayResponeseParams {
    /**
     * 返回code
     */
   private String code;
    /**
     * 返回具体对象
     */
   private String data;
    /**
     * 返回签名
     */
   private String sign;
    /**
     * 返回说明
     */
   private String message;

}
