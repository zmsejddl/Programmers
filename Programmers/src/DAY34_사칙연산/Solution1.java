package DAY34_사칙연산;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		System.out.println(sol.solution(2, 3));
		System.out.println(sol.solution(100, 2));
	}
}

class Solution12 {
	public int solution(int num1, int num2) {
		int answer = num1 + num2;
		return answer;
	}
}