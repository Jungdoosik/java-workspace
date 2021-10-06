package com.test.run;

import com.test.controller.MemberController;
import com.test.vo.Member;

public class TestMain {

	public static void main(String[] args) {
		
		MemberController mc = new MemberController();
		mc.insertData(new Member("홍길동", 20, "경기도 부천"));
		mc.printData();
		
	}
}
