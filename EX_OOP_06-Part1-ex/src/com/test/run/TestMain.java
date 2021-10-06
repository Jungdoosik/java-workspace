package com.test.run;

import com.test.point.controller.PntMgr;
import com.test.point.vo.Silver;

public class TestMain {

	public static void main(String[] args) {
		
		PntMgr mgr = new PntMgr();
		
		mgr.insertData(new Silver("홍길동", "silver", 1000));
		mgr.insertData(new Silver("김말똥", "silver", 2000));
		mgr.insertData(new Silver("똥똥이", "silver", 3000));//silver 이자율 2%
		mgr.insertData(new Silver("김골드", "Gold", 1000));
		mgr.insertData(new Silver("박골드", "Gold", 2000));//Gold 이자율 3%
		mgr.insertData(new Silver("김부장", "Vip", 2000));//Vip 이자율 5%
		mgr.insertData(new Silver("김사장", "VVip", 3000)); //VVip 이자율 8%
		
		mgr.printData();
	}

}
