package DAY44_수학and반복문;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		System.out.println(sol.solution(10));
		System.out.println(sol.solution(15));
	}
}

class Solution23 {
	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count >= 3) {
				answer++;
			}
		}
		return answer;
	}
}