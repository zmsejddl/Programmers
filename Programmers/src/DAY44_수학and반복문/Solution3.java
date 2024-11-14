package DAY44_수학and반복문;

import java.util.Arrays;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		int[] numbers1 = { 1, 2, 3, 4, 5 };
		int[] numbers2 = { 0, 31, 24, 10, 1, 9 };
		System.out.println(sol.solution(numbers1));
		System.out.println(sol.solution(numbers2));
	}
}

class Solution34 {
	public int solution(int[] numbers) {
		Arrays.sort(numbers);
		int answer = numbers[numbers.length - 2] * numbers[numbers.length - 1];
		return answer;
	}
}