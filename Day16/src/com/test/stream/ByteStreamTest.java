package com.test.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest {
	
	public void fileCopy(String src, String dest) {
		FileInputStream fc = null;
		FileOutputStream fo = null;
		
		
		try {
			fc = new FileInputStream(src);
			fo = new FileOutputStream(dest);
			
			while(true) {
			int data = fc.read();
			if(data == -1) {
				break;
			}
			fo.write(data);
			}
		
	
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fc.close();
				fo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	/*//보조 스티림을 이용하여 데이터 전송 속도를 향상
	public void secondaryOutputStream(String fileName) {
		
		BufferedOutputStream bos = null;
		try {
			bos = new BufferedOutputStream(new FileOutputStream(fileName));
			
			String message = "aaaa";
			
			bos.write(message.getBytes());
		
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	public void primaryStreamInput(String fileName) {
		FileInputStream fi = null;
		
		try {
			fi = new FileInputStream(fileName);
		
			int data;
			
			while(true) {
			data = fi.read();
				if(data == -1) {
					break;
				}
			System.out.printf("%c", data);
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fi.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
	
	
	//파일명을 작성하면 해당 파일과 스트림을 연결하여 데이터를 파일에 기록할 수 있도록 하겠음
	public void primarySteramOutput(String fileName) {
		
		FileOutputStream fo = null;
		Scanner sc = null;
		//파일을 연결하려면 가장 먼저 FileOutputStream을 사용해서 파일과 연결을 해야한다.
		try {
			fo = new FileOutputStream(fileName);
			sc = new Scanner(System.in);
			
			while(true) {
				System.out.print("파일에 기록될 데이터 입력 : ");
				String message = sc.nextLine()+"\r\n";
				if(message.equals("exit\r\n")) {
					break;
				}
				
				fo.write(message.getBytes());
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fo.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}*/

	}
}
