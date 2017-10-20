package beginner;

import java.util.Arrays;

public class Test03 {
	
	public Test03() {
	/*	
	 * 배열을 입력받으세요.
	 * 그 중에 숫자 하나를 +1 하세요
	 * 그 결과가 모든 경우의 수 중에 가장 큰 경우를 출력하세요.
	 * */
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
