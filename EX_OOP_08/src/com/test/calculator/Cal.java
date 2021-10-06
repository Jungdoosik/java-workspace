package com.test.calculator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Cal implements Calculator{

	@Override
	public int add(String su1, String su2) {
		
		return Integer.parseInt(su1)+Integer.parseInt(su2);
	}

	@Override
	public int subtract(String su1, String su2) {
		
		return Integer.parseInt(su1)-Integer.parseInt(su2);
	}

	@Override
	public int multiply(String su1, String su2) {
		
		return Integer.parseInt(su1)*Integer.parseInt(su2);
	}

	@Override
	public double divide(String su1, String su2) {
		
		return Integer.parseInt(su1)/ Double.parseDouble(su2);
	}

	@Override
	public void start() {
		char ch;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(getTime()+"연산자 입력 : ");
		ch = sc.next().charAt(0);
		
		System.out.print(getTime()+"첫번째 숫자 입력 : ");
		String su1 = sc.next();
		
		System.out.print(getTime()+"두번째 숫자 입력 : ");
		String su2 = sc.next();
		
		System.out.println(getTime()+"----------연산결과----------");
		switch(ch) {
		case '+' : System.out.println(getTime()+su1 + "+" + su2 + "=" + add(su1,su2));break;
		case '-' : System.out.println(getTime()+su1 + "-" + su2 + "=" + subtract(su1,su2));break;
		case '*' : System.out.println(getTime()+su1 + "*" + su2 + "=" + multiply(su1,su2));break;
		case '/' : System.out.println(getTime()+su1 + "/" + su2 + "=" + divide(su1,su2));break;
		default : System.out.println("잘못입력 하셨습니다.");
		}
	}//인터페이스 상속
	public String getTime() {
	
	Date today = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("[HH:mm:ss]");
	String time = sdf.format(today);
	return time;
	}
}
