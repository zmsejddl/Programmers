package DAY55;

import java.util.Arrays;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		int[] mats = { 5, 3, 2 };
		String[][] park = { { "A", "A", "-1", "B", "B", "B", "B", "-1" }, { "A", "A", "-1", "B", "B", "B", "B", "-1" },
				{ "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1" }, { "D", "D", "-1", "-1", "-1", "-1", "E", "-1" },
				{ "D", "D", "-1", "-1", "-1", "-1", "-1", "F" }, { "D", "D", "-1", "-1", "-1", "-1", "E", "-1" } };
		System.out.println(sol.solution(mats, park));
	}
}

class Solution23 {
	public int solution(int[] mats, String[][] park) {
		Arrays.sort(mats);
		for (int i = mats.length - 1; i >= 0; i--) {
			int size = mats[i];
			if (canPlaceMat(size, park)) {
				return size;
			}
		}
		return -1;
	}

	private boolean canPlaceMat(int size, String[][] park) {
		int rows = park.length;
		int cols = park[0].length;

		for (int i = 0; i <= rows - size; i++) {
			for (int j = 0; j <= cols - size; j++) {
				if (canPlace(size, park, i, j)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean canPlace(int size, String[][] park, int startX, int startY) {
		for (int i = startX; i < startX + size; i++) {
			for (int j = startY; j < startY + size; j++) {
				if (!park[i][j].equals("-1")) {
					return false;
				}
			}
		}
		return true;
	}
}