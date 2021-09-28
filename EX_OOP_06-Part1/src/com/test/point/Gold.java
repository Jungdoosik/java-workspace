package com.test.point;

public class Gold extends Grade {
	
	public Gold() {}
	public Gold(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	
	public double getInterest() {
		return point*0.03;
	}	
}
