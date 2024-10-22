package DAY23_조건문활용;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		System.out.println(sol.solution(3, 5));
		System.out.println(sol.solution(6, 1));
		System.out.println(sol.solution(2, 4));
	}
}

class Solution45 {
	public int solution(int a, int b) {
		int answer = 0;
		if (a % 2 == 1 && b % 2 == 1) {
			answer = a * a + b * b;
		} else if (a % 2 == 1 && b % 2 == 0 || a % 2 == 0 && b % 2 == 1) {
			answer = 2 * (a + b);
		} else if (a % 2 == 0 && b % 2 == 0) {
			answer = Math.abs(a - b);
		}
		return answer;
	}
}