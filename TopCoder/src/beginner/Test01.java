package beginner;

public class Test01 {
	
	public Test01() {
	/**
	 * 
	 * 1. capacities[i]
	 * 2. juice[i]
	 * 3. fromId
	 * 4. toId
	 * 
	 * 주스를 fromId에서 toId로 옮기되 capacities를 초과하지 않게 하시오
	 * 
	 * */
	
	}
	
	void solve(int []capacities, int []juice, int []fromId, int []toId) {
		
		for (int i = 0; i < fromId.length; i++) {
			relayJuice(capacities, juice, fromId[i], toId[i]);
		}
		

	}
	
	
	
	void relayJuice(int []capacities, int []juice, int fromId, int toId) {
		
		//주스를 옮긴다
		int sumJuice = juice[fromId] + juice[toId];
		
		//최대값을 넘지 않을 경우
		if (sumJuice <= capacities[toId]) {
			juice[toId] = sumJuice;
			juice[fromId] = 0;
		} else {
			//넘은 경우
			juice[toId] = capacities[toId];
			juice[fromId] = sumJuice - capacities[toId];
		}
		

	}

}
