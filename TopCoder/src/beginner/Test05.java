package beginner;

public class Test05 {
	
	public Test05() {
		//회문(aba)을 가장 짧은 길이로 만드는 메소드를 만드시오
		//원문 뒤에 문자열을 붙이는 방식만 인정합니다
	}
	
	public static void main(String[] args) {
		solve("abcbaa");
	}
	
	private static void solve(String palindrome) {
		//init
		String str = "abccba";
		int beginIndex = 0;
		
		//회문이 되는 최소길이를 구한다
		while (checkPalindrome(str.substring(beginIndex),0,str.substring(beginIndex).length() - 1) == false) {
			beginIndex += 1;
		}
		
		//회문으로 재생성한다
		String addStr = str.substring(0, beginIndex);
		addStr = new StringBuffer(addStr).reverse().toString();
		
		System.out.println(str+addStr);
		
		
	}
	
	//회문인지 확인하는 메소드
	private static boolean checkPalindrome(String str, int start, int end) {
		System.out.println("시작: " + start);
		System.out.println("끝: " + end);
		
		if (start >= end) {
			return true;
		}
		
		if (str.charAt(start) == str.charAt(end)) {
			return checkPalindrome(str,start+1,end-1);
		} else {
			return false;
		}
	}

}
