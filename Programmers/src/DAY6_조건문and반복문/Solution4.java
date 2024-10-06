package DAY6_조건문and반복문;

import java.util.Arrays;

public class Solution4 {
	public static void main(String[] args) {
		Solution345 sol = new Solution345();
		int[] arr = { 0, 1, 2, 3, 4 };
		int[][] queries = { { 0, 3 }, { 1, 2 }, { 1, 4 } };
		System.out.println(Arrays.toString(sol.solution(arr, queries)));
	}
}

class Solution345 {
	public int[] solution(int[] arr, int[][] queries) {
		int[] answer = new int[arr.length];
		int temp = 0;
		for (int i = 0; i < queries.length; i++) {
			temp = arr[queries[i][0]];
			arr[queries[i][0]] = arr[queries[i][1]];
			arr[queries[i][1]] = temp;
		}
		answer = arr;
		return answer;
	}
}