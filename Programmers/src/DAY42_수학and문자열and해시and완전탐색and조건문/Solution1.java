package DAY42_수학and문자열and해시and완전탐색and조건문;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		System.out.println(sol.solution(23));
		System.out.println(sol.solution(24));
		System.out.println(sol.solution(999));
	}
}

class Solution12 {
	public int solution(int hp) {
		int answer = 0;
		answer += hp / 5;
		hp %= 5;

		answer += hp / 3;
		hp %= 3;

		answer += hp;

		return answer;
	}
}