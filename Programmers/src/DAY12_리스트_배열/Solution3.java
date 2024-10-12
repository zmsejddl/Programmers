package DAY12_리스트_배열;

import java.util.Arrays;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		int[] arr = { 1, 2, 3, 4, 5 };
		int[][] intervals = { { 1, 3 }, { 0, 4 } };
		System.out.println(Arrays.toString(sol.solution(arr, intervals)));
	}
}

class Solution34 {
	public int[] solution(int[] arr, int[][] intervals) {
		int size = intervals[0][1] - intervals[0][0] + intervals[1][1] - intervals[1][0] + 2;
		int[] answer = new int[size];
		for (int i = 0; i < intervals[0][1] - intervals[0][0] + 1; i++) {
			answer[i] = arr[intervals[0][0] + i];
		}
		for (int i = 0; i < intervals[1][1] - intervals[1][0] + 1; i++) {
			answer[intervals[0][1] - intervals[0][0] + 1 + i] = arr[intervals[1][0] + i];
		}
		return answer;
	}
}