package DAY41_배열and구현and수학;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		System.out.println(sol.solution(20));
		System.out.println(sol.solution(100));
	}
}

class Solution45 {
	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer++;
			}
		}
		return answer;
	}
}