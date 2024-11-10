package DAY40_문자열and조건문and수학and반복문;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		System.out.println(sol.solution(10, 3));
		System.out.println(sol.solution(64, 6));
	}
}

class Solution34 {
	public int solution(int n, int k) {
		int answer = n * 12000 + k * 2000 - (n / 10) * 2000;
		return answer;
	}
}