package DAY39_문자열and반복문and출력and배열and조건문;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		System.out.println(sol.solution("hello", 3));
	}
}

class Solution45 {
	public String solution(String my_string, int n) {
		StringBuilder sb = new StringBuilder();

		for (char c : my_string.toCharArray()) {
			for (int i = 0; i < n; i++) {
				sb.append(c);
			}
		}

		String answer = sb.toString();
		return answer;
	}
}