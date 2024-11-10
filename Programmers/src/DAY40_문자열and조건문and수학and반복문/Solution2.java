package DAY40_문자열and조건문and수학and반복문;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		System.out.println(sol.solution(70));
		System.out.println(sol.solution(91));
		System.out.println(sol.solution(180));
	}
}

class Solution23 {
	public int solution(int angle) {
		int answer = 0;
		if (angle > 0 && angle < 90) {
			answer = 1;
		} else if (angle == 90) {
			answer = 2;
		} else if (angle > 90 && angle < 180) {
			answer = 3;
		} else if (angle == 180) {
			answer = 4;
		}
		return answer;
	}
}