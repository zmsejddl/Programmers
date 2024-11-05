package DAY35_사칙연산and조건문and배열;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		System.out.println(sol.solution(3, 2));
		System.out.println(sol.solution(7, 3));
		System.out.println(sol.solution(1, 16));
	}
}

class Solution12 {
	public int solution(int num1, int num2) {
		double result = (double) num1 / num2 * 1000;
		int answer = (int) result;
		return answer;
	}
}