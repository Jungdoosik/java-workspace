import java.util.ArrayList;

public class TestRun {

	public static void main(String[] args, int id) {
	//	ArrayTest a = new ArrayTest();
		//a.ex1();
		//a.ex2();
		//a.ex3();
		//a.ex4();
		
		
		/*ArrayList data = new ArrayList();
		
		data.add(3);
		data.add(4);
		data.add(2);
		data.add(1);
		data.add(5);
		
		System.out.println(data);
		
		Collections.sort(data);
		System.out.println(data);
		
		Collections.sort(data,Collections.reverseOrder());
		System.out.println(data);
		
		System.out.println(data.isEmpty());*/
		
		
		ArrayList  list = new ArrayList();
		list.add(new Member(1,"홍길동"));
		list.add(new Member(2,"김말똥"));
		list.add(new Member(3,"고길똥"));
		
		System.out.println(list);
		
		for(int i =0; i < list.size();i++) {
			System.out.println(list.get(id));
		}
	}
}
