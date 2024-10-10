package DAY10_문자열;

public class Solution1 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution("ProgrammerS123", 11));
	}
}

class Solution {
	public String solution(String my_string, int n) {
		String answer = "";
		answer = my_string.substring(0, n);
		return answer;
	}
}