package com.test.point;

public class Ruby extends Grade {
	
	public Ruby() {}
	public Ruby(String name, String grade, int point) {
		super(name,grade,point); 
	}
	@Override
	public double getInterest() {
		return point*0.2;
	}	
}
