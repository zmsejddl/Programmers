package DAY5_조건문;

public class Solution1 {
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("abc1abc1abc"));
	}
}

class Solution {
	public String solution(String code) {
		StringBuilder answer = new StringBuilder();
		int mode = 0;
		for (int i = 0; i < code.length(); i++) {
			char a = code.charAt(i);
			if (a == '1') {
				mode = 1 - mode;
			} else {
				if (mode == 0 && i % 2 == 0) {
					answer.append(a);
				} else if (mode == 1 && i % 2 == 1) {
					answer.append(a);
				}
			}
		}
		return answer.length() > 0 ? answer.toString() : "EMPTY";
	}
}