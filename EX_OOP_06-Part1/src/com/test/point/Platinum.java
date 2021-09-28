package com.test.point;

public class Platinum extends Grade {
	
	public Platinum() {}
	public Platinum(String name, String grade, int point) {
		super(name,grade,point); 
	}
	@Override
	public double getInterest() {
		return point*0.1;
	}	
}
