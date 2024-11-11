package DAY41_배열and구현and수학;

import java.util.Arrays;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		int[] numbers1 = { 1, 2, 3, 4, 5 };
		int[] numbers2 = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(sol.solution(numbers1, 1, 3)));
		System.out.println(Arrays.toString(sol.solution(numbers2, 1, 2)));
	}
}

class Solution12 {
	public int[] solution(int[] numbers, int num1, int num2) {
		int[] answer = new int[num2 - num1 + 1];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = numbers[num1++];
		}
		return answer;
	}
}