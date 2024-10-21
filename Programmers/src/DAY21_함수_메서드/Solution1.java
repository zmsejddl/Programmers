package DAY21_함수_메서드;

import java.util.Arrays;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		int[] num_list = { 12, 4, 15, 46, 38, 1, 14, 56, 32, 10 };
		System.out.println(Arrays.toString(sol.solution(num_list)));
	}
}

class Solution12 {
	public int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length - 5];
		Arrays.sort(num_list);
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num_list[i + 5];
		}
		return answer;
	}
}