package beginner;

public class Test05 {
	
	public Test05() {
		//회문(aba)을 가장 짧은 길이로 만드는 메소드를 만드시오
	}
	
	public static void main(String[] args) {
		solve("abcbaa");
	}
	
	private static void solve(String circle) {
		int len = circle.length();
		
		for (int i = 0; i < len; i++) {
			System.out.println("[" + i + "] " + circle.charAt(i) + " : " + circle.charAt(circle.length() - i - 1));	
			
			if (circle.charAt(i) != circle.charAt(circle.length() - i - 1)) {
				//2분할 후 put한다
				String front = circle.substring(0, circle.length() - i);
				char put = circle.charAt(i);
				String end = circle.substring(circle.length() - i);
				
				circle = front + put + end;
				System.out.println(front + " " + end);				
			}
			
		}
		
		System.out.println("answer: " + circle);
	}

}
