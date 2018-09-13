/**
 * onlyhiedu.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.tr.client.realtimeoutbound;

/**
 * <pre>
 * 天润来电回访次数
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: TrBackCallCount.java, v 0.1 2017年11月30日 下午2:57:36  Exp $
 */
public class TrBackCallCount {
	
	
	private String columnName;//列名
	
	private String zero;//0次回访

	private String one;//1次回访
	
	private String two;
	
	private String three;
	
	private String four;
	
	private String five;
	
	private String fivePlus;

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getZero() {
		return zero;
	}

	public void setZero(String zero) {
		this.zero = zero;
	}

	public String getOne() {
		return one;
	}

	public void setOne(String one) {
		this.one = one;
	}

	public String getTwo() {
		return two;
	}

	public void setTwo(String two) {
		this.two = two;
	}

	public String getThree() {
		return three;
	}

	public void setThree(String three) {
		this.three = three;
	}

	public String getFour() {
		return four;
	}

	public void setFour(String four) {
		this.four = four;
	}

	public String getFive() {
		return five;
	}

	public void setFive(String five) {
		this.five = five;
	}

	public String getFivePlus() {
		return fivePlus;
	}

	public void setFivePlus(String fivePlus) {
		this.fivePlus = fivePlus;
	}

	
}
