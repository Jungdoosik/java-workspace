package com.test.point;

public class Vip extends Grade {
	
	public Vip() {}
	public Vip(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	
	public double getInterest() {
		return point*0.05;
	}	
}
