package DAY25_이차원리스트_배열;

import java.util.Arrays;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		System.out.println(Arrays.deepToString(sol.solution(4)));
		System.out.println(Arrays.deepToString(sol.solution(5)));
	}
}

class Solution12 {
	public int[][] solution(int n) {
		int[][] answer = new int[n][n];
		int num = 1;
		int top = 0, bottom = n - 1, left = 0, right = n - 1;

		while (num <= n * n) {
			for (int i = left; i <= right; i++) {
				answer[top][i] = num++;
			}
			top++;

			for (int i = top; i <= bottom; i++) {
				answer[i][right] = num++;
			}
			right--;

			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					answer[bottom][i] = num++;
				}
				bottom--;
			}

			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					answer[i][left] = num++;
				}
				left++;
			}
		}

		return answer;
	}
}
