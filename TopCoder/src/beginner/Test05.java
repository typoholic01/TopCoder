package beginner;

public class Test05 {
	
	public Test05() {
		//회문(aba)을 가장 짧은 길이로 만드는 메소드를 만드시오
		//원문 뒤에 문자열을 붙이는 방식만 인정합니다
	}
	
	public static void main(String[] args) {
		solve("abccba");
	}
	
	private static String solve(String s) {
		//init
		int beginIndex = 0;

		//회문이 되는 최소길이를 구한다
		while (checkPalindrome(s.substring(beginIndex),0,s.substring(beginIndex).length() - 1) == false) {
			beginIndex += 1;
		}
		
		//회문으로 재생성한다
		String addStr = s.substring(0, beginIndex);			//추가 문자열
		addStr = new StringBuffer(addStr).reverse().toString();			//문자열을 뒤집어 회문형태를 만들 준비를 한다
		
		System.out.println(s+addStr);
		
		return s+addStr;		
		
	}
	
	//회문인지 확인하는 메소드
	private static boolean checkPalindrome(String sSub, int start, int end) {
		System.out.println("시작: " + start);
		System.out.println("끝: " + end);
		
		if (start >= end) {												//문자열을 전부 체크했을 시 재귀 종료
			return true;
		}
		
		if (sSub.charAt(start) == sSub.charAt(end)) {						//회문체크
			return checkPalindrome(sSub,start+1,end-1);					//회문 여부를 재귀로 반복한다
		} else {
			return false;												//재귀 탈출
		}
	}

}
