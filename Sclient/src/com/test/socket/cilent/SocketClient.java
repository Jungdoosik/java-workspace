package com.test.socket.cilent;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketClient {
	/*
	1. 서버의 IP 주소와 포트번호 입력 (접속할 서버)
	2. 서버를 접속하기 위한 클라이언트 소켓 생성
	3. 서버와의 입출력 스트림을 오픈 함 (서버가 만든것과는 별개)
	4. 데이터를 주고 받는 코드 구현
	5. 통신을 종료하기 위한 코드 구현
	 */
	
	public void start() {
		System.out.println("=========Client 화면=========");
		String serverIP = "192.168.0.6"; 
		int serverPort = 8888;
		
		try {
			Socket s = new Socket(serverIP, serverPort);
			
			InputStream is = s.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			Scanner sc = new Scanner(System.in);
			
			OutputStream os = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			
			while(true) {
				String message = dis.readUTF();
				if(message.equals("exit")) {
					System.out.println("Server에서 연결을 해제 하였습니다.");
					break;
				}
				System.out.println("Server : " + message);
				
			
				System.out.print("보낼메세지 : ");
				String sendMessage = sc.nextLine();
				dos.writeUTF(sendMessage);
				
				if(sendMessage.equals("exit")) {
					System.out.println("클라이언트에서 연결을 종료하였습니다.");
					break;
				}
			}
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
