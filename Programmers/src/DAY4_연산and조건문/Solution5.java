package DAY4_연산and조건문;

public class Solution5 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(-4, 7, true));
		System.out.println(sol.solution(-4, 7, false));
	}
}

class Solution {
	public int solution(int a, int b, boolean flag) {
		int answer = 0;
		if (flag == true) {
			answer = a + b;
		} else {
			answer = a - b;
		}
		return answer;
	}
}