package com.test.point.controller;

import com.test.point.vo.Grade;

public class PntMgr {
	private Grade[]g = new Grade[20];
	/*private Silver[] s = new Silver[3];*/
	private int index = 0;
	
	public void insertData(Grade g) {
		this.g[index++] = g; 
	}
	public void printData() {
		System.out.println("---------결과 출력 ---------");
		System.out.printf("%s           %s                   %s             %s  \n","이름","등급","포인트","이자포인트");
		
		for(int i =0; i < index; i++) {
			System.out.printf("%s      %s      %d      %.2f \n",
					g[i].getName(),
					g[i].getGrade(),
					g[i].getPoint(),
					g[i].getInterest());
		}
	}
	
	
}
