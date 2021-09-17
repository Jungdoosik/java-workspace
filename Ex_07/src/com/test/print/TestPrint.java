package com.test.print;

import java.util.Random;
import java.util.Scanner;

public class TestPrint {//for문 사용하기
	public void ex1() {
	      Random r = new Random();
	      final int SECOND = 500;
	      while(true) {
	         
	         
	         int su1 = r.nextInt(10);
	         System.out.println("0 ~ 9 까지의 램덤 수 : " + su1);
	         
	         int su2 = r.nextInt(10)+1;
	         System.out.println("1 ~ 10 까지의 랜덤 수 : " + su2);
	         
	         int su3 = r.nextInt(16)+20;
	         System.out.println("20 ~ 35 까지의 램덤 수 : " + su3);
	         
	         int su4 = r.nextInt(2);
	         System.out.println("0 또는 1 :" + su4);
	         
	         System.out.println();
	         System.out.println("----------------------");
	         System.out.println();
	         
	         try {
	            Thread.sleep(SECOND);
	         } catch (InterruptedException e) {
	            
	            e.printStackTrace();
	         }
	         
	      }
	   }
	   public void ex2() {
	      Random r = new Random();
	      Scanner sc = new Scanner(System.in);
	      while(true) {
	         System.out.println("==== 동전 앞 뒤 맞추기 ====");
	         //유저 선택지(1번은 앞면 / 2번은 뒷면)
	         System.out.print("숫자를 입력해주세요 (1. 앞면 / 2.뒷면)  : ");
	         int su = sc.nextInt();
	         if(su == 0 || su > 3) {
	            System.out.println("잘 못 입력하셨습니다.");
	            System.out.println(); continue;
	         }
	         int su2 = r.nextInt(2)+1;// 동전 추출(친구 손안에 있는 동전)
	         
	         if(su2==su) {
	            System.out.println("맞췄습니다.");
	         }else {
	            System.out.println("떙! 틀렸습니다!");
	         }
	         System.out.println("------------------------>restart");
	         System.out.println();
	      }
	      
	   }
	   public void ex3() {
	      Random r = new Random();
	      Scanner sc = new Scanner(System.in);
	      int don = 500;
	      
	      while(true) {
	         System.out.println("===동전 앞 뒤 맞추기===");
	         System.out.println("현재 소지금 : "+ don + "원");
	         System.out.print("배팅금을 입력해주세요 : "); //배팅금 입력
	         int su1 = sc.nextInt();
	         //배팅금이 현재 소지보다 높다면! 다시 해라고 해야 한다!
	         if(su1 > don || su1 <= 0) {
	            System.out.println("배팅금액이 소지금을 초과하였습니다.");
	            System.out.println(); continue;
	         }
	         System.out.print("숫자를 입력해주세요 (1. 앞면 / 2. 뒷면) : ");
	         int su2 = sc.nextInt();//앞뒤 선택
	         
	         
	         if(su2 == 0 || su2 >2) {
	            System.out.println("잘못입력하셨습니다");
	            System.out.println();continue;
	         }
	         
	         int su3 = r.nextInt(2)+1;
	         if(su3==su2) {
	            System.out.println("맞췄습니다.\n" + su1 + "원을 얻었습니다.");
	            don += su1;
	         }else {
	            System.out.println("떙! 틀렸습니다!\n" + su1+"원을 잃었습니다.");
	            don -= su1;
	         }System.out.println();
	         if(don == 0) {
	            System.out.println("다음에 올때 더 들고와~");break;
	         }
	         
	      }
	   }
	   public void ex4() {
	      Scanner sc = new Scanner(System.in);
	      Random r = new Random();
	      int tie = 1;
	      int win = 1;
	      int lose = 1;
	      while(true) {
	         System.out.println("===== 가위 바위 보 게임 =====");
	         System.out.print("가위 바위 보 중 하나를 선택하세요 (1.가위 / 2.바위 / 3.보) : ");
	         int user = sc.nextInt();
	         
	         if(user >3) {
	            System.out.println("잘못 입력하였습니다.");
	            System.out.println(); continue;
	         }
	         
	         switch(user) {
	         case 1 : System.out.println("유저 : 가위!");break;
	         case 2 : System.out.println("유저 : 바위!");break;
	         case 3 : System.out.println("유저 : 보!");break;
	         }
	         int su1 = r.nextInt(3)+1;
	         
	         if(su1 == 1) {
	            System.out.println("컴퓨터 : 가위!");
	         }else if(su1 == 2) {
	            System.out.println("컴퓨터 : 바위!");
	         }else if (su1 == 3) {
	            System.out.println("컴퓨터 : 보!");
	         }//switch 문과 if문을 알아서 사용하면 되는 듯하다. 하지만 switch에는 break를 꼭 달아야지!
	         
	         if(user == su1) {
	            System.out.println("서로 비겼습니다.");
	         }else if((user == 1 && su1 ==3) || (user == 2 && su1 == 1) || (user == 3 && su1 == 2)) {
	            System.out.println("유저가 승리하였습니다.");
	         }else {
	            System.out.println("유저가 패배하였습니다.");
	         }
	      }
	   }
	   public void ex5() {
	      Scanner sc = new Scanner(System.in);
	      Random r = new Random();
	      int tie = 0;
	      int win = 0;
	      int lose = 0;
	      
	      while(true) {
	         System.out.println("===== 가위 바위 보 게임 =====");
	         System.out.print("가위 바위 보 중 하나를 선택하세요 (1.가위 / 2.바위 / 3.보) : ");
	         int user = sc.nextInt();
	         
	         if(user >3) {
	            System.out.println("잘못 입력하였습니다.");
	            System.out.println(); continue;
	         }
	         
	         switch(user) {
	         case 1 : System.out.println("유저 : 가위!");break;
	         case 2 : System.out.println("유저 : 바위!");break;
	         case 3 : System.out.println("유저 : 보!");break;
	         }
	         int su1 = r.nextInt(3)+1;
	         
	         if(su1 == 1) {
	            System.out.println("컴퓨터 : 가위!");
	         }else if(su1 == 2) {
	            System.out.println("컴퓨터 : 바위!");
	         }else if (su1 == 3) {
	            System.out.println("컴퓨터 : 보!");
	         }//switch 문과 if문을 알아서 사용하면 되는 듯하다. 하지만 switch에는 break를 꼭 달아야지!
	         
	         
	         if(user == su1) {
	            System.out.println("서로 비겼습니다.");
	            tie++;
	            
	         }else if((user == 1 && su1 ==3) || (user == 2 && su1 == 1) || (user == 3 && su1 == 2)) {
	            System.out.println("유저가 승리하였습니다.");
	            win++;
	         }else {
	            System.out.println("유저가 패배하였습니다.");
	            lose++;
	         }System.out.println("현재 스코어 " + win + "승 " + tie + "무 " + lose + "패");
	      }
	   }
	   public void ex6() {
	      Random r = new Random();
	      Scanner sc = new Scanner(System.in);
	      int count = 1;
	      System.out.println("==== Up & Down ====");
	      System.out.println("이 게임은 1 ~ 100 사이의 수 하나를 맞추는 게임입니다.");
	      System.out.println("<< Game Start>>");
	      
	      //랜덤수 추출 (1~100)
	      int master = r.nextInt(100)+1;
	      
	      System.out.println();
	      while(true) {
	         
	         System.out.print("숫자를 입력해 주세요.");
	         int su1 = sc.nextInt();
	         
	         if(su1 < master) {
	            System.out.println("UP!!");
	            count = count + 1;
	         }else if(su1 > master) {
	            System.out.println("DOWN!!");
	            count = count + 1;
	         }else if(su1 == master) {
	            System.out.println("맞추었습니다.");
	            System.out.println(count + "번 만에 맞췄습니다.");
	            count = 0;
	            master = r.nextInt(100)+1;
	         }
	      }
	   }
	   public void ex7() {
	      Random r = new Random();
	      Scanner sc = new Scanner(System.in);
	      System.out.println("==== Up & Down ====");
	      System.out.println("이 게임은 1 ~ 100 사이의 수 하나를 맞추는 게임입니다.");
	      System.out.println("<< Game Start>>");
	      
	      int su = r.nextInt(100)+1;
	      int start = 1;
	      int end = 100;
	      System.out.println("현재 범위 : " + start + " ~ " + end);
	      while(true) {
	         
	         System.out.println("-----User-----");
	         System.out.print("유저 선택 : ");
	         int user = sc.nextInt();
	         
	         try {
	            Thread.sleep(1000);
	         } catch (InterruptedException e) {
	            
	            e.printStackTrace();
	         }
	         
	         
	         if(user<=0 || user>100) {
	            System.out.println("잘못입력하셨습니다.");
	         }else if(user < su) {
	            System.out.println("Up!!");
	            start = user+1;
	         }else if(user > su) {
	            System.out.println("Down!!");
	            end = user-1;
	         }else if(user == su) {
	            System.out.println("정답입니다.");
	            
	            break;
	         }System.out.println("현재 범위 : " + start + " ~ " + end);
	         
	         try {
	            Thread.sleep(1000);
	         } catch (InterruptedException e) {
	            
	            e.printStackTrace();
	         }
	         
	         int com = r.nextInt(100)+1;
	         System.out.println("-----com------");
	         System.out.println("컴퓨터 선택 : " + com);
	         
	         try {
	            Thread.sleep(1000);
	         } catch (InterruptedException e) {
	            
	            e.printStackTrace();
	         }
	         
	         if(com < su) {
	         System.out.println("Up!!");
	         start = com+1;
	         }else if(com >su) {
	            System.out.println("Down!!");
	            end = com-1;
	         }else if(com == su) {
	            System.out.println("정답입니다.");
	           
	            break;
	         }System.out.println("현재 범위 : " + start + " ~ " + end);
	         
	         try {
	            Thread.sleep(1000);
	         } catch (InterruptedException e) {
	            
	            e.printStackTrace();
	         }
	      }
	   }
	   public void ex8() {
		   Random r = new Random();
		   Scanner sc = new Scanner(System.in);
		   int user;
		   int start = 1;
		   int end = 100;
		   
		   System.out.println("====Up & Down====");
		   System.out.println("이 게임은 1~100 사이의 수 하나를 맞추는 게임입니다.");
		   System.out.println("<<Game Start>>");
		   System.out.println("현재 범위 : " + start + " ~ " + end);
		   
		   int suRan = r.nextInt(100)+1;
		   while(true) {
			   System.out.println("-----User-----");
			   System.out.print("유저 선택 : ");
			   user = sc.nextInt();
			  
			     try {
			            Thread.sleep(1000);
			         } catch (InterruptedException e) {
			            
			            e.printStackTrace();
			         }
			     
			   if(user > suRan) {
				   System.out.println("Down!!");
				   end = user -1;
				   System.out.println("현재 범위 : " + start + " ~ " + end);
			   }else if(user < suRan) {
				   System.out.println("Up!!");
				   start = user +1;
				   System.out.println("현재 범위 : " + start + " ~ " + end);
			   }else if(user == suRan) {
				   System.out.println("정답입니다. 정답은 " + suRan + "이였습니다.");
				   break;
			   }
			   
			     try {
			            Thread.sleep(1000);
			         } catch (InterruptedException e) {
			            
			            e.printStackTrace();
			         }
			   
			   int com;
			   System.out.println("-----com-----");
			  
			   do {
				   com = r.nextInt(100)+1;
			  }while(!(start <= com && com <=end));
			  
			   System.out.println("컴퓨터 선택 : " + com);
			   
			     try {
			            Thread.sleep(1000);
			         } catch (InterruptedException e) {
			            
			            e.printStackTrace();
			         }
			     
			   if(suRan > com) {
				   System.out.println("Up!!");
				   start = com +1;
				   System.out.println("현재 범위 : " + start + " ~ " + end);
			   }else if( suRan < com) {
				   System.out.println("Down!!");
				   end = com -1;
				   System.out.println("현재 범위 : " + start + " ~ " + end);
			   }else if (suRan == com) {
				   System.out.println("정답입니다. 정답은 " + suRan + "이였습니다.");
				   System.out.println("당신은 패배하였습니다.");
				   break;
			   }
		   }
	   }
}