package com.test.run;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Cal().start();
		
		HashMap map = new HashMap();
		
		 // map.put(key, value); // map.put 하고 엔터를 치면 기본적인 형태가 나옴 -> 바로 key:value
		
		map.put(1, "홍길동");
		map.put(2, "김말똥");
		map.put(3, "고길똥");
		
		System.out.println(map);
		
		
		map.put(2, "둘리");
		System.out.println(map);
	
		
		map.put(1, "홍길동");
		map.put(2, "김말똥");
		map.put(3, "고길똥");
		
		System.out.println("추출한 데이터 : " + map.get(2));
		

		
		map.put(1, "홍길동");
		map.put(2, "김말똥");
		map.put(3, "고길똥");

		
		Set<Integer> key = map.keySet();  //key값들만 추출
		ArrayList<Integer> list = new ArrayList<Integer>(key);		
		
		
		for(int i=0;i<map.size();i++)
		{
			System.out.println("key : " + list.get(i) + " / value : " + map.get(list.get(i)));
		}
	}

}
