package DAY40_문자열and조건문and수학and반복문;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		System.out.println(sol.solution(10));
		System.out.println(sol.solution(4));
	}
}

class Solution45 {
	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				answer += i;
			}
		}
		return answer;
	}
}