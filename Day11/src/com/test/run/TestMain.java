package com.test.run;

import java.util.Scanner;

class TV{
	//tv class의 멤버변수(다른말로 멤버필드)
	String brandName = "LG";
	int price = 200000;
	String modelName = "LG-2021001";
	String color = "검정색";
	int channel = 1;
	int sound = 1;
	boolean power = false; //false 면 off상태, true 면 on 상태
	
	//tv class의 멤버 메소드
	public void remoteStart() {
		// 이 메소드는 TV객체를 시작시키는 메소드
		while(true) {
			System.out.println("===== Menu =====");
			if(power == false) {//off 상태였다면
				Scanner sc = new Scanner(System.in);
				System.out.print("TV를 켜시겠습니까? (Y/N) :");
				char select = sc.next().charAt(0);
				
				switch(select) {
				case 'Y' : 
					power = true; 
					break;
				case 'N' : 
					power = false;
					return; //리모컨 메소드를 종료
					
				}
			}else if(power == true) {//on 상태였다면
				Scanner sc = new Scanner(System.in);
				System.out.println("1. TV정보 보기");
				System.out.println("2. 채널변경");
				System.out.println("3. 음량변경");
				System.out.println("4. TV off");
				System.out.print("선택 : ");
				int select = sc.nextInt();
				
				switch(select) {
				case 1 : tvInformationPrint();break;
				case 2 : channelSwitch();break;
				case 3 : break;
				case 4 : powerOff();break;
				}
			}
		}
	}
	public void tvInformationPrint() 
	{
		System.out.println("****** TV 정보 ******");
		System.out.println("TV 제조사 : " + brandName);
		System.out.println("TV 가격 : " + price);
		System.out.println("TV 모델명 : " + modelName);
		System.out.println("TV 색상 : " + color);
		System.out.println("******************");
	}
	public void powerOn() 
	{
	}
	public void powerOff() 
	{
		power = false; //power값을 false 바꾸면 off된다.
		System.out.println("Tv전원을 껏습니다.");
	}
	public void channelSwitch() 
	{
		System.out.println("--------채널변경--------");
		System.out.println("현재 채널 : " + channel);
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번 채널로 변경하시겠습니까? (번호입력) : ");
		channel = sc.nextInt();
		
		System.out.println(channel + "로 채널이 변경되었습니다.");
	}
	public void soundSwitch() 
	{
	}
}

//객체지향 프로그래밍을 하기 위한 절차
//대상선정 -> 추상화 -> 클래스제작 -> 인스턴스화(객체화)
//속성(class)
//기능(메소드)

//대상선정 : tv->객체
//추상화 : 선정한 대상으 바탕으로 속성과 기능으로 분류
//속성 : 크기(사용안함), 화질(사용안함), 브랜드명, 브랜드가격, 모델명, 색상, 채널 , 음량
//속성값 예시
//브랜드명 : LG  		String brandName
//가격 : 200000	  	int prince
//모델명 : LG-2021001	String modelName
//색상 : 검정색			String color
//채널 :1 (1~999) 	int channel
//음량 :1 (0~100)  	int sound
//기능 : 켜다, 끄다 , 채널 변경, 음량 변경
//기능값예시(메소드명)
//켜다  				poweron
//끄다				powerOff
//채널변경				channelswitch
//음량변경				soundswitch
//(프로그래밍에서 사용할 속성과 기능을 추려내야 완전한 추상화 작업을 했다고 볼 수 있다.)
public class TestMain {

	public static void main(String[] args) {
		
		new TV().remoteStart();
	
	}

}
