package com.test.point;

public class Gold extends Grade{
	
	public Gold() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Gold(String name, String grade, int point) {
		super(name, grade, point);
		
	}
	
	@Override
	public double getPsvp() {
		return point * 0.03;
	}

}
