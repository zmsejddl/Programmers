package DAY11_리스트_배열;

import java.util.Arrays;

public class Solution1 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(Arrays.toString(sol.solution("Programmers")));
	}
}

class Solution {
	public int[] solution(String my_string) {
		int[] answer = new int[52];
		for (int i = 0; i < my_string.length(); i++) {
			char ch = my_string.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {
				answer[ch - 'A']++;
			} else if (ch >= 'a' && ch <= 'z') {
				answer[ch - 'a' + 26]++;
			}
		}
		return answer;
	}
}