package com.test.point;

public class Silver extends Grade{
	
	public Silver() {
		super();
		
	}
	public Silver(String name, String grade, int point) {
		super(name, grade, point);
		
	}
	@Override
	public double getPsvp() {
		return point*0.02;
	}
	
	

}
