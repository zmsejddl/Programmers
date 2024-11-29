package DAY59;

import java.util.*;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		String[] players = { "mumu", "soe", "poe", "kai", "mine" };
		String[] callings = { "kai", "kai", "mine", "mine" };
		System.out.println(Arrays.toString(sol.solution(players, callings)));
	}
}

class Solution12 {
	public String[] solution(String[] players, String[] callings) {
		Map<String, Integer> rankMap = new HashMap<String, Integer>();
		for (int i = 0; i < players.length; i++) {
			rankMap.put(players[i], i);
		}

		for (String name : callings) {
			int currentRank = rankMap.get(name);
			if (currentRank > 0) {
				String frontPlayer = players[currentRank - 1];

				players[currentRank - 1] = name;
				players[currentRank] = frontPlayer;

				rankMap.put(name, currentRank - 1);
				rankMap.put(frontPlayer, currentRank);
			}
		}

		return players;
	}
}