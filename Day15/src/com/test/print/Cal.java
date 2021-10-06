package com.test.print;

import java.util.Scanner;

import com.test.exception.DataOverFlowException;

public class Cal {
	
	public void start() throws DataOverFlowException {
		
		//1~100까지만 입력 가능한 계산기
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번쨰 정수를 입력하세요(1~100) : ");
		int su1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력하세요(1~100) : ");
		int su2 = sc.nextInt();
		
		add(su1,su2);
	}
	
	public void add(int su1, int su2) throws DataOverFlowException {
		
		if((1 <=su1 && su1 <=100) && (1 <=su2 && su2 <=100)) {
			System.out.println("두개의 정수를 합한 결과 : " + (su1+su2));
			
		}else {
			throw new DataOverFlowException();
		}
		
	}
	
		/*public void start() throws DataOverFlowException
		{
			//1 ~ 100까지만 입력 가능한
			
			Scanner sc = new Scanner(System.in);
			System.out.print("첫번째 정수를 입력하세요(1~100) : ");
			int su1 = sc.nextInt();
			
			System.out.print("두번째 정수를 입력하세요(1~100) : ");
			int su2 = sc.nextInt();
			
			add(su1,su2);
		}
		
		public void add(int su1, int su2) throws DataOverFlowException
		{
			// 첫번째 수가 1~ 100 , 두번째 수가 1 ~ 100 이여야만 정상 동작
			if((1<=su1&&su1<=100) && (1<=su2&&su2<=100))
			{
				System.out.println("두개의 정수를 합한 결과 : " + (su1+su2));
			}
			else //그렇지 않으면 무조건 Exception
			{
				
			}	
		}*/

		/*Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력하세요(1~100 : ");
		int su1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력하세요 :1~100 ");
		int su2 = sc.nextInt();
		
		add(su1, su2);
	}
	
	public void add(int su1, int su2) {
		
		if(su1==0||su2==0) {
			throw new ArithmeticException();
		}
		
		System.out.println("두개의 정수를 합한 결과 : " + (su1+su2));*/
	}
	


