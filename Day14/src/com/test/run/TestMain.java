package com.test.run;

import java.util.Calendar;

public class TestMain {

	public static void main(String[] args) {
		
		
		
		
		
		
		Calendar today = Calendar.getInstance();
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int today1 = today.get(Calendar.DATE);
		
		
		String week = null;
		switch(today.get(Calendar.DAY_OF_WEEK)) {
		case 1 : week ="일요일"; break;
		case 2 : week ="월요일"; break;
		case 3 : week ="화요일"; break;
		case 4 : week ="수요일"; break;
		case 5 : week ="목요일"; break;
		case 6 : week ="금요일"; break;
		case 7 : week ="토요일"; break;
		}
		System.out.println("----실행(출력)결과----");
		System.out.println(year + "년 " + month + "월 " +  today1+ "일 " + week);
		
		
		/*Date day = new Date(); //현재 날짜 및 시간값을 가지고 있음
		
		SimpleDateFormat ft1 = new SimpleDateFormat("yyyy년MM월dd일HH:mm:ss:SS");
		
		String ft1Today = ft1.format(day);
		
		System.out.println(ft1Today);*/
		
		/*Scanner sc = new Scanner(System.in);
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		
		System.out.println("금일날짜는" + year + "년" + month + "월" + date+ "입니다.");
		System.out.println("몇일 더하시겠습니까?");
		long dday = sc.nextLong();
		long time = cal.getTimeInMillis()+(dday * 24L *60L*60L*1000L);
		cal.setTimeInMillis(time);
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH)+1;
		date = cal.get(Calendar.DATE);
		
		System.out.println("금일날짜는" + year + "년" + month + "월" + date+ "입니다.");*/
		
		/*Date today1 = new Date();
		System.out.println(today1);
	
		Calendar cal = Calendar.getInstance();
		
		Date today2 = new Date(123456789L);
		System.out.println(today2);*/
		
		
		
		
		
		
		
		/*switch(today.get(Calendar.DAY_OF_WEEK)) {
		case 1 : System.out.println("오늘은 일요일 입니다."); break;
		case 2 : System.out.println("오늘은 월요일 입니다."); break;
		case 3 : System.out.println("오늘은 화요일 입니다."); break;
		case 4 : System.out.println("오늘은 수요일 입니다."); break;
		case 5 : System.out.println("오늘은 목요일 입니다."); break;
		case 6 : System.out.println("오늘은 금요일 입니다."); break;
		case 7 : System.out.println("오늘은 토요일 입니다."); break;
		}*/
		
		
		
		
		
		/*System.out.println(today.get(Calendar.YEAR));
		System.out.println(today.get(Calendar.MONTH)+1);
		System.out.println(today.get(Calendar.DATE));
		System.out.println(today.get(Calendar.HOUR_OF_DAY));
		System.out.println(today.get(Calendar.MINUTE ));*/
		
		
		
		/*	String str = "Hello Hi GoodBye";
		
		StringTokenizer st = new StringTokenizer(str," ");
		
		int i = 0;
		while(st.hasMoreTokens()) {
			StringBuilder sb = new StringBuilder(st.nextToken());
			i++;
			
			System.out.println("글자수 : " + sb.length());
			System.out.println(i + "번째 문자열 : " + sb);
			System.out.println();
		}*/
		
		
				

		/*String str = "홍길동 /20/경기도 부천";
		Scanner sc = new Scanner(System.in);
		System.out.print("이름/나이/주소를 입력해주세요! : ");
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str,"/");
		
		String [] data = new String[3];
		
		int i = 0;
		while(st.hasMoreTokens()) {
			data[i] = st.nextToken();
			i++;
		}
		System.out.println("이름 : " + data[0]);
		System.out.println("나이 : " + data[1]);
		System.out.println("주소 : " + data[2]);
		
		
		System.out.println("남아있는 토큰수 : " + st.countTokens());
		System.out.println("첫번째 토큰 : " + st.nextToken());
		System.out.println("토큰이 있는가? : " + st.hasMoreTokens());
		System.out.println();
		System.out.println("남아있는 토큰수 : " + st.countTokens());
		System.out.println("두번째 토큰 : " + st.nextToken());
		System.out.println("토큰이 있는가? : " + st.hasMoreTokens());
		System.out.println();
		System.out.println("남아있는 토큰수 : " + st.countTokens());
		System.out.println("세번째 토큰 : " + st.nextToken());
		System.out.println("토큰이 있는가? : " + st.hasMoreTokens());
		
		
		
		
		StringBuffer sb = new StringBuffer("920404-1122411");
		
		sb.replace(8, 14, "******");
		System.out.println(sb);
		
		System.out.println(sb);
		System.out.println("버퍼길이 : " + sb.capacity());
		
		sb.insert(3, "aa");//offset( 0 번째 부터 몇번째 떨어진거리?)
		System.out.println(sb);*/
	}

}
