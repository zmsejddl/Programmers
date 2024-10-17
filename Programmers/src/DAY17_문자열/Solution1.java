package DAY17_문자열;

public class Solution1 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution("AbCdEFG", "dE"));
		System.out.println(sol.solution("AAAAaaaa", "a"));
	}
}

class Solution {
	public String solution(String myString, String pat) {
		String answer = "";
		if (myString.lastIndexOf(pat) != -1) {
			answer = myString.substring(0, myString.lastIndexOf(pat) + pat.length());
		}
		return answer;
	}
}