package DAY10_문자열;

public class Solution4 {
	public static void main(String[] args) {
		Solution456 sol = new Solution456();
		System.out.println(sol.solution("ihrhbakrfpndopljhygc", 4, 2));
	}
}

class Solution456 {
	public String solution(String my_string, int m, int c) {
		String answer = "";
		int rows = my_string.length() / m;
		for (int i = 0; i < rows; i++) {
			answer += my_string.charAt(i * m + (c - 1));
		}
		return answer;
	}
}