package com.test.point;

public class Silver extends Grade {
	
	public Silver() {}
	public Silver(String name, String grade, int point) {
		super(name,grade,point); 
	}
	@Override//정석은 표시하는것 (부모객체에 표시했기에 기계자체에서 알아서 알아듣기때문에 없어도 되긴함)
	public double getInterest() {
		return (point*0.02);
		
	}
}
