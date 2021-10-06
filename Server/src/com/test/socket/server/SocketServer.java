package com.test.socket.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketServer {
	/*1. 서버의 포트 번호를 정함 (ex. 6666, 7777 등)
	2. 클라이언트쪽에서 서버를 접속 할 수 있도록 대기 상태 구현 (서버 소켓)
	3. 접속 요청이 들어오면 수락하고 클라이언트와의 소켓 객체를 구현
	4. 클라이언트와 정보(데이터)를 주고 받을 수 있도록 입출력 스트림 구현
	5. 데이터를 주고 받는 코드 구현
	6. 통신을 종료하기 위한 코드 구현*/
	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==========Server화면===========");
		int port = 8888;
		
		try {
			//2번 구현
			ServerSocket ss = new ServerSocket(port);
			
			Socket SocketClient = ss.accept();
			
			OutputStream os = SocketClient.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			InputStream is = SocketClient.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			while(true) {
				System.out.print("보낼 메세지 : ");
				String message = sc.nextLine();
				dos.writeUTF(message);
				
				if(message.equals("exit")) {
					System.out.println("Server에서 연결을 해제 하였습니다.");
					break;
				}
				
				String sendMessage = dis.readUTF();
				if(sendMessage.equals("exit")) {
					System.out.println("Client에서 연결을 해제 하였습니다.");
					break;
				}
				System.out.println("Client : " + sendMessage);
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
