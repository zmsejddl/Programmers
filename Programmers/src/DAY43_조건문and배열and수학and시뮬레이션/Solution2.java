package DAY43_조건문and배열and수학and시뮬레이션;

import java.util.Arrays;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		int[] num_list1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] num_list2 = { 100, 95, 2, 4, 5, 6, 18, 33, 948 };
		System.out.println(Arrays.deepToString(sol.solution(num_list1, 2)));
		System.out.println(Arrays.deepToString(sol.solution(num_list2, 3)));
	}
}

class Solution23 {
	public int[][] solution(int[] num_list, int n) {
		int count = 0;
		int[][] answer = new int[num_list.length / n][n];
		for (int i = 0; i < num_list.length / n; i++) {
			for (int j = 0; j < n; j++) {
				answer[i][j] = num_list[count++];
			}
		}
		return answer;
	}
}