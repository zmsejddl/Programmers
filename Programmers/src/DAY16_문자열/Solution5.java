package DAY16_문자열;

public class Solution5 {
	public static void main(String[] args) {
		Solution56 sol = new Solution56();
		System.out.println(sol.solution("programmers", "p"));
		System.out.println(sol.solution("lowercase", "x"));
	}
}

class Solution56 {
	public String solution(String my_string, String alp) {
		String answer = "";
		StringBuilder sb = new StringBuilder(my_string);
		char[] charArray = alp.toCharArray();
		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.charAt(i) == charArray[0]) {
				sb.setCharAt(i, Character.toUpperCase(my_string.charAt(i)));
			}
		}
		answer = sb.toString();
		return answer;
	}
}