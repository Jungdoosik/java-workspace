package com.test.run;
import com.test.point.Gold;
import com.test.point.Platinum;
import com.test.point.PntMgr;
import com.test.point.Silver;
import com.test.point.Vip;

public class TestMain {

	public static void main(String[] args) {
		
			
			PntMgr mgr = new PntMgr();
			
			mgr.insertData(new Silver("홍길동","silver",1000));
			mgr.insertData(new Silver("김말똥","silver",2000));
			mgr.insertData(new Silver("똥똥이","silver",3000));
			mgr.insertData(new Gold("김골드","Gold",4000));
			mgr.insertData(new Gold("박골드","Gold",5000));
			mgr.insertData(new Gold("쿵쿵이","Gold",6000));
			mgr.insertData(new Gold("돌돌이","Gold",7000));
			mgr.insertData(new Vip("디디이","Vip",7500));
			mgr.insertData(new Vip("다다이","Vip",8000));
			mgr.insertData(new Vip("도도이","Vip",9000));
			mgr.insertData(new Platinum("플플이","Platinum",6300));
			mgr.insertData(new Platinum("마마이","Platinum",1230));
			mgr.insertData(new Platinum("로로이","Platinum",7560));
			mgr.printData();

	}

}
	


