package beginner;

public class Test04 {
	
	public Test04() {
		/*
		 * 10진수에서
		 * 3의 배수의 자릿수 합
		 * 9의 배수의 자릿수 합
		 * 
		 * base 진수에서 어떤 수가 이런 성질을 가지고 있는지 모두 리턴
		 * 
		 * */
	}
	
	public static void main(String[] args) {
		setNumber(9);
	}
	
	private static void setNumber(int base) {
		boolean []list = new boolean[base];							//해당되는 i 배수를 담을 배열
		
		for (int i = 0; i < list.length; i++) {						//배열 초기화
			list[i] = true;
		}
		
		for (int a = 0; a < base; a++) {							//3의 자리수
			for (int b = 0; b < base; b++) {						//2의 자리수
				for (int c = 0; c < base; c++) {					//1의 자리수
					int n = a * base * base + b * base + c;			//기준이 되는 n
					
					for (int i = 2; i < base; i++) {				//2부터 base - 1까지 배수인지 여부를 반복한다
						if (n % i == 0 && (a+b+c) % i != 0) {		//i가 아닌 수를 구한다
							list[i] = false;						//i가 아닌 수를 체크한다
						}
					}
				}
			}
		}
		
		for (int i = 2; i < list.length; i++) {
			if (list[i]) {
				System.out.println(i + "번째: " + list[i]);				
			}
		}
	}
	
}