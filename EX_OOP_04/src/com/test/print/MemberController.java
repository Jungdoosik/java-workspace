package com.test.print;

import com.test.vo.Member;

public class MemberController {
	private Member[] m = new Member[3];
	private int index = 0;

	public void insertData(Member m) {
		this.m[index++] = m;
	}

	public void printData() {
		System.out.printf("%10s %10s %15s \n", "이름", "나이", "주소");
		for (int i = 0; i < index; i++) {
			System.out.printf("%10s %10d %10s \n", m[i].getName(), m[i].getAge(), m[i].getAddr());
		}
	}
}
