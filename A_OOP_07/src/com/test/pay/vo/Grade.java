package com.test.pay.vo;

public abstract class Grade {
	protected String name;
	protected String grade;
	protected int pay;

	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Grade(String name, String grade, int pay) {
		super();
		this.name = name;
		this.grade = grade;
		this.pay = pay;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public abstract int getPay();

	public void setPay(int pay) {
		this.pay = pay;
	}

}