package com.test.pay.vo;

public class PartTime extends Grade {

	public PartTime() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PartTime(String name, String grade, int hPay, int time) {
		super(name, grade, hPay * time);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPay() {
		return pay;
	}

}
