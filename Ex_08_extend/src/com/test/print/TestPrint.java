package com.test.print;

import java.util.Random;

public class TestPrint {
	public void ex1() {
		char[] data = {'r','e','v','e','r','s','e'};
		
		System.out.println(data);
		
		int tmp;
		for(int i = 0; i < data.length-1; i++) {
			for(int j = 0; j < data.length-1; j++) {
			
			tmp = data[j];
			data[j] = data[j+1];
			data[j+1]= (char)tmp;
			
			}
		}
		for(int i = 0; i < data.length-1; i++) {
			System.out.println(data[i]);
		}
	
	}
	public void ex4() {
		//로또는 중복되지 않는 번호 6개를 저장해야함
		int[] lotto = new int[6];
		//로또로 만들어지는 번호는 랜덤으로 추출해야함
		Random r = new Random();
		
		//로또 번호는 1~45 사이의 랜덤 수
		int su = r.nextInt(45)+1; //1~45의수
		
		//추출된 번호는 그냥 데이터를 넣는게 아니고,
		//그 배열안에 새롭게 추출된 데이터와 중복되는 경우가 있는지를 검증하고 넣어야 한다.
		
		
		for(int i = 0; i < 6; i++) {
			if(su == lotto[i]) //중복되는 데이터가 발견되면
			{
				//랜덤수를 재추출
				su = r.nextInt(45)+1;
				
				//검증하는 횟수를 0으로 초기화해서 다시 반복문을 돌려라
				i = 0;
			}
		}
		/*if(lotto[0]==su) {
			//같은 수가 있을 경우
		}
		if(lotto[1]==su) {
			//같은 수가 있을 경우
		}
		if(lotto[2]==su) {
			//같은 수가 있을 경우
		}
		if(lotto[3]==su) {
			//같은 수가 있을 경우
		}
		if(lotto[4]==su) {
			//같은 수가 있을 경우
		}
		if(lotto[5]==su) {
			//같은 수가 있을 경우
		}*/
		
	}
}
