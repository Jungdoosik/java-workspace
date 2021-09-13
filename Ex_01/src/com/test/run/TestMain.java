package com.test.run;

import java.util.Scanner;

import com.test.print.TestPrint;

public class TestMain {
	public static void main(String[] args) {
		
		TestPrint tp = new TestPrint();
		
		/*tp.ex1();
		tp.ex2();
		tp.ex3();
		tp.ex4();
		tp.ex5();
		tp.ex6();
		tp.ex7();*/
		//tp.ex8();
		
		//연산자공부
		/*int a = 10;
		int b = 3;
		
		System.out.println("a + b = " + (a+b)); //13
		System.out.println("a - b = " + (a-b)); //7
		System.out.println("a * b = " + (a*b)); //30
		System.out.println("a / b = " + (a/b)); //3
		System.out.println("a % b = " + (a%b)); //1*/
		
		//int a = 10;
		//int b = (++a) + (a--);
		//System.out.printf("a = %d , b = %d", a,b);
		
		/*int a = 10;
		int b = 20;
		boolean result1, result2, result3;
		
		result1 = (a == b);  //false
		result2 = (a <= b);  //true
		result3 = (a > b);   //false
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);*/
		
		/*int a = 10;
		int b = 20;
		boolean result1, result2, result3;
		
		result1 = (a == 10 && b ==12);  //false
		result2 = (a<12 || b> 12);  //true
		result3 = !(a == 10);   //false
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);*/
		
		
		/*/65~90 : 'A' ~ 'Z' / 97 ~ 122 : 'a' ~ 'z'
		
		// ^ = XOR 연산자
		//같은면 0 다르면 1(2진수)
		//0010 1110
		//1011 0101
		//---------
		//1001 1011
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		
		System.out.println((char)(ch^32));*/
		
		int a = 1;
		System.out.println(~a);
	}
	
	
}


