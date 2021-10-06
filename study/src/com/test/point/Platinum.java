package com.test.point;

public class Platinum extends Grade {
	
	public Platinum() {
		super();
		
	}
	public Platinum(String name, String grade, int point) {
		super(name,grade,point);
	}
	@Override
	public double getInsert() {
		return point * 0.1;
	}
	
	
}
