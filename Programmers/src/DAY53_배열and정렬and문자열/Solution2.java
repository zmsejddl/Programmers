package DAY53_배열and정렬and문자열;

import java.util.Arrays;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		int[][] score1 = { { 80, 70 }, { 90, 50 }, { 40, 70 }, { 50, 80 } };
		int[][] score2 = { { 80, 70 }, { 70, 80 }, { 30, 50 }, { 90, 100 }, { 100, 90 }, { 100, 100 }, { 10, 30 } };
		System.out.println(Arrays.toString(sol.solution(score1)));
		System.out.println(Arrays.toString(sol.solution(score2)));
	}
}

class Solution23 {
	public int[] solution(int[][] score) {
		double[] averages = new double[score.length];
		Integer[] indices = new Integer[score.length];
		int[] ranks = new int[score.length];

		for (int i = 0; i < score.length; i++) {
			averages[i] = (score[i][0] + score[i][1]) / 2.0;
			indices[i] = i;
		}

		Arrays.sort(indices, (a, b) -> Double.compare(averages[b], averages[a]));

		for (int i = 0; i < score.length; i++) {
			if (i > 0 && averages[indices[i]] == averages[indices[i - 1]]) {
				ranks[indices[i]] = ranks[indices[i - 1]];
			} else {
				ranks[indices[i]] = i + 1;
			}
		}

		return ranks;
	}
}