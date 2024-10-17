package DAY17_문자열;

import java.util.Arrays;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		System.out.println(Arrays.toString(sol.solution("i love you")));
		System.out.println(Arrays.toString(sol.solution("programmers")));
	}
}

class Solution45 {
	public String[] solution(String my_string) {
		String[] answer = my_string.split(" ");
		return answer;
	}
}