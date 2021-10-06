package com.test.run;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[2];
		
		System.out.print("정수를 입력하세요 : ");
		arr[2] = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("잘못된 데이터를 입력하셨습니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 길이와 맞지않는 데이터를 사용중입니다.");
		}catch(Exception e) {
			System.out.println("에러야 그만 나와유 ㅜㅜ");
		}
		
		/*Scanner sc = new Scanner(System.in);
		
		
		try{
			System.out.print("첫번째 정수 : ");
			int su1 = sc.nextInt();
			System.out.print("두번째 정수 : ");
			int su2 = sc.nextInt();
			System.out.println("결과 : " +su1 + "+" + su2 + "=" + (su1+su2));
		}catch(Exception e) {
			System.out.println("------삐 잘못입력하셨습니다.------");
			
		}finally {
			sc.close();
			System.out.println("-------어저라고=======");
		}*/
		
		
		
		
		
		
		/*Scanner sc = new Scanner(System.in);
		Date d = new Date();
		
		
		
		
		
		System.out.print("연산자를 입력하세요(+,-,*,/) :  ");
		char yun = sc.next().charAt(0);
		
		System.out.print("첫번째 수를 입력하세요 : ");
		int su1 = sc.nextInt();
		
		System.out.print("두번째 수를 입력하세요 : ");
		int su2 = sc.nextInt();
		
		System.out.println("-----결과출력-----");
		
		switch(yun) {
		case '+' : System.out.println(su1 + " + " + su2 + " = " + (su1+su2));break;
		case '-' : System.out.println(su1 + " - " + su2 + " = " + (su1-su2));break;
		case '*' : System.out.println(su1 + " * " + su2 + " = " + (su1*su2));break;
		case '/' : System.out.println(su1 + " / " + su2 + " = " + (su1/(double)su2));break;
		
		}*/
		
		
		
		
		
		/*Date today = new Date();

		SimpleDateFormat ft1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat ft2 = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SS");

		String ft1Today = ft1.format(today);
		String ft2Today = ft2.format(today);
		//today에 포맷을 적용한 결과를 문자열로 리턴
		
		System.out.println(ft1Today);
		System.out.println(ft2Today);*/
		
		
		
		/*Scanner sc = new Scanner(System.in);
		Calendar today = Calendar.getInstance();
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int date = today.get(Calendar.DATE);
		
		System.out.println("금일 날짜는 " + year +"년 " + month + "월 " + date + "일 입니다." );
		
		System.out.print("몇 일 더하시겠습니까? : ");
		long dday = sc.nextLong();
		
		long time = (today.getTimeInMillis()) + (dday * 60L *60L *24L*1000L);
		today.setTimeInMillis(time);
		
		 year = today.get(Calendar.YEAR);
		 month = today.get(Calendar.MONTH)+1;
		 date = today.get(Calendar.DATE);
		
		System.out.println("금일 날짜는 " + year +"년 " + month + "월 " + date + "일 입니다." );*/
		
		
		//long형 정수값을 가지고 날짜 시간 계산함(밀리초)
		//1970년 1월 1일 09시 00분 00초를 기준으로 함.
		//Date today = new Date(Calendar.getTimeMillis());
		
		
		
		/*String str = "Hello Hi Goodbye";
		StringTokenizer st = new StringTokenizer(str," ");
		
		int i=1;
		while(st.hasMoreTokens()) {
			StringBuffer sb = new StringBuffer(st.nextToken());
			System.out.println("글자수 : " + sb.length());
			System.out.println(i+"번쨰 : "+ sb);
			i++;
		}
		
		Calendar to = Calendar.getInstance();
		
		System.out.println(to.get(Calendar.YEAR));//년
		System.out.println(to.get(Calendar.MONTH)+1);//월
		System.out.println(to.get(Calendar.DATE));//일
		System.out.println(to.get(Calendar.HOUR_OF_DAY));//시간
		System.out.println(to.get(Calendar.MINUTE));//분 
		System.out.println(to.get(Calendar.DAY_OF_WEEK));//요일 
		to.set(Calendar.YEAR,1998);
		System.out.println(to.get(Calendar.DAY_OF_WEEK));
		System.out.println(to.get(Calendar.YEAR));//바꿈
		System.out.println(to.get(Calendar.DATE));*/
		
		/*PntMgr mgr = new PntMgr();
		
		mgr.insertData(new Silver("홍길동","silver",1000));
		mgr.insertData(new Silver("김말똥","silver",2000));
		mgr.insertData(new Silver("똥똥이","silver",3000));
		mgr.insertData(new Gold("김골드","Gold",3000));
		mgr.insertData(new Gold("박골드","Gold",2000));
		mgr.insertData(new Vip("비이드","Vip",4000));
		mgr.insertData(new Vip("보이드","Vip",5000));
		mgr.insertData(new Platinum("플래드","Platinum",3000));
		mgr.insertData(new Platinum("플친드","Platinum",3000));
		mgr.printData();*/

	}

}