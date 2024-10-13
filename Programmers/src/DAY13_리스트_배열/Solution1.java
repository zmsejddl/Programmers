package DAY13_리스트_배열;

import java.util.Arrays;

public class Solution1 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] num_list1 = { 2, 1, 6 };
		int[] num_list2 = { 5, 2, 1, 7, 5 };
		System.out.println(Arrays.toString(sol.solution(num_list1, 3)));
		System.out.println(Arrays.toString(sol.solution(num_list2, 2)));
	}
}

class Solution {
	public int[] solution(int[] num_list, int n) {
		int[] answer = new int[num_list.length - (n - 1)];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num_list[n - 1 + i];
		}
		return answer;
	}
}