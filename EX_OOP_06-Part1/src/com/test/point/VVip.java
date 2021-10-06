package com.test.point;

public class VVip extends Grade {
	
	
	public VVip() {}
	public VVip(String name, String grade, int point) {
		super(name,grade,point); 
	}
	@Override
	public double getInterest() {
		return point*0.08;
	}	
}
