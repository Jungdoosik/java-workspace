package com.test.member.cotroller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.test.member.model.vo.Member;

public class MemberController {
	
	public void save() {
		//Save와 Load라는 기능을 구현한다고 가정
		
		Member m = new Member("홍길동",20,"경기도");
		ObjectOutputStream oos = null;
		try {
			FileOutputStream fos = new FileOutputStream("save.dat");
			oos = new ObjectOutputStream(fos);
			
			//Object 보조 스트림을 통해서 객체 전달
			oos.writeObject(m);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void load(String fileName) {
		
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream(fileName));
			
			Member m = (Member)ois.readObject();
			
			System.out.println(m);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
