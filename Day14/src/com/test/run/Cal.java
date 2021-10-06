package com.test.run;

import java.util.Scanner;

public class Cal {

	public void start() {
		Scanner sc = new Scanner(System.in);

		System.out.print("연산자를 입력하세요(+,-,*,/) : ");
		char yun = sc.next().charAt(0);
		System.out.print("첫번째 수를 입력하세요 : ");
		int su1 = sc.nextInt();

		System.out.print("두번째 수를 입력하세요 : ");
		int su2 = sc.nextInt();

		System.out.println("---- 결과출력 ----");

		switch (yun) {
		case '+':
			System.out.println(su1 + "+" + su2 + "=" + (su1 + su2));
			break;
		case '-':
			System.out.println(su1 + "-" + su2 + "=" + (su1 - su2));
			break;
		case '*':
			System.out.println(su1 + "*" + su2 + "=" + (su1 * su2));
			break;
		case '/':
			System.out.println(su1 + "/" + su2 + "=" + (su1 / (double) su2));
			break;
		}

	}

}
