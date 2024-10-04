package DAY4_연산and조건문;

public class Solution3 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(10));
	}
}

class Solution {
	public int solution(int n) {
		int answer = 0;
		if (n % 2 == 1) {
			for (int i = 1; i <= n; i++) {
				if (i % 2 == 1) {
					answer += i;
				}
			}
		} else {
			for (int i = 1; i <= n; i++) {
				if (i % 2 == 0) {
					answer += i*i;
				}
			}
		}
		return answer;
	}
}