package com.test.print;

import java.util.Scanner;

public class TestPrint {
	public void ex1() {
	
		String[] arr = {"딸기", "복숭아", "키위", "사과", "바나나"};
		
		
		System.out.println("1번 : 딸기 \n" + "2번 : 복숭아 \n" + "3번 : 키위 \n" + "4번 : 사과 \n" + "5번 : 바나나" );
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번째 과일을 출력하시겠습니까? : ");
		int su = sc.nextInt();
		
		if(0<su && su <=5) {
		System.out.println("당신이 선택한 과일은 [" + arr[su-1] + "]이군요");  
		}else {
			System.out.println("1~5까지의 수만 입력해주세요!");
		}
		}
	public void ex2() {
		int[] arr = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 정수 입력 : ");
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}System.out.println("5개의 정수를 합한 값 : " + sum);
	}
	public void ex3() {
		int[] arr = new int[5];//5개를 입력받는 배열
		Scanner sc = new Scanner(System.in);
		
		double avg ; //평균
		int sum = 0; //합산
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 학생 점수 입력 : ");
			arr[i] = sc.nextInt();
			sum += arr[i]; // sum = sum + arr[i];
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		avg = sum /5.0;
		System.out.println("학생들의 성적 (평균) : " + avg);
		System.out.println("학생들의 성적 (총합) : " + sum);	
	}	
	public void ex4() {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 정수 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		
		for(int i = 1; i < arr.length;i++) {
			for(int j=0; j < arr.length-i; j++) {
				if(arr[j] > arr[j+1]) {
				
				int tmp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]= tmp;
				}	
			}
		}
			for(int i = 0; i < 5; i++) {
				System.out.print(arr[i] + " ");
			}
			/*if(arr[0] > arr[1]) {
			tmp = arr[0];
			arr[0]=arr[1];
			arr[1]= tmp;
		}
		if(arr[1] > arr[2]) {
			tmp = arr[1];
			arr[1]=arr[2];
			arr[2]= tmp;
		}
		if(arr[2] > arr[3]) {
			tmp = arr[2];
			arr[2]=arr[3];
			arr[3]= tmp;
		}
		if(arr[3] > arr[4]) {
			tmp = arr[3];
			arr[3]=arr[4];
			arr[4]= tmp;
		}
		//-----------------------
		
		if(arr[0] > arr[1]) {
			tmp = arr[0];
			arr[0]=arr[1];
			arr[1]= tmp;
		}
		if(arr[1] > arr[2]) {
			tmp = arr[1];
			arr[1]=arr[2];
			arr[2]= tmp;
		}
		if(arr[2] > arr[3]) {
			tmp = arr[2];
			arr[2]=arr[3];
			arr[3]= tmp;
		}
		//-------------------------
		
		if(arr[0] > arr[1]) {
			tmp = arr[0];
			arr[0]=arr[1];
			arr[1]= tmp;
		}
		if(arr[1] > arr[2]) {
			tmp = arr[1];
			arr[1]=arr[2];
			arr[2]= tmp;
		}
		//-------------------------
		
		if(arr[0] > arr[1]) {
			tmp = arr[0];
			arr[0]=arr[1];
			arr[1]= tmp;
		}*/
	}
	public void ex5() {
		System.out.println("모텔관리 프로그램  v1.0");
		
	}
	public void ex6() {
		//ex
		/*int[][]arr = new int[5][5];
		int su =1;
		for(int i =0; i <5; i++) {
			for(int j =4; j >=0; j--) {
				arr[i][j] = su++;
				System.out.printf("%5d", arr[i][j]);
			}System.out.println();
		}*/
		
		
		//Q1
		/*int[][]arr = new int[5][5];
		int su =1;
		for(int i =0; i <5; i++) {
			for(int j =4; j >= 0; j--) {
				arr[i][j] = su++;
			}
		}
		for(int i=0; i<5;i++) {
			for(int j=0; j<5;j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}*/
		
		//Q2
		/*int[][]arr = new int[5][5];
		int su =1;
		for(int i =0; i <5; i++) {
			for(int j =0; j <5; j++) {
				arr[j][i] = su++;
			}
		}
		for(int i=0; i<5;i++) {
			for(int j=0; j<5;j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}*/
		
		//Q3
		/*int[][]arr = new int[5][5];
		int su =1;
		for(int i =0; i <5; i++) {
			for(int j =4; j>=0; j--) {
				arr[i][j] = su++;
			}
		}
		for(int i=0; i <5;i++) {
			for(int j=0; j<5;j++) {
				System.out.printf("%5d", arr[j][i]);
			}
			System.out.println();
		}*/
		
		//Q4
		/*int[][]arr = new int[5][5];
		int su =1;
		for(int i =0; i <5; i++) {
			for(int j =0; j <5; j++) {
				arr[i][j] = su++;
			}
		}
		for(int i=0; i<5;i++) {
			for(int j=0; j<5;j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}*/
	}
	public void ex7() {
		int[][]arr = new int[5][5];
		int su =1;
		for(int i =0; i <5; i++) {
			for(int j =0; j <5; j++) {
				arr[i][j] = su++;
			}
		}
		for(int i=0; i<5;i++) {
			for(int j=0; j<5;j++) {			
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}
	}
}

		