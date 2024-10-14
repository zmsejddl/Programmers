package DAY14_리스트_배열;

import java.util.Arrays;

public class Solution5 {
	public static void main(String[] args) {
		Solution56 sol = new Solution56();
		int[] arr = { 0, 1, 2, 3, 4 };
		int[][] queries = { { 0, 1 }, { 1, 2 }, { 2, 3 } };
		System.out.println(Arrays.toString(sol.solution(arr, queries)));
	}
}

class Solution56 {
	public int[] solution(int[] arr, int[][] queries) {
		int[] answer = new int[arr.length];
		for (int i = 0; i < queries.length; i++) {
			for (int j = queries[i][0]; j <= queries[i][1]; j++) {
				arr[j] = arr[j] + 1;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			answer[i] = arr[i];
		}
		return answer;
	}
}