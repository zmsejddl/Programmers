package DAY6_조건문and반복문;

public class Solution3 {
	public static void main(String[] args) {
		Solution123 sol = new Solution123();
		int[] numLog = { 0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1 };
		System.out.println(sol.solution(numLog));
	}
}

class Solution123 {
	public String solution(int[] numLog) {
		String answer = "";
		for (int i = 0; i < numLog.length; i++) {
			if (i == numLog.length - 1) {
				break;
			}
			if (numLog[i] == numLog[i + 1] - 1) {
				answer += "w";
			} else if (numLog[i] == numLog[i + 1] + 1) {
				answer += "s";
			} else if (numLog[i] == numLog[i + 1] - 10) {
				answer += "d";
			} else if (numLog[i] == numLog[i + 1] + 10) {
				answer += "a";
			}
		}
		return answer;
	}
}