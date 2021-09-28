package com.test.run;
import com.test.point.PntMgr;
import com.test.point.Silver;

public class TestMain {

	public static void main(String[] args) {
		
			
			PntMgr mgr = new PntMgr();
			
			mgr.insertData(new Silver("홍길동","silver",1000));
			mgr.insertData(new Silver("김말똥","silver",2000));
			mgr.insertData(new Silver("똥똥이","silver",3000));
			mgr.insertData(new Silver("땅땅이","silver",4000));
			mgr.insertData(new Silver("띵띵이","silver",5000));
			mgr.insertData(new Silver("쿵쿵이","silver",6000));
			mgr.insertData(new Silver("돌돌이","silver",7000));
			mgr.printData();

	}

}
	


