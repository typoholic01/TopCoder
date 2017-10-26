package beginner;

public class Test06 {
	//서로 친구라면 친구
	//C에게 A,B가 등록되어 있다면 A,B도 서로 친구
	//i번째 요소의 j번째로 친구 리턴[N,Y]
	
	public Test06() {
	
	}
	
	public static void main(String[] args) {
		String[] friend = {"NYNNN","YNYNN","NYNYN","NNYNY","NNNYN"};
		
		int[] friendSumCount = new int[friend.length];
		
		friendSumCount = getSumFriendCount(friend);
		
		for (int i = 0; i < friendSumCount.length; i++) {
			System.out.println(String.format("%d 번째의 친구 수는 %d 입니다", i,friendSumCount[i]));
		}
	}
	
	public static int[] getSumFriendCount(String[] friend) {
		int[] friendSumCount = new int[friend.length];
		int[] friendCount = new int[friend.length];
		int[] friendFriendCount = new int[friend.length];
		
		friendCount = getFriendCount(friend);
		friendFriendCount = getFriendFriendCount(friend);
		
		for (int i = 0; i < friendCount.length; i++) {
			friendSumCount[i] = friendCount[i] + friendFriendCount[i];
		}
		
		return friendSumCount;
	}
	
	//친구의 숫자를 구한다
	private static int[] getFriendCount(String[] friend) {
		int[] friendCount = new int[friend.length];
		
		for (int i = 0; i < friend.length; i++) {				//i번째 문자열
			for (int j = 0; j < friend[i].length(); j++) {		//j번째 문자
				if (friend[i].charAt(j) == 'Y') {				//친구가 맞는가?
					friendCount[i] += 1;
				}
			}
		}
		
		return friendCount;
	}
	
	//친구의 친구의 숫자를 구한다
	private static int[] getFriendFriendCount(String[] friend) {
		int[] friendFriendCount = new int[friend.length];		
		
		for (int i = 0; i < friendFriendCount.length; i++) {											//i번째 친구
			System.out.println(String.format("====== %d번째 친구의 친구 목록 =======", i));
			for (int j = 0; j < friendFriendCount.length - 1; j++) {
				for (int k = j + 1; k < friendFriendCount.length; k++) {
					
					if (friend[i].charAt(j) == 'Y' && friend[i].charAt(j) == friend[i].charAt(k)) {
						System.out.println(String.format("%d번째 친구와 %d번째 친구는 서로 친구입니다", j,k));
						friendFriendCount[j] += 1;
						friendFriendCount[k] += 1;						
					}
				}						
			}			
		}
		
		return friendFriendCount;
	}
	
}
