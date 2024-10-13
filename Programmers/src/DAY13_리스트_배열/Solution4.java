package DAY13_리스트_배열;

import java.util.Arrays;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		int[] num_list1 = { 2, 1, 6 };
		int[] num_list2 = { 5, 2, 1, 7, 5 };
		System.out.println(Arrays.toString(sol.solution(num_list1, 1)));
		System.out.println(Arrays.toString(sol.solution(num_list2, 3)));
	}
}

class Solution45 {
	public int[] solution(int[] num_list, int n) {
		int[] answer = new int[n];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num_list[i];
		}
		return answer;
	}
}