package com.test.print;

import java.util.Scanner;

public class TestPrint {
	
	/*public void ex1() {
		
		//반복문을 사용할떄에는 3가지 꼭 명심해라
		//초기, 조건, 증감
		
		int i;
		i = 0; //초기값
		
		while(i < 3) { //조건
			
			i++;//증감
			System.out.println("안녕하세요");//실행 구문
		}
	}
	
	public void ex1() {
		int i;
		i = 0;
		
		while(i < 5) {
			i++;
			System.out.println(i + ". 안녕하세요");
		}
	}
	public void ex2() {
		int su1 = 0;
		int su2;
		Scanner sc = new Scanner(System.in);
		System.out.print("동작할 횟수 입력 : ");
		su2 = sc.nextInt();
		
		while(su1 < su2) {
			su1++;
			System.out.println(su1 + ". 안녕하세요");
		}
		
	}
	public void ex3() {
		int su1 = 2;
		int su2 = 0;
		System.out.println("==구구단 2단 출력==");
		
		while(su2 < 9) {
			su2++;
			//System.out.println(su1 + "x" + su2 + "=" + (su1 * su2));
			
			System.out.printf("2 x " + su2 + " = " + (2*su2) + "\n");
		}
	}
	public void ex4() {
		int su1 = 0;
		int su2 = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("촐력할 단수 입력 : ");
		su1 = sc.nextInt();
		
		System.out.println("구구단 [" + su1 + "]단 출력");
		
		while(su2 < 9) {
			su2++;
			//System.out.println(su1 + " x " + su2 + " = " + (su1*su2));
			System.out.printf("%d x %d = %d \n", su1,su2,su1*su2);
		}
		
	}
	public void ex5() {
		//int su1, su2, su3, su4, su5 = 0;
		int su1 ;
		int sum = 0 ;
		int a = 0;
		Scanner sc = new Scanner(System.in);
		
		while(a <5) {
			a++;
			System.out.print(a + "번쨰 정수 입력 : ");
			su1 = sc.nextInt();
			sum += su1;
		}
		System.out.println("입력한 5개의 정수 합 : " + sum);
		
		/*System.out.print("1번째 정수 입력 : ");
		su1 = sc.nextInt();
		System.out.print("2번째 정수 입력 : ");
		su2 = sc.nextInt();
		System.out.print("3번째 정수 입력 : ");
		su3 = sc.nextInt();
		System.out.print("4번째 정수 입력 : ");
		su4 = sc.nextInt();
		System.out.print("5번째 정수 입력 : ");
		su5 = sc.nextInt();
		
		System.out.println("입력한 5개의 정수 합 : " + (su1+su2+su3+su4+su5));
	}
	public void ex6() {
		int start ;
		int last ;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("시작정수 입력 : ");
		start = sc.nextInt();
		
		System.out.print("끝 정수 입력 : ");
		last = sc.nextInt();

		
		int i= start;
		while(i <= last) {
			sum += i;
			i++;
		}
		System.out.println(start + "~" + last + "까지의 합은 [" + sum + "] 입니다.");
	}*/
	public void ex1() {
		
		int i =0;
		 while(i < 5) {
			 i++;
			 System.out.println("안녕하세요");
		 }
	}
	public void ex2() {
		int su;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("동작할 횟수 입력 : ");
		su = sc.nextInt();
		int i = 0;
		while(i < su) {
			i++;
			System.out.println(i + ". 안녕하세요.");
		}
	}
	public void ex3() {
		int i = 0;
		System.out.println("구구단 2단 출력");
		while(i < 9) {
			i++;
			System.out.println("2 x " + i + " = " + (2*i));
		}
	}
	public void ex4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 단수 입력 : ");
		int su = sc.nextInt();
		System.out.println("구구단 [" + su + "]단 출력");
		
		int i = 0;
		while(i < 9) {
			i++;
			System.out.println(su + " x " + i + " = " + (su*i));
		}
	}
	public void ex5() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		int i = 0;
		while(i < 5) {
			i++;
			System.out.print(i + "번째 정수 입력 : ");
			int su = sc.nextInt();
			sum += su;
		}System.out.println("입력한 5개의 정수 합 : " + sum);
	}
	public void ex6() {
		int start;
		int last;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 정수 입력 : ");
		start = sc.nextInt();
		System.out.print("끝 정수 입력 : ");
		last = sc.nextInt();
		
		int i = start;
		while(i <= last) {
			
			sum += i;
			i++;
		}System.out.println(start + " ~ " + last + "까지의 합은 [" + sum + "] 입니다.");
	}
	public void ex7() {
		System.out.println("자동 덧셈 계산기");
		
		Scanner sc = new Scanner(System.in);
		int su;
		int sum = 0;
		int count = -1;
		do {
			System.out.print("정수를 입력하세요 (0이면 종료) : ");
			su = sc.nextInt();
			sum += su;
			count++ ;
			
		}while(su != 0); //입력한 수가  0이 아니면 (음수 또는 양수) 계속 동작
						 //입력한 수가 0이면 동작하지 말아라는 뜻
		System.out.println("입력한 ["+ count +"]개의 정수 합은 ["+sum+"] 입니다.");
	
	}

}
