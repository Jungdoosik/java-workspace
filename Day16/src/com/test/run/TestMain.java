package com.test.run;

import com.test.stream.ByteStreamTest;

public class TestMain {

	public static void main(String[] args) {
		
		ByteStreamTest b = new ByteStreamTest();
		
		//b.primarySteramOutput("test.txt");
		//b.primaryStreamInput("test.txt");
		//b.secondaryOutputStream("test2.txt");
		b.fileCopy("test.txt", "test2,txt");
	}

}
