package DAY43_조건문and배열and수학and시뮬레이션;

import java.util.Arrays;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		int[] numbers1 = { 1, 2, 3 };
		int[] numbers2 = { 4, 455, 6, 4, -1, 45, 6 };
		System.out.println(Arrays.toString(sol.solution(numbers1, "right")));
		System.out.println(Arrays.toString(sol.solution(numbers2, "left")));
	}
}

class Solution45 {
	public int[] solution(int[] numbers, String direction) {
		int temp;

		if (direction.equals("right")) {
			temp = numbers[numbers.length - 1];
			for (int i = numbers.length - 1; i > 0; i--) {
				numbers[i] = numbers[i - 1];
			}
			numbers[0] = temp;
		} else if (direction.equals("left")) {
			temp = numbers[0];
			for (int i = 0; i < numbers.length - 1; i++) {
				numbers[i] = numbers[i + 1];
			}
			numbers[numbers.length - 1] = temp;
		}
		return numbers;
	}
}