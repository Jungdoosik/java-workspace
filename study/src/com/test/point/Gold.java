package com.test.point;

public class Gold extends Grade {
	
	public Gold() {
		super();
		
	}
	public Gold(String name, String grade, int point) {
		super(name,grade,point);
	}
	
	public double getInsert() {
		return point * 0.03;
	}
}
