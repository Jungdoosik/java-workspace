package com.test.print;

import java.util.Scanner;

public class TestPrint {
	public void ex1() {
		int a = 10;
		int b = 3;
		System.out.println(add(a, b));
		System.out.println(sub(a, b));
		System.out.println(mul(a, b));
		System.out.println(div(a, b));
	}
	
	public int add(int a, int b) {
		int c;
		c= a+b;
		return c;	
	}
	public int sub(int a, int b) {
		int c;
		c= a-b;
		return c;
	}
	public int mul(int a, int b) {
		int c;
		c = a*b;
		return c;
	}
	public double div(int a, int b) {
		
		return a/(double)b;
	}
	
	public void ex99() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int su = sc.nextInt();
		
		System.out.println("제곱값 출력 : " + square(su));
		
		//사용자가 9를 입력하면
		//[제곱값 출력 : 81] 이라고 출력되도록 구현
	}
	public int square(int su) 
	{
		
		return su*su; //한줄로 표현	
	}
	
	public void ex2() {
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.print("영문자 입력 : ");
		ch = sc.next().charAt(0);
		System.out.println("===== 변 환 =====");
		System.out.print(ch + " --> ");
		ch = charChange(ch);
		System.out.println(ch);
		
	}
	//넘어온 글자 1글자를 보고,
	//소문자면 대문자로 리턴
	//대문자면 소문자로 리턴
	public char charChange(char ch) {
		if('a' <= ch && ch <= 'z') {
			return (char) (ch - 32);
		}//대문자 범위 65~90 
		if('A' <= ch && ch <= 'Z') {
			return (char) (ch+32);
		}//소문자 범위 97 ~122
		return ch;
		
		
	}
}
