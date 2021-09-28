package com.test.run;

public class TestMethod {
	
	
	
	public void start() 
	{
		//add(10,20);
		System.out.println(add(10,20));
		
	}
	//add = 메소드 명
						//메소드명 오른쪽에 명시하는 변수는 메소드를 호출할때 보내준 인자값을 저장하는변수
						//매개변수
	public int add(int a, int b) 
	{
		int c;
		c = a+b;
		return c; //자신을 호출한 위치로 c안에 있는 값을 가지고 될돌아 가겠다 ->return
	}
	//int 는 리턴 데이터 타입
	//리턴 데이터 타입이라는 것은
	//되돌려줄(return) 데이터의 타입

		//void 라는 리턴데이터 타입은 타입을 명시하지 않았다
		//라는 의미가 되고, 그것은 리턴하지 않는다.
	
	//순서!!!!
	//1.메소드명 정하기
	//2.매개변수 정하기
	//3.동작코드정하기
	//4.리턴데이터값 정하기

}
