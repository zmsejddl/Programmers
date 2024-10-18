package DAY18_문자열;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		System.out.println(sol.solution("43 + 12"));
		System.out.println(sol.solution("0 - 7777"));
		System.out.println(sol.solution("40000 * 40000"));
	}
}

class Solution34 {
	public int solution(String binomial) {
		int answer = 0;
		String[] strArray = binomial.split(" ");
		int a = Integer.parseInt(strArray[0]);
		int b = Integer.parseInt(strArray[2]);
		if (strArray[1].equals("+")) {
			answer = a + b;
		} else if (strArray[1].equals("-")) {
			answer = a - b;
		} else if (strArray[1].equals("*")) {
			answer = a * b;
		}
		return answer;
	}
}