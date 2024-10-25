package DAY25_이차원리스트_배열;

import java.util.Arrays;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		int[][] arr1 = { { 572, 22, 37 }, { 287, 726, 384 }, { 85, 137, 292 }, { 487, 13, 876 } };
		int[][] arr2 = { { 57, 192, 534, 2 }, { 9, 345, 192, 999 } };
		int[][] arr3 = { { 1, 2 }, { 3, 4 } };
		System.out.println(Arrays.deepToString(sol.solution(arr1)));
		System.out.println(Arrays.deepToString(sol.solution(arr2)));
		System.out.println(Arrays.deepToString(sol.solution(arr3)));
	}
}

class Solution34 {
	public int[][] solution(int[][] arr) {
		int[][] answer = {};
		if (arr.length < arr[0].length) {
			answer = new int[arr[0].length][arr[0].length];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					answer[i][j] = arr[i][j];
				}
			}
		} else if (arr.length > arr[0].length) {
			answer = new int[arr.length][arr.length];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					answer[i][j] = arr[i][j];
				}
			}
		} else if (arr.length == arr[0].length) {
			return arr;
		}
		return answer;
	}
}