package com.test.print;

import java.util.Scanner;

class Camera {
	Scanner sc = new Scanner(System.in);
	String brandName = "canon";
	String modelName = "canon-50d";
	String pixel = "1550만 화소";
	String color = "black";
	int price = 700000;
	boolean power = false;
	
	public void cameraOn() {
		while(true) {
			if(power == false) {
				System.out.print("사용하시겠습니까? : ");
				char select = sc.next().charAt(0);
				
				switch(select) {
				case 'Y' :power = true; break; 
				case 'N' :power = false; return; 
				}
			}else if(power == true) {
				System.out.println("1. camera정보 보기");
				System.out.println("2. 기능변경");
				System.out.println("3. 셔터누르기");
				System.out.println("4. camera off");
				System.out.print("선택 : ");
				int select = sc.nextInt();
				
				switch(select) {
				case 1 : cameraInfor(); break;
				case 2 : optionChange(); break;
				case 3 : shutterclick(); break;
				case 4 : die(); return;
				}
			
			}
		}
	}
	public void cameraInfor() {
		System.out.println("=====제품 설명=====");
		System.out.println("brandName : " + brandName);
		System.out.println("modelName : " + modelName);
		System.out.println("pixel : " + pixel);
		System.out.println("color : " + color);
		System.out.println("price : " + price);
		System.out.println("===============");
		System.out.println();
	}
	public void optionChange() {
		System.out.println("1. 조리개 설정");
		System.out.println("2. 셔터스피드  설정");
		System.out.println("3. iso 설정");
		System.out.println("어떤 기능을 선택하시겠습니까?");
		int i = sc.nextInt();
		
		if(i==1) {
			System.out.println("조리개 설정 : ");
			int j = sc.nextInt();
		}else if(i==2) {
			System.out.println("셔터스피드 설정 : ");
			int j = sc.nextInt();
		}else if(i==3) {
			System.out.println("iso 설정");
			int j = sc.nextInt();
		}
	}
	
	public void shutterclick() {
		System.out.println("찰칵!");
	}
	public void die() {
		System.out.println("이제 좀 쉴꼐요");
	
	}
}





public class TestJava {

	public static void main(String[] args) {
		new Camera().cameraOn();
		
	}

}
