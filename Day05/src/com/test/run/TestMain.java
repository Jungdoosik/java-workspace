package com.test.run;

import java.util.Random;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		  
		
		//랜덤수를 추출하려면 사용하는 Class? Random Class
	      Random r = new Random();
	      
	      //int su = r.nextInt();//난수를 뽑아내는 메소드
	      
	      //만약에 주사위 (1~6) 범위의 수가 필요하다면?
	      
	      //nextint 안에 숫자를 주게되면, 범위가 조절됨
	      //숫자를 주게되면 0~ 해당 숫자의 -1 까지
	      //ex) nextInt(6) -> 0~5
	     /* final int SECOND = 500;
	      while(true) {
	         // 0 ~ 9
	         int su = r.nextInt(10)+5;
	         System.out.println(su);
	         
	         try {
	            Thread.sleep(SECOND);
	         } catch (InterruptedException e) {
	            
	            e.printStackTrace();
	         }
	      }*/
	      
	      
	      /*int[] arr = new int[5];
	      
	      //arr의 index 0번쨰 공간
	      arr[0] = 100;
	      arr[1] = 200;
	      arr[2] = 300;
	      arr[3] = 400;
	      arr[4] = 500;
	      
	      System.out.println("첫번째 데이터 :" + arr[0]);
	      System.out.println("두번째 데이터 :" + arr[1]);
	      System.out.println("세번째 데이터 :" + arr[2]);
	      System.out.println("네번째 데이터 :" + arr[3]);
	      System.out.println("다섯번째 데이터 :" + arr[4]);

	      //기존 변수와 배열의 차이점
	      int a;// 쓰레이값(Stack 메모리에 생성하기 떄문에
	      int [] arr1 = new int [5];//0으로 초기화가 기본으로 되어있슴*/
	      
	      int [] arr = new int[5];
	      
	      int index = 0;
	      
	      arr[index] = 100; //몇 번째 공간에 데이터 100을 넣는 것일까?(index값이 0임)
	      
	      arr[index++] = 100;
	      arr[index++] = 200;
	      arr[index++] = 300;
	      arr[index++] = 400;
	      arr[index++] = 500;
	      
	      for(int i = 0; i <5; i++) {
	         arr[i] = (i+1) * 100;
	      }
	      System.out.println(arr[0]);
	      System.out.println(arr[1]);
	      System.out.println(arr[2]);
	      System.out.println(arr[3]);
	      System.out.println(arr[4]);
	      
	      /*for(int i=0; i<5; i++) {
	         arr[i]= (i+1) * 100;
	      }
	      for(int i = 0; i < 5; i++) {
	         System.out.println(arr[i]);
	      }
	      
	      int [] arr2 = new int[5];
	      Scanner sc = new Scanner(System.in);
	      
	      for(int i =0; i <5;i++) {
	         System.out.print((i+1)+"번째 데이터 입력 : ");
	         arr[i] = sc.nextInt();
	      }
	      System.out.println("===== 입력한 데이터 출력 =====");
	      for(int i = 0; i<5; i++) {
	         System.out.println("arr["+ i + "] : " + arr[i]);
	      }*/
	   }
}

	      
  



