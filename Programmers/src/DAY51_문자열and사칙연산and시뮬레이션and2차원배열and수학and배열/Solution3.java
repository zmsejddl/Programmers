package DAY51_문자열and사칙연산and시뮬레이션and2차원배열and수학and배열;

import java.util.Arrays;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		int[] sides1 = { 1, 2 };
		int[] sides2 = { 3, 6 };
		int[] sides3 = { 11, 7 };
		System.out.println(sol.solution(sides1));
		System.out.println(sol.solution(sides2));
		System.out.println(sol.solution(sides3));
	}
}

class Solution34 {
	public int solution(int[] sides) {
		Arrays.sort(sides);
		return sides[1] + sides[0] - (sides[1] - sides[0]) - 1;
	}
}