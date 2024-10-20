package DAY20_함수_메서드;

import java.util.HashMap;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		String[] strArr = { "a", "bc", "d", "efg", "hi" };
		System.out.println(sol.solution(strArr));
	}
}

class Solution34 {
	public int solution(String[] strArr) {
		int answer = 0;
		HashMap<Integer, Integer> lengths = new HashMap<Integer, Integer>();
		for (String str : strArr) {
			int length = str.length();
			lengths.put(length, lengths.getOrDefault(length, 0) + 1);
		}
		for (int count : lengths.values()) {
			answer = Math.max(answer, count);
		}
		return answer;
	}
}