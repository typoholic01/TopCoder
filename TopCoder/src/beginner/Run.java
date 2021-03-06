package beginner;

import java.util.Map;

public class Run {
	
	public static void main(String[] args) {
		test02();
	}
	
	private static void test01() {
		Test01 test = new Test01();
		
		int []capacities = {30,20,10};
		int []juice = {10,5,5};
		int []fromId = {0,1,2};
		int []toId = {1,2,0};
		
		test.solve(capacities, juice, fromId, toId);
		
		for (int i = 0; i < juice.length; i++) {
			System.out.println(String.format("%d번째는 %d입니다", i, juice[i]));
		}

	}
	
	private static void test02() {
		String []first = {"낚시","수영","게임","영화"};
		String []second = {"조경","수다","수다","수다"};
		
		Test02 test = new Test02(first, second);		
		
		for (String key : test.storyMap.keySet()) {
			System.out.println(String.format("%s is %d개입니다", key, test.storyMap.get(key)));
		}
		System.out.println("최대값: " + test.max);

	}

}
