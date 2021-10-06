package com.test.member.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class MemberController {
	
	private ArrayList<String> list = new ArrayList<String>();
	String dbId = "User11"; //DB의 ID
	String dbPw = "8585";//DB의 PW
	
	public MemberController() {
		list.add("홍길동");
		list.add("김말똥");
		list.add("고길동");
		list.add("유비");
		list.add("관우");
		list.add("장비");
	}
	public void start() {
		//properties 파일에 있는 내용을 읽어서 가져오도록 하겠습니다.
		Properties prop = new Properties();
		
		try {
			prop.load(new FileReader("resources/Login.Properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String id = prop.getProperty("id");
		String pw = prop.getProperty("pw");
		
		
		
		//시나리오
		//개발자가 만든 프로그램이
		//DB에 ID와PW를 통해서 접근하여
		//회원의 정보를 가져오는 프로그램
		
		/*String id = "User11";
		String pw = "1234";*/
		
		boolean connection = getDbConnection(id,pw);
		
		if(connection == true) {
			System.out.println("------고객정보 출력-------");
			for(String name : list) {
				System.out.println(name);
			}
		}else {
			System.out.println("DB연결 실패!! (ID/PW확인요망)");
		}
		
	}
	public boolean getDbConnection(String id, String pw) {
		//해당 메소드는 id와pw를 보내서 DB와 일치하다면
		//ture 리턴, 일치하지 않으면 false를 리턴
		
		if(id.equals(dbId)==true && pw.equals(dbPw)==true) {
			return true;
		}else {
			return false;
		}
		
	}

}
