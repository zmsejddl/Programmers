package DAY16_문자열;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		System.out.println(sol.solution("abstract algebra"));
		System.out.println(sol.solution("PrOgRaMmErS"));
	}
}

class Solution45 {
	public String solution(String myString) {
		String answer = "";
		StringBuilder sb = new StringBuilder(myString);
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == 'a') {
				sb.setCharAt(i, 'A');
			} else if (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z' && sb.charAt(i) != 'A') {
				sb.setCharAt(i, Character.toLowerCase(myString.charAt(i)));
			}
		}
		answer = sb.toString();
		return answer;
	}
}