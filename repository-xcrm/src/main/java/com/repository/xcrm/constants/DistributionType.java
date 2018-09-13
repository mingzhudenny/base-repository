package com.repository.xcrm.constants;

public enum DistributionType {

	
	  NEW(0),//新名单分配
	  NO_NEW(1),//藏金阁分配
	  FORMAL(2),//正式生分配
	  DIMISSION_LEAD(3),//离职leads分配
	  DIMISSIONS_TUDENT(4),//离职正式生分配
	  GIVEUP(5);//回收站分配
	
	 private final int value;

	  private DistributionType(int value) {
	    this.value = value;
	  }

	  public int getValue() {
	    return value;
	  }
	  
	  public static DistributionType findByValue(int value) { 
		    switch (value) {
		      case 0:
		        return NEW;
		      case 1:
		        return NO_NEW;
		      case 2:
		        return FORMAL;
		      case 3:
			    return DIMISSION_LEAD;
		      case 4:
			    return DIMISSIONS_TUDENT;
		      case 5:
			    return GIVEUP;
		      default:
		        return null;
		    }
		  }
}
