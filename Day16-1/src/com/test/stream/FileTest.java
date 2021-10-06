package com.test.stream;

import java.io.File;

public class FileTest {

	public void fileInfo(String fileName) {
		
		File f = new File(fileName);
		
		if(f.exists()) {
			System.out.println(f.getName());
			System.out.println(f.getPath()); //상대 경로 : 현재 위치로 부터의 경로
			System.out.println(f.getAbsolutePath()); //절대 경로 : 가장 최상위 디렉토리로부터의 경로
			System.out.println(f.length());
		}else {
			System.out.println("해당 파일은 없습니다.");
		}
		
	}
}
