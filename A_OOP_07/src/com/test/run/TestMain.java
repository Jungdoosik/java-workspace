package com.test.run;

import com.test.pay.controller.PayMgr;
import com.test.pay.vo.Intern;
import com.test.pay.vo.PartTime;
import com.test.pay.vo.Permanent;

public class TestMain {

	public static void main(String[] args) {


		PayMgr p = new PayMgr();
		p.insertData(new Permanent("홍길동","정규직",2000000));
		p.insertData(new PartTime("김말똥","시간직",8720,200));
		p.insertData(new Intern("고길똥","인턴직",2000000));
		p.printData();
	}

}
