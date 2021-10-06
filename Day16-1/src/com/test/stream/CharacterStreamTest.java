package com.test.stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharacterStreamTest {
	
	
	public void primaryStreamInput(String fileName) {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			while(true) {
			String message = br.readLine();
			if(message == null) {
				break;
			}
			System.out.println(message);
			}
					/*
			while(true) {
				
				int data = fr.read();
				if(data == -1) {
					break;
				}
				
				System.out.printf("%c", data);
			}*/
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void primaryStreamOutput(String fileName) {
		
		FileWriter fw = null;
		Scanner sc = null;
		
		
		try {
			fw = new FileWriter(fileName);
			sc = new Scanner(System.in);
			
			while(true) {
				System.out.print("문자열 입력 : ");
				String message = sc.nextLine();
				
				if(message.equals("exit")) {
					break;
				}
				//문자 스티림은 문자열을 변환하지 않고, 바로 전송이 가능하다
				fw.write(message + "\r\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
