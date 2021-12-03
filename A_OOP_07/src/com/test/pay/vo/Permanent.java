package com.test.pay.vo;

public class Permanent extends Grade{

	
	
	public Permanent() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Permanent(String name, String grade, int pay) {
		super(name, grade, pay);
		
	}
	
	@Override
	public int getPay() {
		return pay;
		
	}
}
	
	
	


