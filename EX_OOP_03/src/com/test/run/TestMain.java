package com.test.run;

//import com.test.controller.MemberController;
//import com.test.vo.Member;

class Member {
	public String name;
	public int age;
	public String addr;
	public Member(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
}

public class TestMain {

	public static void main(String[] args) {
		
		Member[] m = new Member[3];
		m[0] = new Member("홍길동",20,"경기도");
		m[1] = new Member("김말똥",30,"서울시");
		m[2] = new Member("고길동",40,"부산시");
		
		for(int i = 0; i < m.length; i++) {
			System.out.println("이름 : " + m[i].name);
			System.out.println("나이 : " + m[i].age);
			System.out.println("주소 : " + m[i].addr);
			System.out.println();
		}
		/*MemberController mc = new MemberController();
		mc.insertData(new Member("홍길동", 20, "경기도 부천"));
		mc.printData();*/
	}
}
