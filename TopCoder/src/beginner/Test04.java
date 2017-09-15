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
		setNumber(7);
	}
	
	private static void setNumber(int base) {
		int []list = new int[base];
		
		for (int a = 0; a < base; a++) {
			for (int b = 0; b < base; b++) {
				for (int c = 0; c < base; c++) {
					int n = a * base * base + b * base + c;
					
					for (int i = 2; i < base; i++) {
						if (n % i == 0 && (a+b+c) % i != 0) {
							list[i] = -1;
						}
					}
				}
			}
		}
		
		for (int i = 0; i < list.length; i++) {
			System.out.println(i + "번째: " + list[i]);
		}
	}
	
}