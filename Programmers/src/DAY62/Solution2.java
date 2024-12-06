package DAY62;

import java.util.*;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		System.out.println(sol.solution("aukks", "wbqd", 5));
	}
}

class Solution23 {
	public String solution(String s, String skip, int index) {
		StringBuilder answer = new StringBuilder();
		Set<Character> skipSet = new HashSet<Character>();

		for (char c : skip.toCharArray()) {
			skipSet.add(c);
		}

		for (char c : s.toCharArray()) {
			char current = c;
			int count = 0;

			while (count < index) {
				current++;
				if (current > 'z') {
					current = 'a';
				}
				if (!skipSet.contains(current)) {
					count++;
				}
			}

			answer.append(current);
		}

		return answer.toString();
	}
}