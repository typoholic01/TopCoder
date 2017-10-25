package beginner;

import java.util.HashMap;
import java.util.Map;

public class Test02 {
	Map<String,Integer> storyMap; 	//화젯거리를 담을 Hashmap
	int max = 1;					//최대값
	
	public Test02(String[] first, String[] second) {
		//init
		storyMap = new HashMap<>();
		
		//run
		setStoryMap(first);
		setStoryMap(second);
	}
	
	//화젯거리를 담는다
	private void setStoryMap(String[] story) {
		for (int i = 0; i < story.length; i++) {
			//이미 존재하는지 확인
			boolean checkDuple = storyMap.containsKey(story[i]);
			
			if (!checkDuple) {											//존재하지 않을 경우	
				storyMap.put(story[i], 1);	
			} else {													//존재할 경우
				max = Math.max(max, storyMap.get(story[i])+1);			//최대값을 갱신한다
				storyMap.replace(story[i], storyMap.get(story[i])+1);
			}		
		}
		
	}
	
	
	
	@SuppressWarnings("unused")
	private void explain() {
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
}
