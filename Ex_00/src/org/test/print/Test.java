package org.test.print;

import java.util.Scanner;

public class Test {
	public void bubbleSort() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 정수 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		
		for(int j = 0; j < arr.length-1; j++){
			for(int i = 0; i < (arr.length-1)-j; i++){
				if(arr[i]<arr[i+1]) {
					int tmp;
					tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "   ");
		}
	}
}
