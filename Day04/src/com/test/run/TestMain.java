package com.test.run;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {

		/*Scanner sc = new Scanner(System.in);
		int su;
		System.out.print("10 이하의 수를 입력하세요");
		su = sc.nextInt();
		if(su<=10) 
		{
			System.out.println("잘 따라하는군요");
		}
		System.out.println("수고하셨습니다.");*/

	
	
		/*Scanner sc = new Scanner(System.in);
		int su;
		System.out.println("정수 입력 : ");
		su = sc.nextInt();
		if (su > 0) {
			System.out.println("입력한 값은 0보다 크다.");
		}else {
			System.out.println("입력한 값은 0보다 크지 않다.");
		}*/
		
		/*Scanner sc = new Scanner(System.in);
		int num1;
		System.out.print("1부터 100까지의 수 중 선택 : ");
		num1 = sc.nextInt();
		
		if(num1 > 0 && num1 <= 100) {
			if(num1 % 2 == 0)
				System.out.printf("입력한 수는 짝수 입니다 \n");
			else
				System.out.println("입력한 수는 홀수 입니다\n");
		}else { //조건이 거짓일때
			System.out.println("잘못된 수를 입력하였습니다.");
		}*/
		
		
		/*Scanner sc = new Scanner(System.in);
		int num1;
		System.out.println("Input Number 1 ~ 3 : ");
		num1 = sc.nextInt();
		if(num1 == 1) {
			System.out.println("One !");
		} else if (num1 == 2) {
			System.out.println("Two !");
		} else if (num1 == 3) {
			System.out.println("Three !");
		}else {
			System.out.println("Error !");
		}*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력(1~3) : ");
		int su = sc.nextInt();
		
		switch(su)
		{
		case 1 : System.out.println("숫자 1를 선택하셨습니다."); break;
		case 2 : System.out.println("숫자 2를 선택하셨습니다."); break;
		case 3 : System.out.println("숫자 3를 선택하셨습니다."); break;
			default : System.out.println("그 외 숫자를 입력하였습니다.");
		}
	}

}
