package beginner;

import java.util.Arrays;

public class Test03 {
	
	public int solve(int []numbers) {
				
		//가장 작은 숫자를 +1 한다
		increaseMin(numbers);
		
		return multipleArr(numbers);	//배열 안 모든 숫자의 곱을 구한다
		
	}
	
	private int multipleArr(int []numbers) {
		int answer = 1;
		
		for (int i = 0; i < numbers.length; i++) {
			answer *= numbers[i];
		}
		
		return answer;

	}
	
	private void increaseMin(int []numbers) {
		
		Arrays.sort(numbers);
		numbers[0]++;
	}

	
	public Test03() {
	/*	
	 * 배열을 입력받으세요.
	 * 그 중에 숫자 하나를 +1 하세요
	 * 그 결과가 모든 경우의 수 중에 가장 큰 경우를 출력하세요.
	 * */
	}
}
