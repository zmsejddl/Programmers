package DAY3_연산;

public class Solution4 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(9, 91));
	}
}

class Solution {
	public int solution(int a, int b) {
		int answer = 0;
		String c = a + "" + b;
		String d = b + "" + a;
		if (Integer.parseInt(c) > Integer.parseInt(d)) {
			answer = Integer.parseInt(c);
		} else {
			answer = Integer.parseInt(d);
		}
		return answer;
	}
}