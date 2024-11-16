package DAY46_문자열and배열and사칙연산and수학and조건문;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		System.out.println(sol.solution("people"));
		System.out.println(sol.solution("We are the world"));
	}
}

class Solution34 {
	public String solution(String my_string) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < my_string.length(); i++) {
			char c = my_string.charAt(i);
			if (sb.indexOf(String.valueOf(c)) == -1) {
				sb.append(c);
			}
		}
		return sb.toString();
	}
}