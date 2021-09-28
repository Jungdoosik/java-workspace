package com.test.run;
//2021.09.27
class Test{
	public void test(int a) {
		System.out.println("첫번째 메소드 호출용");
	}
	public void test(int a, int b) {
		System.out.println("두번째 메소드 호출용");
	}
	public void test(int a, double b) {
		System.out.println("세번째 메소드 호출용");
	}
}

public class TestMain {

	public static void main(String[] args) {
		//다형성 : 하나의 형태가 여라가지의 형태를 가지고 있는것
		//메소드 오버로딩 기법
		new Test().test(10,20.0);
	}

}
