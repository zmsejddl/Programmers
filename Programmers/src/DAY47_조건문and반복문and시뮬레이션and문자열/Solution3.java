package DAY47_조건문and반복문and시뮬레이션and문자열;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		System.out.println(sol.solution("dfjardstddetckdaccccdegk", 4));
		System.out.println(sol.solution("pfqallllabwaoclk", 2));
	}
}

class Solution34 {
	public String solution(String cipher, int code) {
		String answer = "";
		String[] str = cipher.split("");
		for (int i = 0; i < str.length; i++) {
			if ((i + 1) % code == 0) {
				answer += str[i];
			}
		}
		return answer;
	}
}