package com.test.run;

import java.util.Scanner;

import com.test.print.TestPrint;

public class TestMain {

	public static void main(String[] args) {
		//TestPrint tp = new TestPrint();
		//tp.ex1();
		//tp.ex2();
		//tp.ex3();
		//tp.ex4();
		//tp.ex5();
		
		/*int i;
		i = 0; //초기값 지정
		
		while ( i < 10) { //조건문
			
			//i = i + 1; //증감문
			i++;
			// 반복문을 쓰기 위해서는 초기 조건 증감을 사용해야함!!!!
			System.out.println("i = " + i);
		}*/
		
		
		/*int i = 1;
		int sum = 0;
		
		while(i <= 100) {
			sum += i;
			i++;
			System.out.println("1~100까지의 합은? : " + sum); // 5050이나옴 (1~100까지의 합)
		}
		int a = 1;
		int su;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		su = sc.nextInt();
		 while(a <= su) {
			 sum +=a;
			 a++;
			 System.out.println("1 ~ n 번쨰 까지의 합은? : " + sum); //임의의 숫자까지의 합
			 
			 
		 }*/
		
		
		
		
		// 시작값을 조절 해보도록 하겠습니다.
				// m ~ 100 까지
				
				/*Scanner sc = new Scanner(System.in);
				System.out.print("m 입력 : ");
				int m = sc.nextInt();
				
				int sum = 0;
				
				int i=m-1; //초기
				
				// 1 ~ 100 을하려면 i는 몇부터 시작했죠? 0부터 시작했습니다.
				
				while(i<100) //조건
				{
					i++; //증감
					
					//실행 코드
					sum = sum + i;
				}
				
				System.out.println(m+" ~ 100 까지의 합산 : " + sum);*/
		
		/*Scanner sc = new Scanner(System.in); // 입력한 수의 뒤에서 부터 출력하는 프로그램
		int su;
		System.out.print("정수입력 : ");
		su = sc.nextInt();
		
		do {
			System.out.println(su%10); //3
			su /= 10;  //123 /= 10
		}while (su>0);*/
		
		
		
		
		
		
		
		
		//for 문 시작!!
		
		/*for (int i = 1; i <= 10; i++) {
			System.out.println("i = " + i);
		}
		
		for( int i = 2; i < 10; i++) {//중첩 for문
			System.out.println("구구단이다~~");
			for ( int j =1; j < 10; j++) {
				System.out.printf("%d x %d = %d \n", i,j,(i*j));
			}
			
		}
		for(int i = 1; i <= 5; i++) {
			for(int j = 5-i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		Scanner sc = new Scanner(System.in);
		int sel = 0;
		int sum = 0;
		while(true) {
			System.out.print("더할 수를 입력하세요 ( 종료 == 0 ) : ");
			sel = sc.nextInt();
			if(sel == 0)break;
			sum = sum + sel;
		}
		System.out.printf("입력하신 값들의 전체 합은 %d입니다 \n", sum);
		
		
		
		
		
		
		
		//break는 switch나 반복문을 중단시키는 문법
		//자신을 포함하고 있는 반복문 이나 switch안에 있다면 switch를 중단시킵니다.
		for(int i = 0 ; i < 5 ; i ++) {
			for (int j =0; j<5; j++) {
				System.out.println(i +"Hello");
				if(j==3) {
					break;
				}
			}
		}*/
		
		int i = 0;
		int sum = 0;
		while(i<5) {
			i++;
			if(i%2 == 0) {
				continue;
			}
			
			System.out.println(sum + " + " + i + " = " + (sum+i));
			sum = sum + i;
		}
		System.out.println("결과 : " + sum);
	}
}
