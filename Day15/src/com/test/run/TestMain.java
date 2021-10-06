package com.test.run;

import java.awt.image.AreaAveragingScaleFilter;

import com.test.exception.DataOverFlowException;
import com.test.print.Cal;

public class TestMain {

	public static void main(String[] args) {
		try {
		Cal c = new Cal();
		c.start();
		}catch(DataOverFlowException e) {
			System.out.println("1 ~ 100 사이의 수만 입력해주세요");
		}
		/*ArrayList<Member> list = new ArrayList<Member>();
		
		list.add(new Member("홍길동", 20, "경기도 부천"));
		list.add(new Member("김길동", 30, "서울시 양천"));
		list.add(new Member("고길동", 40, "부산시 서면"));
		
		//list에 저장된 데이터를 정렬할 떄에는 sort를 사용하여 손쉽게 정렬할수 있다.
		//단, 들어이쓴ㄴ 데이터가 정수일떄만 가능하다
		//그렇다면 객체를 정렬하고 싶다면?ex. Member 객체
		//Member 객체를 가지고 정렬할 수 있도록 기준을 정해주어야 한다.
		//기준을 정해주는 방법은  Member객체에 compareTo라는 메소드를 오버라이딩(메소드 재정의)
		//해주어야한다.
		//단, 오버라이딩을 해주려면 Comparable Interface Implements 해야 재정의 할 수 있다.
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		for(Member m : list) {
			System.out.println("이름 : " + m.getName());
			System.out.println("나이 : " + m.getAge());
			System.out.println("주소 : " + m.getAddr());
			System.out.println();
			
		}*/
		
		
		//new Member();
		
		/*for(int i =0; i<list.size(); i++) {
			System.out.println("이름 : " + list.get(i).getName());
			System.out.println("나이 : " +list.get(i).getAge());
			System.out.println("주소 : " +list.get(i).getAddr());
			System.out.println();
		}*/
		
		
		
		/*ArrayList list = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.print("정수 입력  : ");
		int su = sc.nextInt();
		if(su==0) break;
		list.add(su);
		}
		System.out.println("들어있는 데이터 : " + list);
		System.out.println("데이터의 총 개수 : " + list.size());
		
		System.out.println("-----------정렬후-----------");
		Collections.sort(list);
		System.out.println("오름차순 : " + list);
		
		
		System.out.println("-----------정렬후-----------");
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("내림차순 : " + list);
		/*list.add(100);
		
		System.out.println("데이터 : " + list);
		System.out.println("길이 : " + list.size());
		System.out.println();
		
		list.add(200);
		System.out.println("데이터 : " + list);
		System.out.println("길이 : " + list.size());
		System.out.println();
		
		list.add(300);
		System.out.println("데이터 : " + list);
		System.out.println("길이 : " + list.size());
		System.out.println();
		
		list.add(400);
		System.out.println("데이터 : " + list);
		System.out.println("길이 : " + list.size());
		System.out.println();
		
		list.add(500);
		System.out.println("데이터 : " + list);
		System.out.println("길이 : " + list.size());
		System.out.println();
		
		list.remove(2);
		System.out.println("데이터 : " + list);
		System.out.println("길이 : " + list.size());
		System.out.println();
		
		System.out.println("2번쨰 데이터 : " + list.get(2));
		System.out.println("길이 : " + list.size());
		System.out.println();
		
		list.set(2, 999);
		System.out.println("데이터 : " + list);
		System.out.println("길이 : " + list.size());
		System.out.println();
		
		System.out.println("데이터 존재 여부 : " + list.isEmpty());
		list.clear();
		System.out.println("데이터 : " + list);
		System.out.println("길이 : " + list.size());
		System.out.println();
		System.out.println("데이터 존재 여부 : " + list.isEmpty());*/
	}

}
