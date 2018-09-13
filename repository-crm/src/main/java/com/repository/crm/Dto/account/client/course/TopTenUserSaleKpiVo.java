package com.repository.crm.Dto.account.client.course;

import com.base.utils.validate.ValidateUtil;

public class TopTenUserSaleKpiVo  implements Comparable<TopTenUserSaleKpiVo>{

	private String userUuid;
	private String userName;
	private String teamUuid;
	private String teamName;
	private String sumRealityMonery;
	
	@Override
	public String toString() {
		return "TopTenUserSaleKpiVo [userUuid=" + userUuid + ", userName=" + userName + ", teamName=" + teamName
				+ ", sumRealityMonery=" + sumRealityMonery + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public String getTeamUuid() {
		return teamUuid;
	}

	public void setTeamUuid(String teamUuid) {
		this.teamUuid = teamUuid;
	}

	public String getUserUuid() {
		return userUuid;
	}

	public void setUserUuid(String userUuid) {
		this.userUuid = userUuid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getSumRealityMonery() {
		return sumRealityMonery;
	}

	public void setSumRealityMonery(String sumRealityMonery) {
		this.sumRealityMonery = sumRealityMonery;
	}

	@Override
	public int compareTo(TopTenUserSaleKpiVo o) {
 		double RealityMoneryDes;
 		double realityMonerySrc;
        if(!ValidateUtil.isNotEmpty(this.getSumRealityMonery())){
        	RealityMoneryDes = 0;
 		}else{
 			RealityMoneryDes = Double.valueOf(this.getSumRealityMonery());
 		}
 		
 		if(!ValidateUtil.isNotEmpty(o.getSumRealityMonery())){
 			realityMonerySrc = 0;
 		}else{
 			realityMonerySrc = Double.valueOf(o.getSumRealityMonery());
 		}
		double i = realityMonerySrc - RealityMoneryDes;//先按实收金额进行排序 
	    if(i>0){
	        return 1;
	    }else{
	        return -1;  
	    }
	}
	
}
