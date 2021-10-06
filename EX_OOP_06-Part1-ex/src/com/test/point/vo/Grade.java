package com.test.point.vo;

public abstract class Grade {
	protected String name;
	protected String grade;
	protected int point;
	
	public Grade() {}
	
	public Grade(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	public abstract double getInterest(); 

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

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	
	
	
	
}
