package com.test.calculator;

import java.util.Scanner;

public class Cal implements Calculator {

	@Override
	public int add(String su1, String su2) {
		int p = Integer.parseInt(su1) + Integer.parseInt(su2);
		return p;
	}

	@Override
	public int subtract(String su1, String su2) {
		int m = Integer.parseInt(su1) - Integer.parseInt(su2);
		return m;
	}

	@Override
	public int multiply(String su1, String su2) {
		int x = Integer.parseInt(su1) * Integer.parseInt(su2);
		return x;
	}

	@Override
	public double divide(String su1, String su2) {
		double d = Integer.parseInt(su1) / (double) Integer.parseInt(su2);
		return d;
	}

	@Override
	public void start() {
		Scanner sc = new Scanner(System.in);

		System.out.print("연산자 입력 : ");
		char yun = sc.next().charAt(0);

		System.out.print("첫번째 숫자 입력 : ");
		String su1 = sc.next();

		System.out.print("두번째 숫자 입력 : ");
		String su2 = sc.next();

		switch (yun) {
		case '+':
			System.out.println(su1 + "+" + su2 + "=" + add(su1, su2));
			break;
		case '-':
			System.out.println(su1 + "-" + su2 + "=" + subtract(su1, su2));
			break;
		case '*':
			System.out.println(su1 + "*" + su2 + "=" + multiply(su1, su2));
			break;
		case '/':
			System.out.println(su1 + "/" + su2 + "=" + divide(su1, su2));
			break;

		}

	}

}
