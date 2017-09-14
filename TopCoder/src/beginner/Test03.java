package beginner;

import java.util.Arrays;

public class Test03 {
	
	public Test03() {
		// TODO Auto-generated constructor stub
	}
	
	public void solve() {
		int []arr = {1,2,3,4};
		
		increaseMin(arr);
		
		int answer = multipleArr(arr);
		
		System.out.println(answer);
		
	}
	
	private int multipleArr(int []arr) {
		int answer = 1;
		
		for (int i = 0; i < arr.length; i++) {
			answer *= arr[i];
		}
		
		return answer;

	}
	
	private void increaseMin(int []arr) {
		
		Arrays.sort(arr);
		arr[0]++;
	}

}
