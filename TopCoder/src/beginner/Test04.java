package beginner;

import java.util.HashMap;
import java.util.Map;

public class Test04 {
	
	public Test04() {
		//1. 999까지 base 로 나눈다
		//2. 한번이라도 배수가 아니면 false로 빼고 break한다
		//3. 전부 해서 true면 true를 반환한다
	}
	
	public void solve(int base) {
		Map<Integer, Boolean> answer = new HashMap<>();
		
		for (int i = 2; i < base; i++) {
			//n부터 n의 배수를 999까지 자릿수를 더해 n으로 나누고 그 결과값을 boolean으로 리턴하는 메소드
			boolean b = isMultiple(base, i);
			answer.put(i, b);
		}
		for (int i = 0; i < answer.size(); i++) {			
			System.out.println((i+2) + ": " + answer.get(i+2));
			
		}
		
	}
	
	private boolean isMultiple(int base, int n) {
		boolean isMultiple = true;
		
		for (int i = n; i < 999; i = i + n) {
			if (sumDigit(i) % n != 0) {
				isMultiple = false;
				break;				
			}
		}
		
		return isMultiple;
	}
	
	private int sumDigit(int number) {
		int []digit = getDigit(number);
		int sumDigit = 0;
		
		for (int i = 0; i < digit.length; i++) {
			sumDigit += digit[i];
		}
		
		return sumDigit;
	}
	
	private int[] getDigit(int number) {
		int[] digit = new int[(int) (Math.log10(number) + 1)];

		for (int i = 0; i < digit.length; i++) {
			digit[i] = number % number;
			number = number / number;
		}
		return digit;
	}
	
	/*
	 * http://codingdojang.com/scode/458
	 * */
	public String convertDecimal(int base, int number) {
		String T = "0123456789ABCDEF";
		
		int quotient = number / base;
		int remainder = number % base;
		
		if (quotient == 0) {
			return String.valueOf(T.charAt(remainder));
		} else {
			return convertDecimal(base, quotient) + T.charAt(remainder);
		}

	}

}
