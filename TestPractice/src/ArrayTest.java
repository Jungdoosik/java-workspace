import java.util.Scanner;

public class ArrayTest {
	
	
		
	public void ex1() {
			
		String [] arr = {"딸기", "복숭아", "키위", "사과", "바나나"};
		
		Scanner sc = new Scanner(System.in);
		int su1;
		while(true) {
			System.out.print("몇번쨰 과일을 출력하시겠습니까? : ");
			su1 = sc.nextInt();
			if(1<= su1 && su1 <=5) {
				System.out.println("당신이 선택한 과일은 [" + arr[su1-1] + "]이군요.");		
			}else if(su1 == 0) {
				System.out.println("꺼저");
				break;
			}else {
				System.out.println("잘못입력하였습니다.");
			}
		}
	}
	public void ex2() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+"번쨰 정수 입력 : ");
			int su1 = sc.nextInt();
			sum += su1;
		}
		System.out.println("5개의 정수를 합한 값 : " + sum);
	}
	public void ex3() {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+"번쨰 정수 입력 : ");
			arr[i] = sc.nextInt();
			sum += arr[i]; 
		}
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j =0; j < arr.length-1-i;j++) {
				int tmp;
				tmp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = tmp;
		}
		}
		
		
		
		for(int i = 0; i <arr.length; i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
		
		System.out.printf("학생들의 성적(평균) : %.1f \n" , sum/5.0);
		System.out.println("학생들의 성적(합계) : " + sum);
		}
	
	public void ex4() {
		char [] data = {'r','e','v','e','r','s','e'};
		
		
		char tmp;
		for(int i = 0; i <= data.length; i++) {
			System.out.println(data);
			tmp = data[0];
			for(int j = 0; j < data.length-1; j++) {
				data[j]= data[j+1];
			}
			data[data.length-1]= tmp;
		}System.out.println(data);
	}
	
}
