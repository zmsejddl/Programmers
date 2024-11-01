package DAY31;

import java.util.Arrays;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		System.out.println(Arrays.toString(sol.solution("abc1Addfggg4556b", 6)));
		System.out.println(Arrays.toString(sol.solution("abcdef123", 3)));
	}
}

class Solution23 {
	public String[] solution(String my_str, int n) {
		String[] answer = {};
		if (my_str.length() % n == 0) {
			answer = new String[my_str.length() / n];
		} else if (my_str.length() % n != 0) {
			answer = new String[my_str.length() / n + 1];
		}
		int index = 0;
		for (int i = 0; i < my_str.length(); i += n) {
			int end = Math.min(i + n, my_str.length());
			answer[index++] = my_str.substring(i, end);
		}
		return answer;
	}
}