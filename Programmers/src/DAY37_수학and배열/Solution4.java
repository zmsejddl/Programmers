package DAY37_수학and배열;

import java.util.Arrays;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		int[] numbers1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] numbers2 = { 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99 };
		System.out.println(sol.solution(numbers1));
		System.out.println(sol.solution(numbers2));
	}
}

class Solution45 {
	public double solution(int[] numbers) {
		double answer = Arrays.stream(numbers).sum() / (double) numbers.length;
		return answer;
	}
}