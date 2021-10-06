package com.test.point.vo;

public class Silver extends Grade {
	
	
	public Silver() {}
	public Silver(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	
	@Override
	public double getInterest() {
		return (point*0.02);
		
	}
	
}
