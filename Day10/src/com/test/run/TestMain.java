package com.test.run;

import java.util.Random;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {

		//new TestMethod().start();
		
		int[] lotto = new int[6];
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번하시겠습니까? : ");
		int count = sc.nextInt();
		
		for(int k = 0; k < count; k++) {//횟수
		
			for(int j = 0; j <lotto.length; j++) {
				
				int su = r.nextInt(45)+1; //랜덤수 추출
				
				for(int i = 0; i < lotto.length; i++) {//lotto[0]~lotto[5]까지 수를 비교 (만약 같은 수가 랜덤으로 나온다면 다시 추출해서 [0]부터 다시 비교
					if(su==lotto[i]) {
						su = r.nextInt(45)+1;
						i =0;
					}
				}
				lotto[j] = su;
			}
			//버블정렬 오름차순
			for(int i = 0; i<lotto.length-1;i++) {
				for(int j = 0; j<lotto.length-(i+1); j++) {
					if(lotto[j]> lotto[j+1]) {
						int tmp;
						tmp = lotto[j];
						lotto[j]=lotto[j+1];
						lotto[j+1]=tmp;
					}
				}
			}
			//출력코드
			for(int i = 0; i < lotto.length; i++) {
				System.out.printf("%5d" , lotto[i]);
			}
			System.out.println();
		}
	}
}
