package DAY6_조건문and반복문;

import java.util.Arrays;

public class Solution5 {
	public static void main(String[] args) {
		Solution245 sol = new Solution245();
		int[] arr = { 0, 1, 2, 4, 3 };
		int[][] queries = { { 0, 4, 2 }, { 0, 3, 2 }, { 0, 2, 2 } };
		System.out.println(Arrays.toString(sol.solution(arr, queries)));
	}
}

class Solution245 {
	public int[] solution(int[] arr, int[][] queries) {
		int[] answer = new int[queries.length];

		for (int i = 0; i < queries.length; i++) {
			int a = Integer.MAX_VALUE;
			for (int j = queries[i][0]; j <= queries[i][1]; j++) {
				if (arr[j] > queries[i][2] && arr[j] < a) {
					a = arr[j];
				}

				if (a == Integer.MAX_VALUE) {
					answer[i] = -1;
				} else {
					answer[i] = a;
				}
			}
		}
		return answer;
	}
}