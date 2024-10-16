package DAY16_문자열;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		System.out.println(sol.solution("aBcDeFg"));
		System.out.println(sol.solution("aaa"));
	}
}

class Solution23 {
	public String solution(String myString) {
		String answer = "";
		answer=myString.toLowerCase();
		return answer;
	}
}