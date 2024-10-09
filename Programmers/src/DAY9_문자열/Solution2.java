package DAY9_문자열;

public class Solution2 {
	public static void main(String[] args) {
		Solution234 sol = new Solution234();
		String[] my_strings = { "progressive", "hamburger", "hammer", "ahocorasick" };
		int[][] parts = { { 0, 4 }, { 1, 2 }, { 3, 5 }, { 7, 7 } };
		System.out.println(sol.solution(my_strings, parts));
	}
}

class Solution234 {
	public String solution(String[] my_strings, int[][] parts) {
		String answer = "";
		for (int i = 0; i < my_strings.length; i++) {
			answer += my_strings[i].substring(parts[i][0], parts[i][1] + 1);
		}
		return answer;
	}
}