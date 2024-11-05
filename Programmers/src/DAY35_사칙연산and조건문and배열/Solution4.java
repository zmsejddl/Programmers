package DAY35_사칙연산and조건문and배열;

import java.util.Arrays;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		int[] numbers1 = { 1, 2, 3, 4, 5 };
		int[] numbers2 = { 1, 2, 100, -99, 1, 2, 3 };
		System.out.println(Arrays.toString(sol.solution(numbers1)));
		System.out.println(Arrays.toString(sol.solution(numbers2)));
	}
}

class Solution45 {
	public int[] solution(int[] numbers) {
		int[] answer = new int[numbers.length];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = 2 * numbers[i];
		}
		return answer;
	}
}