package com.test.calculator;

import java.util.Scanner;

public class Cal implements Calculator{

	@Override
	public int add(String su1, String su2) {
		int add = Integer.parseInt(su1) + Integer.parseInt(su2);
		return add;
	}

	@Override
	public int subtract(String su1, String su2) {
		int subtract = Integer.parseInt(su1) - Integer.parseInt(su2);
		return subtract;
	}

	@Override
	public int multiply(String su1, String su2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double divide(String su1, String su2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void start() {
		Scanner sc = new Scanner(System.in);
	}

}
