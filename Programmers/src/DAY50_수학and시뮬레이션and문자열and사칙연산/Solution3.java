package DAY50_수학and시뮬레이션and문자열and사칙연산;

import java.util.Arrays;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		int[] numbers1 = { 1, 2, -3, 4, -5 };
		int[] numbers2 = { 0, -31, 24, 10, 1, 9 };
		int[] numbers3 = { 10, 20, 30, 5, 5, 20, 5 };
		System.out.println(sol.solution(numbers1));
		System.out.println(sol.solution(numbers2));
		System.out.println(sol.solution(numbers3));
	}
}

class Solution34 {
	public int solution(int[] numbers) {
		Arrays.sort(numbers);
		int n = numbers.length;

		return Math.max(numbers[n - 1] * numbers[n - 2], numbers[0] * numbers[1]);
	}
}