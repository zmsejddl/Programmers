package DAY18_문자열;

import java.util.Arrays;

public class Solution1 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(Arrays.toString(sol.solution("oxooxoxxox")));
		System.out.println(Arrays.toString(sol.solution("xabcxdefxghi")));
	}
}

class Solution {
	public int[] solution(String myString) {
		String[] parts = myString.split("x", -1);
		int[] answer = new int[parts.length];
		for (int i = 0; i < parts.length; i++) {
			answer[i] = parts[i].length();
		}
		return answer;
	}
}