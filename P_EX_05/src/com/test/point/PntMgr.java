package com.test.point;

import java.util.Scanner;

public class PntMgr {
	private Scanner sc = new Scanner(System.in);
	private Grade[] g = new Grade[10];
	
	private int index1 = 0;
	
	
	public void insertData(Grade g) {
		this.g[index1++] = g;
	}
	
	public void printData() {
		System.out.println("==========회원출력==========");
		System.out.printf("%10s %10s %10s %10s \n","이름", "등급", "포인트","이자포인트");
		
		for(int i = 0; i < index1; i++) {
			System.out.printf("%10s %10s %5d %.6f \n", g[i].getName(),
														g[i].getGrade(),
														g[i].getPoint(),
														g[i].getPsvp());
		}
		
	}
	
	

}
