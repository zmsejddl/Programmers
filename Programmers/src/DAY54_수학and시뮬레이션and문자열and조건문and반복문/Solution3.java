package DAY54_수학and시뮬레이션and문자열and조건문and반복문;

import java.util.Arrays;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		System.out.println(sol.solution("olleh", "hello"));
		System.out.println(sol.solution("allpe", "apple"));
	}
}

class Solution34 {
	public int solution(String before, String after) {
		char[] bef = before.toCharArray();
		char[] aft = after.toCharArray();
		Arrays.sort(bef);
		Arrays.sort(aft);

		return Arrays.equals(bef, aft) ? 1 : 0;
	}
}