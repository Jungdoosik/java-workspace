package com.test.pay.controller;

import com.test.pay.vo.Grade;

public class PayMgr {

	Grade[] g = new Grade[10];
	int index = 0;

	public void insertData(Grade g) {
		this.g[index++] = g;

	}

	public void printData() {
		System.out.println("----------정보 출력-------------");
		System.out.printf("%10s %10s %10s \n", "이름", "등급", "급여");
		for (int i = 0; i < index; i++) {
			System.out.printf("%10s %10s %10d \n", g[i].getName(), g[i].getGrade(), g[i].getPay());
		}

	}
}
