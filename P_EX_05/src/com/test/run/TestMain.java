package com.test.run;
import com.test.point.Gold;
import com.test.point.PntMgr;
import com.test.point.Silver;
import com.test.point.Vip;

public class TestMain {

	public static void main(String[] args) {
		
		PntMgr mgr = new PntMgr();
		
		mgr.insertData(new Silver("홍길동","silver",1000));
		mgr.insertData(new Silver("김말똥","silver",2000));
		mgr.insertData(new Silver("똥똥이","silver",3000));
		mgr.insertData(new Gold("김부장","Gold",2000));
		mgr.insertData(new Gold("박부장","Gold",3000));
		mgr.insertData(new Vip("최사장","Vip",3000));
		mgr.printData();

	}

}