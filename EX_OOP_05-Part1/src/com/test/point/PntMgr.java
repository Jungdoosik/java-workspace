package com.test.point;

public class PntMgr {
	
	private Silver[] s = new Silver[10];
	private int index = 0;
	
	public void insertData(Silver s) {
		this.s[index++] = s;
	}
	public void printData() {
		System.out.println("-----결과 출력-----");
		System.out.printf("%10s %10s %23s %10s \n", "이름", "등급", "포인트", "적립금");
		for(int i =0; i < index; i++) {
		
		System.out.printf("%10s %10s %10d   %.2f \n", 
				s[i].getName(),
				s[i].getGrade(),
				s[i].getPoint(),
				s[i].getInterest());
		}
	}
}
