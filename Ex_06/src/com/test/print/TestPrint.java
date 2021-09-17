package com.test.print;

import java.util.Scanner;

public class TestPrint {//for문 사용하기
	public void ex1() {
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + ". 안녕하세요");
		}
	}
	public void ex2() {
		int su;
		Scanner sc = new Scanner(System.in);
		System.out.print("동작할 횟수 입력 : ");
		su = sc.nextInt();
		for(int i = 1; i <= su; i++) {
			System.out.println(i + ". 안녕하세요");
		}
	}
	public void ex3() {
		
		System.out.println("구구단 2단 출력");
		for(int i = 1; i <= 9; i++) {
			System.out.println("2 x " + i + " = " + (2 * i));
		}
	}
	public void ex4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 단수 입력 : ");
		int su = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(su + " x " + i + " = " + (su*i));
		}
	}
	public void ex5() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + "번째 정수 입력 : ");
			int su = sc.nextInt();
			sum += su;
		}System.out.println("입력한 5 개의 정수 합 : " + sum);
	}
	public void ex6() {
		int su1, su2;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 정수 입력 : ");
		su1 = sc.nextInt();
		System.out.print("끝 정수 입력 : ");
		su2 = sc.nextInt();
		
		for(int i = su1; i <= su2; i++) {
			sum += i;
		}System.out.println(su1 + " ~ " + su2 + "까지의 합은[" + sum +"]입니다.");
		 
	}
	public void ex7() {
		 for(int i = 2 ; i <= 9; i++) {
			 for(int j = 1; j <= 9; j++) {
				 System.out.printf("%d x %d = %2d  ", i,j,(i*j));
			 }
			 System.out.println();
		 }
	}
	public void ex8( ) {
		for(int i = 1 ; i <= 9; i++) {
			 for(int j = 2; j <= 9; j++) {
				 System.out.printf("%d x %d = %2d  ", j,i,(i*j));
			 }
			 System.out.println();
		 }
	}
	public void ex9() {
		
		/*//Q1
		for(int i = 0; i < 1; i++) {
			for(int j = 1; j <=5; j++) {
				System.out.print("*");
			}
		}
		
		//Q2
		for(int i = 0; i < 1; i++) {
			for(int j = 1; j <=5; j++) {
				System.out.println("*");
			}
		}
		
		//Q3
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j <=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Q4
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		//Q5
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		//Q6
		for(int i = 1; i <=5; i++) {
			for(int j = i; j < (i+5); j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		//Q7
		for(int i = 5; 0 < i ; i--) {   // 5; 0<5; i--
			for(int j = i; j <(i+5); j++) { // j=5; 5 < 10; j--
				System.out.print(j); //5한번  6두번  7세번 8네번 9다섯번 그리고 줄개행후 다시 처음으로
			}System.out.println();
		}
		
		//Q8
		for(int i = 1; i <=5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		//Q9
		for(int i = 5; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		//Q10
		for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i; j++) {
               System.out.print(" ");
            }
            for(int j = 0; j < 5-i; j++) {
               System.out.print("*");
            }System.out.println();
            
         }
      }
	
	
	public void ex10() {
		
		int su1, su2;
		char ch1;
		
		Scanner sc = new Scanner(System.in);
		
		 
		
		while(true) {
			
			System.out.println("계산기 프로그램 ver1.0");
			System.out.print("연산자를 입력하세요 ( +, -, *, / (종료는 q)) : ");
			ch1 = sc.next().charAt(0);
				
				if(ch1 == 'q' || ch1 == 'Q') {
					System.out.println("계산기를 이용해주셔서 감사합니다.");break;
				}
				if(ch1 != '+' && ch1 != '-' && ch1 != '*' && ch1 != '/') {
					System.out.println("잘못입력하셨습니다. 다시입력해주세요!"); 
					System.out.println();continue;
					
					}	
				
				System.out.print("첫번째 수 입력 : ");
				su1 = sc.nextInt();
				System.out.print("두번째 수 입력 : ");
				su2 = sc.nextInt();
				
					switch(ch1) {
						case '+' : System.out.println(su1 + " + " + su2 + " = " + (su1+su2));break;
						case '-' : System.out.println(su1 + " - " + su2 + " = " + (su1-su2));break;
						case '*' : System.out.println(su1 + " * " + su2 + " = " + (su1*su2));break;
						case '/' : System.out.println(su1 + " / " + su2 + " = " + (su1/(double)su2));break;
						default : System.out.println("잘 못 입력하셨습니다.");
					}
					System.out.println();
					System.out.println("------ Next ------");
					System.out.println();
		}
		
	}
}
