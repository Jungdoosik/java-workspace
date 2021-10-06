package com.test.socket.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServerSocket {
	/*1. 서버의 포트 번호를 정함 (ex. 6666, 7777 등)
	2. 클라이언쪽에서 서버를 접속 할 수 있도록 대기 상태 구현 (서버 소켓)
	3. 접속 요청이 들어오면 수락하고 클라이언트와의 소켓 객체를 구현
	4. 클라이언트와 정보(데이터)를 주고 받을 수 있도록 입출력 스트림 구현
	5. 데이터를 주고 받는 코드 구현
	6. 통신을 종료하기 위한 코드 구현*/
	public void start() {
		System.out.println("========== Server 화면 ==========");
		//통신을 위한 레퍼런스 모음
		ServerSocket ss = null;
		Socket clientSocket = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		//1.  서버의 포트번호를 정함
		int port = 6666;

		try {
			//2.클라이언트 쪾에서 서버를 접속할 수 있도록 서버 소켓 구현
			ss = new ServerSocket(port); //Sever Socket생성 (여기까지가 서버소켓생성하는과정)//try catch까지
			
			
			//3. 접속 요청이 들어오면 수락하고 클라이언트와의 소켓 객체를 구현
			clientSocket = ss.accept();
			
			//clientSocket.getInetAddress 입력하면 다른사람이 내꺼에 접속했을떄 IP를 볼수 있음
			//System.out.println(clientSocket.getInetAddress() + "님이 접속하셨습니다.");
			//4.클라언트와 정보(데이터 )를 주소 받을 수 있도록 입출력 스트림 구현
			
			//서버에서 -> 클라이언트(OutputStream)
			OutputStream os = clientSocket.getOutputStream();
			dos = new DataOutputStream(os);
			
			InputStream is = clientSocket.getInputStream();
			dis = new DataInputStream(is);
			
			
			//5.데이터를 주고 받는 코드 구현
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				System.out.print("보낼메세지 : ");
				String message = sc.nextLine();
				
				//서버 -> 클라이언트로 데이터 전달
				dos.writeUTF(message);//클라이언트에게 메세지 전달
				
				if(message.equals("exit")) {
					System.out.println("클라이언트와의 연결을 종료하였습니다.");
					break;
				}
				
				//클라이언트 - > 서버로 데이터 전달(받아 주어야함)
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
		}finally {
			try {
				dos.close();//DataOutputSocket해제
				dis.close();//DataInputSocket해제
				clientSocket.close();//Socket해제
				ss.close();//ClientSocket해제
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
