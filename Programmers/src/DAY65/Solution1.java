package DAY65;

import java.util.*;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		int[] score1 = { 10, 100, 20, 150, 1, 100, 200 };
		int[] score2 = { 0, 300, 40, 300, 20, 70, 150, 50, 500, 1000 };
		System.out.println(Arrays.toString(sol.solution(3, score1)));
		System.out.println(Arrays.toString(sol.solution(4, score2)));
	}
}

class Solution12 {
	public int[] solution(int k, int[] score) {
		int[] answer = new int[score.length];
		List<Integer> hallOfFame = new ArrayList<Integer>();

		for (int i = 0; i < score.length; i++) {
			hallOfFame.add(score[i]);
			Collections.sort(hallOfFame, Collections.reverseOrder());

			if (hallOfFame.size() > k) {
				hallOfFame.remove(hallOfFame.size() - 1);
			}

			answer[i] = hallOfFame.get(hallOfFame.size() - 1);
		}

		return answer;
	}
}