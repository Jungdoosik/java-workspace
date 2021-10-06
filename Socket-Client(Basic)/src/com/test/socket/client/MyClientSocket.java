package com.test.socket.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyClientSocket {
	/*
	1. 서버의 IP 주소와 포트번호 입력 (접속할 서버)
	2. 서버를 접속하기 위한 클라이언트 소켓 생성
	3. 서버와의 입출력 스트림을 오픈 함 (서버가 만든것과는 별개)
	4. 데이터를 주고 받는 코드 구현
	5. 통신을 종료하기 위한 코드 구현
	 */
	public void start() {
		System.out.println("========= Client 화면 =========");
		
		Socket s = null;
		DataInputStream dis = null; 
		DataOutputStream dos = null;
		//1.서버의 IP주소와 포트번호 입력( 접속할 서버)
		String serverIP = "192.168.0.6"; //127.0.0.1 이라는 IP는 무조건 내 IP
		int serverPort = 6666;
		/*
		 (PC혹은 Server는 고유의 IP주소를 가지고 있는데
		 이떄 본인이 바라보는 본인을 표현하는 주소가 있다.
		 	->그것을 바로 loopback 주소
		 	->loopback 주소는 127.0.0.1
		 	*/
		
		
		//2.서버를 접속하기 위한 클라이언트 소켓 생성
		try {
			s = new Socket(serverIP,serverPort);
			
			//3. 서버와의 입출력 스트림을 오픈 함 (서버가 만든것과는 별개)
			InputStream is = s.getInputStream();
			dis = new DataInputStream(is);
			Scanner sc = new Scanner(System.in);
			
			
			OutputStream os = s.getOutputStream();//바이트 형태로만 보낼수 있음
			dos = new DataOutputStream(os);//바이트 형태로만 보낼수 있는것을 문자열로 보낼수있게 변환
			
			while(true) {
				//4.데이터를 주고 받는 코드 구현
				String message = dis.readUTF(); //서버 -> 클라이언트로 보낸 메세지를 받기
				
				if(message.equals("exit")) {
					System.out.println("Server에서 연결을 해제 하였습니다.");
					break;
				}
				System.out.println("Server : " + message);
				
				System.out.print("보낼메세지 : ");
				String sendMessage = sc.nextLine();
				dos.writeUTF(sendMessage);
				
				if(sendMessage.equals("exit")) {
					System.out.println("Server와의 연결을 종료하였습니다.");
					break;
				}
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				dos.close(); //DataOutputStream 해제
				dis.close();//DataInputStream 해제
				s.close(); //Socket해제
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
