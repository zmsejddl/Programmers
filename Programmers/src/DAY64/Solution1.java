package DAY64;

import java.util.*;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		System.out.println(Arrays.toString(sol.solution("banana")));
		System.out.println(Arrays.toString(sol.solution("foobar")));
	}
}

class Solution12 {
	public int[] solution(String s) {
		int[] answer = new int[s.length()];
		Map<Character, Integer> lastSeen = new HashMap();

		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);

			if (lastSeen.containsKey(currentChar)) {
				answer[i] = i - lastSeen.get(currentChar);
			} else {
				answer[i] = -1;
			}

			lastSeen.put(currentChar, i);
		}

		return answer;
	}
}