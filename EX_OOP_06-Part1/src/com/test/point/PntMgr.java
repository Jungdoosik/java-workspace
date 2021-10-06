package com.test.point;

public class PntMgr {

	private Grade [] g = new Grade[20];
	private int index = 0; //Grade index
	
	public void insertData(Grade g)
	{
		this.g[index++] = g;
	}
	public void printData()
	{
		System.out.println("---------- 정보 출력 ------------");
		System.out.printf("%s \t     %s \t\t %s \t %s \n","이름","등급","포인트","이자포인트");
		
		for(int i=0;i<index;i++)
		{
				System.out.printf("%s       %5s       %7d       %.2f  \n"
						,g[i].getName()
						,g[i].getGrade()
						,g[i].getPoint()
						,g[i].getInterest());
			
		}
	}
}
	


	/*public void insertData(Gold g) {
		this.g[index2++] = g;

	}
	public void insertData(Vip v) {
		this.v[index3++] = v;
		
	}
	public void insertData(Platinum p) {
		this.p[index4++] = p;
		
	}
	public void insertData(VVip vv) {
		this.vv[index5++] = vv;
		
	}*/
	/*public void printData() {
		System.out.println("-----결과 출력-----");
		System.out.printf("%10s %12s %23s %10s \n", "이름", "등급", "포인트", "적립금");

		for (int i = 0; i < index1; i++) {

			System.out.printf("%10s %10s %10d   %.2f \n", 
					s[i].getName(), 
					s[i].getGrade(), 
					s[i].getPoint(),
					s[i].getInterest());

		}
		for (int i = 0; i < index2; i++) {

			System.out.printf("%10s %10s %10d   %.2f \n", 
					g[i].getName(), 
					g[i].getGrade(), 
					g[i].getPoint(),
					g[i].getInterest());

		}
		for (int i = 0; i < index3; i++) {

			System.out.printf("%10s %10s %10d   %.2f \n", 
					v[i].getName(), 
					v[i].getGrade(), 
					v[i].getPoint(),
					v[i].getInterest());

		}
		for (int i = 0; i < index4; i++) {

			System.out.printf("%10s %10s %10d   %.2f \n", 
					p[i].getName(), 
					p[i].getGrade(), 
					p[i].getPoint(),
					p[i].getInterest());

		}
		for (int i = 0; i < index5; i++) {

			System.out.printf("%10s %10s %10d   %.2f \n", 
					vv[i].getName(), 
					vv[i].getGrade(), 
					vv[i].getPoint(),
					vv[i].getInterest());

		}
	}*/
		
	

