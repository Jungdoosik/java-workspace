package com.test.point;

public class PntMgr {
	private Grade [] g = new Grade[20];
	private int index = 0;
	/*private Silver [] s = new Silver[10];
	private Gold [] g = new Gold[10];
	private Vip [] v = new Vip[10];
	private Platinum [] p = new Platinum[10];
	private int index1 = 0;
	private int index2 = 0;
	private int index3 = 0;
	private int index4 = 0;*/
	
	public void insertData(Grade g) {
		this.g[index++] = g;
	}
	
	/*public void insertData(Silver s) {
		this.s[index1++] = s;  
	}
	public void insertData(Gold g) {
		this.g[index2++] = g;  
	}
	public void insertData(Vip v) {
		this.v[index3++] = v;  
	}
	public void insertData(Platinum p) {
		this.p[index4++] = p;  
	}*/
	
	
	public void printData() {
		System.out.println("-------회원 관리--------");
		System.out.printf("%10s %10s              %10s     %10s \n","이름","등급","점수","이자포인트");
		
		for(int i =0; i <index; i++) {
			
				System.out.printf("%10s %10s %10d    %.2f \n",
						g[i].getName(),
						g[i].getGrade(),
						g[i].getPoint(),
						g[i].getInsert());
		
		}
		/*for(int i =0; i <index2; i++) {
			System.out.printf("%10s %10s %10d    %.2f \n",
					g[i].getName(),
					g[i].getGrade(),
					g[i].getPoint(),
					g[i].getInsert());
			
		}
		for(int i =0; i <index3; i++) {
			System.out.printf("%10s %10s %10d    %.2f \n",
					v[i].getName(),
					v[i].getGrade(),
					v[i].getPoint(),
					v[i].getInsert());
			
		}
		for(int i =0; i <index4; i++) {
			System.out.printf("%10s %10s %10d    %.2f \n",
					p[i].getName(),
					p[i].getGrade(),
					p[i].getPoint(),
					p[i].getInsert());
			
		}*/
		
	}
	
}
