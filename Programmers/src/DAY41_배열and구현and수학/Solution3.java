package DAY41_배열and구현and수학;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		int[] emergency1 = { 3, 76, 24 };
		int[] emergency2 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] emergency3 = { 30, 10, 23, 6, 100 };
		System.out.println(Arrays.toString(sol.solution(emergency1)));
		System.out.println(Arrays.toString(sol.solution(emergency2)));
		System.out.println(Arrays.toString(sol.solution(emergency3)));
	}
}

class Solution34 {
	public int[] solution(int[] emergency) {
		int[] answer = emergency.clone();
		Arrays.sort(answer);

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < answer.length; i++) {
			map.put(answer[i], answer.length - i);
		}

		int[] result = new int[emergency.length];
		for (int i = 0; i < emergency.length; i++) {
			result[i] = map.get(emergency[i]);
		}

		return result;
	}
}