package com.test.run;

import com.test.stream.CharacterStreamTest;
import com.test.stream.FileTest;

public class TestMain {

	public static void main(String[] args) {
		//CharacterStreamTest cst = new CharacterStreamTest();
		FileTest f = new FileTest();
		
		f.fileInfo("data11.txt");
		//cst.primaryStreamOutput("data.txt");
		//cst.primaryStreamInput("data.txt");
	}

}
