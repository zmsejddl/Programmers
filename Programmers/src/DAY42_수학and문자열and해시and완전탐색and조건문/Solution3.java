package DAY42_수학and문자열and해시and완전탐색and조건문;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		System.out.println(sol.solution("2"));
		System.out.println(sol.solution("205"));
	}
}

class Solution34 {
	public String solution(String rsp) {
		String answer = "";
		String[] str = rsp.split("");
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("2")) {
				answer += "0";
			} else if (str[i].equals("0")) {
				answer += "5";
			} else if (str[i].equals("5")) {
				answer += "2";
			}
		}
		return answer;
	}
}