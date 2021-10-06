package com.test.run;

import com.test.member.cotroller.MemberController;

public class TestMain {

	public static void main(String[] args) {
		
		MemberController mCon = new MemberController();
		//mCon.save();
		mCon.load("save.dat");

	}

}
