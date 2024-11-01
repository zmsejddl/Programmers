package DAY31;

import java.util.Arrays;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		System.out.println(sol.solution("Bcad"));
		System.out.println(sol.solution("heLLo"));
		System.out.println(sol.solution("Python"));
	}
}

class Solution45 {
	public String solution(String my_string) {
		String answer = "";
		String str = my_string.toLowerCase();
		char[] charArr = str.toCharArray();
		Arrays.sort(charArr);
		for (int i = 0; i < charArr.length; i++) {
			answer += charArr[i];
		}
		return answer;
	}
}