package DAY4_연산and조건문;

public class Solution2 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(60, 2, 3));
	}
}

class Solution {
	public int solution(int number, int n, int m) {
		int answer = 0;
		if (number % n == 0 && number % m == 0) {
			answer = 1;
		} else {
			answer = 0;
		}
		return answer;
	}
}