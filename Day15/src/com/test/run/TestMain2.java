package com.test.run;



class Member{
	private  String name;
	private  int age;
	private  String addr;
	
	public Member(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return name + "/" + age + "/" + addr;
	}
	
	
}
public class TestMain2 {
	public static void main(String[] args) {
		Member []m = new Member[3];
		
		m[0]= new Member("홍길동", 20, "경기도 부천");
		m[1]= new Member("김말똥", 30, "서울시 사당");
		m[2]= new Member("고길똥", 40, "부산시 서면");
		
		for(int i = 0; i <m.length; i++) {
			System.out.println(m[i]);
		}

	}

}
