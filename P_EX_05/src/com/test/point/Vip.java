package com.test.point;

public class Vip extends Grade{
	
	
	public Vip() {
		super();
		
	}
	public Vip(String name, String grade, int point) {
		super(name, grade, point);
		
	}
	@Override
	public double getPsvp() {
		
		return point*0.05;
	}
	
	
	

}
