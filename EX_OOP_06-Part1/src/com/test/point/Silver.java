package com.test.point;

public class Silver extends Grade {
	
	public Silver() {}
	public Silver(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	
	public double getInterest() {
		return (point*0.02);
		
	}
}
