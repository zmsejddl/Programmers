package DAY13_리스트_배열;

import java.util.Arrays;

public class Solution5 {
	public static void main(String[] args) {
		Solution56 sol = new Solution56();
		int[] num_list = { 4, 2, 6, 1, 7, 6 };
		System.out.println(Arrays.toString(sol.solution(num_list, 2)));
		System.out.println(Arrays.toString(sol.solution(num_list, 4)));
	}
}

class Solution56 {
	public int[] solution(int[] num_list, int n) {
		int[] answer = {};
		if (num_list.length % n == 0) {
			answer = new int[num_list.length / n];
		} else if (num_list.length % n != 0) {
			answer = new int[(num_list.length / n) + 1];
		}
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num_list[i * n];
		}
		return answer;
	}
}