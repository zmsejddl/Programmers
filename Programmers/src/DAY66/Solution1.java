package DAY66;

import java.util.Arrays;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		int[] score1 = { 1, 2, 3, 1, 2, 3, 1 };
		int[] score2 = { 4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2 };
		System.out.println(sol.solution(3, 4, score1));
		System.out.println(sol.solution(4, 3, score2));
	}
}

class Solution12 {
	public int solution(int k, int m, int[] score) {
		int totalProfit = 0;

		Arrays.sort(score);
		int n = score.length;

		for (int i = n - m; i >= 0; i -= m) {
			totalProfit += score[i] * m;
		}

		return totalProfit;
	}
}