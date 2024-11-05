package DAY35_사칙연산and조건문and배열;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		System.out.println(sol.solution(2, 3));
		System.out.println(sol.solution(11, 11));
		System.out.println(sol.solution(7, 99));
	}
}

class Solution23 {
	public int solution(int num1, int num2) {
		int answer = 1;
		if (num1 != num2) {
			answer = -1;
		}
		return answer;
	}
}