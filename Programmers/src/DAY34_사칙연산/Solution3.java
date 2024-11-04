package DAY34_사칙연산;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		System.out.println(sol.solution(3, 4));
		System.out.println(sol.solution(27, 19));
	}
}

class Solution34 {
	public int solution(int num1, int num2) {
		int answer = num1 * num2;
		return answer;
	}
}