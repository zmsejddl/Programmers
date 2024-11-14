package DAY44_수학and반복문;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		System.out.println(sol.solution(3628800));
		System.out.println(sol.solution(7));
	}
}

class Solution45 {
	public int solution(int n) {
		int answer = 0;
		for (int i = 0; factorial(i) <= n; i++) {
			answer = i;
		}
		return answer;
	}

	public static int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}