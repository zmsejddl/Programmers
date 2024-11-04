package DAY34_사칙연산;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		System.out.println(sol.solution(10, 5));
		System.out.println(sol.solution(7, 2));
	}
}

class Solution45 {
	public int solution(int num1, int num2) {
		int answer = num1 / num2;
		return answer;
	}
}