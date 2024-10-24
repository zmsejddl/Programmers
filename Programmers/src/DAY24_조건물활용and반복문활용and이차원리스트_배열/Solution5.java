package DAY24_조건물활용and반복문활용and이차원리스트_배열;

import java.util.Arrays;

public class Solution5 {
	public static void main(String[] args) {
		Solution56 sol = new Solution56();
		System.out.println(Arrays.deepToString(sol.solution(3)));
		System.out.println(Arrays.deepToString(sol.solution(6)));
		System.out.println(Arrays.deepToString(sol.solution(1)));
	}
}

class Solution56 {
	public int[][] solution(int n) {
		int[][] answer = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					answer[i][j] = 1;
				} else if (i != j) {
					answer[i][j] = 0;
				}
			}
		}
		return answer;
	}
}