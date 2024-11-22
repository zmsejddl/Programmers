package DAY52_dpand수학and조건문and배열;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		int[][] lines1 = { { 0, 1 }, { 2, 5 }, { 3, 9 } };
		int[][] lines2 = { { -1, 1 }, { 1, 3 }, { 3, 9 } };
		int[][] lines3 = { { 0, 5 }, { 3, 9 }, { 1, 10 } };
		System.out.println(sol.solution(lines1));
		System.out.println(sol.solution(lines2));
		System.out.println(sol.solution(lines3));
	}
}

class Solution34 {
	public int solution(int[][] lines) {
		int[] lineMap = new int[201];

		for (int[] line : lines) {
			int start = line[0] + 100;
			int end = line[1] + 100;

			for (int i = start; i < end; i++) {
				lineMap[i]++;
			}
		}

		int overlap = 0;
		for (int count : lineMap) {
			if (count > 1) {
				overlap++;
			}
		}

		return overlap;
	}
}