package DAY9_문자열;

import java.util.Arrays;

public class Solution4 {
	public static void main(String[] args) {
		Solution123 sol = new Solution123();
		System.out.println(Arrays.toString(sol.solution("banana")));
	}
}

class Solution123 {
	public String[] solution(String my_string) {
		String[] answer = new String[my_string.length()];
		for (int i = 0; i < my_string.length(); i++) {
			answer[i] = my_string.substring(i, my_string.length());
		}
		Arrays.sort(answer);
		return answer;
	}
}