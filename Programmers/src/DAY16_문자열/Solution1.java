package DAY16_문자열;

public class Solution1 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution("aBcDeFg"));
		System.out.println(sol.solution("AAA"));
	}
}

class Solution {
	public String solution(String myString) {
		String answer = "";
		answer = myString.toUpperCase();
		return answer;
	}
}