package DAY34_사칙연산;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		System.out.println(sol.solution(2, 3));
		System.out.println(sol.solution(100, 2));
	}
}

class Solution23 {
	public int solution(int num1, int num2) {
		int answer = num1 - num2;
		return answer;
	}
}