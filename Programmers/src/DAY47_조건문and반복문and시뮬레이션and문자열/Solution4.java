package DAY47_조건문and반복문and시뮬레이션and문자열;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		System.out.println(sol.solution("cccCCC"));
		System.out.println(sol.solution("abCdEfghIJ"));
	}
}

class Solution45 {
	public String solution(String my_string) {
		String answer = "";

		for (char c : my_string.toCharArray()) {
			if (Character.isUpperCase(c)) {
				answer += Character.toLowerCase(c);
			} else if (Character.isLowerCase(c)) {
				answer += Character.toUpperCase(c);
			}
		}
		return answer;
	}
}