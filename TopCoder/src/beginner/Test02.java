package beginner;

import java.util.HashMap;
import java.util.Map;

public class Test02 {
	int max = 1;
	
	public Test02() {
		/**
		 * 친구 i
		 * i 친구의 첫번째 흥미로운 화제 first(i)
		 * i 친구의 두번째 흥미로운 화제 second(i)
		 * 파티에 최대 몇명이 가능한가?
		 * */
		
		/*
		 * 예시1
		 * 낚시, 조경, 수영, 낚시
		 * 사냥, 낚시, 낚시, 스포츠
		 * 4
		 * 
		 * 예시2
		 * 수다, 조경, 요리, 수영
		 * 골프, 게임, 컴퓨터, 산책
		 * 1
		 * 
		 * 예시3
		 * 뱀, 술, 밥, 집
		 * 요리, 요리, 요리, 잠
		 * 3
		 * 
		 * */
	}
	
	Map<String,Integer> countMap(String[] first, String[] second) {
		//테마를 셀 Hashmap
		Map<String,Integer> countMap = new HashMap<String, Integer>();
		
		for (int i = 0; i < first.length; i++) {
			//이미 존재하는지 확인
			boolean checkDuple = countMap.containsKey(first[i]);
			
			if (!checkDuple) {				
				countMap.put(first[i], 1);								//존재하지 않을 경우		
			} else {
				max = Math.max(max, countMap.get(first[i])+1);			//최대값을 구한다
				countMap.replace(first[i], countMap.get(first[i])+1);	//존재할 경우
			}		
		}
		
		for (int i = 0; i < second.length; i++) {
			//이미 존재하는지 확인
			boolean checkDuple = countMap.containsKey(second[i]);
			
			if (!checkDuple) {				
				countMap.put(second[i], 1);								//존재하지 않을 경우		
			} else {
				max = Math.max(max, countMap.get(second[i])+1);			//최대값을 구한다
				countMap.replace(second[i], countMap.get(second[i])+1);	//존재할 경우
			}		
		}
		return countMap;
	}
}
