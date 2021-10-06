package com.test.pay.vo;

public class PartTime extends Grade {
	
	

	public PartTime() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PartTime(String name, String grade, int timePay, int hour) {
		super(name, grade, timePay*hour);
		// TODO Auto-generated constructor stub
	}
	
	

}
