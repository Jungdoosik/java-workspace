package com.test.socket;

import java.io.DataInputStream;

import java.io.DataOutputStream;

import java.io.IOException;

import java.net.Socket;

import java.util.Scanner;

public class MyClientSocket {
	/*
	- 서버의 Port는 7979로 되어있다.
	
	- 서버의 IP 주소는 192.168.0.10 으로 되어 있다.
	
	- 서버에 접속하면 서버가 먼저 접속 메시지를 보낸다.
	
	- 접속메시지 이후에는 클라이언트가 먼저 메시지를 보낼 수 있다.
	
	- 서버에서 exit 메시지를 보내오면 클라이언트도 종료할 수 있어야 한다.
	
	- 서버와의 연결 종료시 사용되었던 리소스는 모두 close 되어야 한다.
	*/

	Scanner sc = new Scanner(System.in);

	public void start()

	{

		System.out.println("========= 클라이언트 화면 =========");

		String serverIP = "127.0.0.1";

		int serverPort = 7777;

		Socket socket = null;

		DataInputStream dis = null;

		DataOutputStream dos = null;

		try {

			socket = new Socket(serverIP, serverPort);

			dis = new DataInputStream(socket.getInputStream());

			dos = new DataOutputStream(socket.getOutputStream());

			String serverMessage;

			System.out.println("서버에서 보내온 메세지 : " + serverMessage);

			while (true)

			{

				System.out.print("나 : ");

				String send = sc.nextLine();

				if (send.equals("exit"))

				{

					dos.writeUTF("exit");

					break;

				}

				dos.writeUTF(send);

				
				//
				serverMessage = dis.readUTF();

				if (serverMessage == "exit")

				{

					System.out.println("상대방이 접속을 종료하였습니다.");

					break;

				}

				System.out.println("서버가 보낸 메세지 : " + serverMessage);

			}

		} catch (IOException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		} finally {

			try {

				socket.close();

			} catch (IOException e) {

				// TODO Auto-generated catch block

				e.printStackTrace();

			}

		}

	}

}