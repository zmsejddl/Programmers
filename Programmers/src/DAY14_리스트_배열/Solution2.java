package DAY14_리스트_배열;

import java.util.Arrays;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		String[] names = { "nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx" };
		System.out.println(Arrays.toString(sol.solution(names)));
	}
}

class Solution23 {
	public String[] solution(String[] names) {
		String[] answer = {};
		if (names.length % 5 == 0) {
			answer = new String[names.length / 5];
		} else {
			answer = new String[names.length / 5 + 1];
		}
		for (int i = 0; i < answer.length; i++) {
			answer[i] = names[i * 5];
		}
		return answer;
	}
}