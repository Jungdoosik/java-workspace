package com.test.print;

import java.util.Scanner;

public class TestPrint {
	public void ex1() {
		int su;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("일수를 알고싶은 달을 입력하시오 : ");
		su = sc.nextInt();
		
		switch(su) {
		case 1 : System.out.println("1월달은 31 일수입니다."); break;
		case 2 : System.out.println("2월달은 28 일수입니다."); break;
		case 3 : System.out.println("3월달은 31 일수입니다."); break;
		case 4 : System.out.println("4월달은 30 일수입니다."); break;
		case 5 : System.out.println("5월달은 31 일수입니다."); break;
		case 6 : System.out.println("6월달은 30 일수입니다."); break;
		case 7 : System.out.println("7월달은 31 일수입니다."); break;
		case 8 : System.out.println("8월달은 31 일수입니다."); break;
		case 9 : System.out.println("9월달은 30 일수입니다."); break;
		case 10 : System.out.println("10월달은 31 일수입니다."); break;
		case 11 : System.out.println("11월달은 30 일수입니다."); break;
		case 12 : System.out.println("12월달은 31 일수입니다."); break;
			default : System.out.println("몇 월인지 알 수 없습니다");
		}
	}

}
