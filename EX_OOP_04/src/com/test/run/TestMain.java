package com.test.run;

import com.test.print.MemberController;
import com.test.vo.Member;

public class TestMain {

	public static void main(String[] args) {

		MemberController mc = new MemberController();
		mc.insertData(new Member("홍길동", 20, "경기도 부천"));
		mc.insertData(new Member("김말똥", 30, "서울시 양천"));
		mc.insertData(new Member("고길똥", 40, "부산시 서면"));
		mc.printData(); // 출력
	}
}
