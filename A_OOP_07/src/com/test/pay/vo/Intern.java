package com.test.pay.vo;

public class Intern extends Grade {

	public Intern() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Intern(String name, String grade, int pay) {
		super(name, grade, pay);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPay() {
		// TODO Auto-generated method stub
		return (int) (pay * 0.8);
	}

}
