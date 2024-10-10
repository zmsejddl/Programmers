package DAY10_문자열;

public class Solution5 {
	public static void main(String[] args) {
		Solution789 sol = new Solution789();
		System.out.println(sol.solution(3, 1, "qjnwezgrpirldywt"));
	}
}

class Solution789 {
	public String solution(int q, int r, String code) {
		String answer = "";
		for (int i = 0; i < code.length(); i++) {
			int idx = i % q;
			if (r == idx) {
				answer += code.charAt(i);
			}
		}
		return answer;
	}
}