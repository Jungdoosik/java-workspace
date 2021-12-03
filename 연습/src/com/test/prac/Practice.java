package com.test.prac;

import java.util.Random;
import java.util.Scanner;

public class Practice {
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 수를 입력하세요 : ");
		int su = sc.nextInt();

		if (su > 0) {
			System.out.println("당신이 입력한 수 " + su + "는 양수입니다.");
		} else if (su == 0) {
			System.out.println("당신이 입력한 수 " + su + "는 0입니다.");
		} else {
			System.out.println("당신이 입력한 수  " + su + "는 음수 입니다.");
		}
	}

	public void ex2() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int su;
		int count = 0;
		do {
			System.out.print("정수를 입력하세요(0이면 종료) : ");
			su = sc.nextInt();
			sum += su;
			count++;
		} while (su != 0);

		System.out.println("입력한 [" + (count - 1) + "]개의 정수 합은 [" + sum + "] 입니다.");
	}

	public void ex3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 정수 입력 : ");
		int su1 = sc.nextInt();
		System.out.print("끝 정수 입력 : ");
		int su2 = sc.nextInt();
		int sum = 0;
		for (int i = su1; i <= su2; i++) {

			sum += i;
		}
		System.out.println(su1 + "~" + su2 + "까지의 합은  [" + sum + "]입니다.");
	}
	public void ex4() {
		for(int i = 2; i < 10; i++) {
			System.out.println();
			for(int j = 1; j <10 ; j++) {
				System.out.printf("%d * %d = %d",i,j,(i*j));
			}
		}
		
	}
	public void ex5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("생성할 2차원 배열의 가로길이 : ");
		int row = sc.nextInt();
		System.out.print("생성할 2차원 배열의 세로 길이 : ");
		int column = sc.nextInt();
		
		Random r = new Random();
		
		int[][]arr = new int[row][column];
		
		for(int i =0; i < row; i++) {
			for(int j= 0; j <column; j++) {
				arr[i][j] = 'a' + r.nextInt(26);
			}
		}
		for(int i =0; i < row; i++) {
			System.out.println();
			for(int j= 0; j <column; j++) {
				System.out.printf("%2s ",(char)(arr[i][j]));
			}
		}
		
		
		
	}
	
	public void ex6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("생성할 2차원 배열의 가로길이 : ");
		int row = sc.nextInt();
		
		
		int su = 1;
		
		int[][]arr = new int[row][row];
		
		for(int i =0; i < row; i++) {
			for(int j= 0; j <row; j++) {
				arr[i][j] = su++;
			}
		}
		for(int i =0; i < row; i++) {
			System.out.println();
			for(int j= 0; j <row; j++) {
				System.out.printf("%2s ",arr[i][j]);
			}
		}
		
		
		
	}
}
