package DAY29;

import java.util.Arrays;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		int[] numbers1 = { 1 };
		int[] numbers2 = { 3, 4 };
		int[] our_score1 = { 100 };
		int[] our_score2 = { 85, 93 };
		int[] score_list1 = { 100, 80, 90, 84, 20 };
		int[] score_list2 = { 85, 92, 38, 93, 48, 85, 92, 56 };
		System.out.println(Arrays.toString(sol.solution(numbers1, our_score1, score_list1)));
		System.out.println(Arrays.toString(sol.solution(numbers2, our_score2, score_list2)));
	}
}

class Solution45 {
	public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
		int num_student = numbers.length;
		String[] answer = new String[num_student];

		for (int i = 0; i < num_student; i++) {
			if (our_score[i] == score_list[numbers[i] - 1]) {
				answer[i] = "Same";
			} else {
				answer[i] = "Different";
			}
		}

		return answer;
	}
}
