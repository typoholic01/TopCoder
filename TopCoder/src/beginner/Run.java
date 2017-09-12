package beginner;

public class Run {
	
	public static void main(String[] args) {
		test01();
	}
	
	private static void test01() {
		Test01 test = new Test01();
		
		int []capacities = {30,20,10};
		int []juice = {10,5,5};
		int []fromId = {0,1,2};
		int []toId = {1,2,0};
		
		test.solve(capacities, juice, fromId, toId);
		
		for (int i = 0; i < juice.length; i++) {
			System.out.println(String.format("%d번째는 %d입니다", i,juice[i]));
		}

	}

}
