package com.test.point;

public abstract class Grade {
	protected String name;
	protected String grade;
	protected int point;
	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Grade(String name, String grade, int point) {
		super();
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	
	public abstract double getInsert() ;
		
		
	
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
