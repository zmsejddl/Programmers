package DAY4_연산and조건문;

public class Solution1 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(98, 2));
	}
}

class Solution {
	public int solution(int num, int n) {
		int answer = 0;
		if (num % n == 0) {
			answer = 1;
		} else {
			answer = 0;
		}
		return answer;
	}
}