package DAY46_문자열and배열and사칙연산and수학and조건문;

import java.util.Arrays;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		int[] sides1 = { 1, 2, 3 };
		int[] sides2 = { 3, 6, 2 };
		int[] sides3 = { 199, 72, 222 };
		System.out.println(sol.solution(sides1));
		System.out.println(sol.solution(sides2));
		System.out.println(sol.solution(sides3));
	}
}

class Solution45 {
	public int solution(int[] sides) {
		int answer = 1;
		Arrays.sort(sides);
		if (sides[2] >= sides[0] + sides[1]) {
			answer = 2;
		}
		return answer;
	}
}