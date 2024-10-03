package DAY3_연산;

public class Solution5 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(2, 91));
	}
}

class Solution {
	public int solution(int a, int b) {
		int answer = 0;
		String c = a + "" + b;
		if (Integer.parseInt(c) > (2 * a * b)) {
			answer = Integer.parseInt(c);
		} else {
			answer = 2 * a * b;
		}
		return answer;
	}
}