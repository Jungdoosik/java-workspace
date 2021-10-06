package com.test.practice;

class Test{
	public void test(int a) {
		System.out.println("첫번째 매소드 호출");
	}
	public void test(int a, int b) {
		System.out.println("두번째 매소드 호출");
	}
	public void test(int a, double b) {
		System.out.println("세번째 매소드 호출");
	}
}



public class TestMain {

	public static void main(String[] args) {
		
		new Test().test(10,20.0);
		

	}

}
