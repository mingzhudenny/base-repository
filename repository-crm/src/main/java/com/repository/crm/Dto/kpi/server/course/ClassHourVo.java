/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.kpi.server.course;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <pre>
 * 合肥-老师课表订单 -课程消耗
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: ClassHourVo.java, v 0.1 2018年6月26日 下午5:21:18  Exp $
 */
public class ClassHourVo {
	
	private String courseOrderUuid;
	/** 总课时  (cp_course 累加统计得来)*/
	private Double sunClassHour;
	 /** 消耗课时  (cp_pay_request 累加统计得来)*/     
    private Double consumeLength;
	/** 购买课时*/
	private Double buyClassHour;
	/** 赠送课时*/
	private Double giveClassHour;
	/** 剩余*/
	@SuppressWarnings("unused")
	private Double surplusClassHour;
	/** 课时包 */
	private String priceType;
	/** 提交业绩时间  */
	private Date createDate;
	/** 签单人  */
	private String createUser;
	public String getCourseOrderUuid() {
		return courseOrderUuid;
	}
	public void setCourseOrderUuid(String courseOrderUuid) {
		this.courseOrderUuid = courseOrderUuid;
	}
	//如果 consumeLength 有，consumeLength 就是总课时数量
	// 否则就算计总课时
	public Double getSunClassHour() {
		
		if (consumeLength !=null){
			
			return consumeLength;
           
        }else if (sunClassHour !=null){
            double i=60;
            sunClassHour = sunClassHour/i;//得到小时
            //保留两位小数
            BigDecimal bg = new BigDecimal(sunClassHour);
            sunClassHour = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            return sunClassHour;
        }else {
            return Double.valueOf(0);
        }
	}
	public void setSunClassHour(Double sunClassHour) {
		this.sunClassHour = sunClassHour;
	}
	//计算消耗购买课时
	public Double getBuyClassHour() {
		
		 if(buyClassHour == null){
	            buyClassHour = Double.valueOf(0);
	        }
	        if(giveClassHour == null){
	            giveClassHour = Double.valueOf(0);
	        }

	        if (consumeLength == null){
	            if (sunClassHour == null){
	                sunClassHour = Double.valueOf(0);
	            }else {
	               if (sunClassHour>buyClassHour){
	                   //消耗购买课时
	                   return   buyClassHour;
	               }else {
	                   return sunClassHour;
	               }
	            }
	        }else {
	            if (consumeLength>buyClassHour){
	                //消耗购买课时
	               return  buyClassHour;
	            }else {
	                return  consumeLength;
	            }
	        }
	        return sunClassHour;
		
		
	}
	
	public void setBuyClassHour(Double buyClassHour) {
		this.buyClassHour = buyClassHour;
	}
	//计算消耗赠送课时
	public Double getGiveClassHour() {
		
	    if(buyClassHour == null){
	    	
            buyClassHour = Double.valueOf(0);
        }
        if(giveClassHour == null){
        	
            giveClassHour = Double.valueOf(0);
        }

        if (consumeLength == null){
        	
            if (consumeLength == null){
            	
                consumeLength = Double.valueOf(0);
                
            }else {
            	
                if (consumeLength>buyClassHour&&giveClassHour>0){
                    //消耗赠送课时
                    giveClassHour = consumeLength-(buyClassHour+giveClassHour);
                    if (giveClassHour>giveClassHour){
                    	
                         return giveClassHour;
                         
                    }else {
                    	
                        return  consumeLength-buyClassHour;
                    }
                }
            }
            
        }else {
        	
            if (consumeLength>buyClassHour&&giveClassHour>0){
                //消耗赠送课时
                giveClassHour = consumeLength-(buyClassHour+giveClassHour);
                if (giveClassHour>giveClassHour){
                    return giveClassHour;
                }else {
                    return  giveClassHour=consumeLength-buyClassHour;
                }
            }
        }
        return   Double.valueOf(0);
		
	}
	public void setGiveClassHour(Double giveClassHour) {
		this.giveClassHour = giveClassHour;
	}
	public Double getSurplusClassHour() {
		
		 if(buyClassHour == null){
	            buyClassHour = Double.valueOf(0);
	        }
	        if(giveClassHour == null){
	            giveClassHour = Double.valueOf(0);
	        }

	        if (consumeLength == null){
	            if (sunClassHour == null){
	                sunClassHour = Double.valueOf(0);
	            }
	        }else {
	            return  (buyClassHour+giveClassHour)-consumeLength;
	        }
	        return  (buyClassHour+giveClassHour)-sunClassHour;
		
	}
	public void setSurplusClassHour(Double surplusClassHour) {
		this.surplusClassHour = surplusClassHour;
	}
	public String getPriceType() {
		return priceType;
	}
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	

}
