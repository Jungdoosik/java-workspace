package com.test.point;

public class Platinum extends Grade {
	
	public Platinum() {}
	public Platinum(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	
	public double getInterest() {
		return point*0.1;
	}	
}
