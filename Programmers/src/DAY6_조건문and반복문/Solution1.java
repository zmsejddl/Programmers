package DAY6_조건문and반복문;

import java.util.Arrays;

public class Solution1 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] answer = { 5, 2, 1, 7, 5 };
		System.out.println(Arrays.toString(sol.solution(answer)));
	}
}

class Solution {
	public int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length + 1];
		for (int i = 0; i < num_list.length; i++) {
			answer[i] = num_list[i];
			if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
				answer[answer.length - 1] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
			} else {
				answer[answer.length - 1] = 2 * num_list[num_list.length - 1];
			}
		}

		return answer;
	}
}