package DAY3_연산;

public class Solution3 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution("love", 3));
	}
}

class Solution {
	public String solution(String my_string, int k) {
		String answer = "";
		for (int i = 0; i < k; i++) {
			answer += my_string;
		}
		return answer;
	}
}