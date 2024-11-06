package DAY36_사칙연산and배열and수학;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		int[] array1 = { 1, 2, 3, 3, 3, 4 };
		int[] array2 = { 1, 1, 2, 2 };
		int[] array3 = { 1 };
		System.out.println(sol.solution(array1));
		System.out.println(sol.solution(array2));
		System.out.println(sol.solution(array3));
	}
}

class Solution34 {
	public int solution(int[] array) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int num : array) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		int answer = array[0];
		int maxCount = 0;
		boolean multi = false;

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int count = entry.getValue();
			if (entry.getValue() > maxCount) {
				maxCount = count;
				answer = entry.getKey();
				multi = false;
			} else if (count == maxCount) {
				multi = true;
			}
		}
		return multi ? -1 : answer;
	}
}