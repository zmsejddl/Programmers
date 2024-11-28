package DAY58;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		int[][] data = { { 1, 20300104, 100, 80 }, { 2, 20300804, 847, 37 }, { 3, 20300401, 10, 8 } };
		System.out.println(Arrays.deepToString(sol.solution(data, "date", 20300501, "remain")));
	}
}

class Solution23 {
	public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
		int extIndex = getColumnIndex(ext);
		int sortByIndex = getColumnIndex(sort_by);

		List<int[]> filteredList = new ArrayList<int[]>();
		for (int[] row : data) {
			if (row[extIndex] < val_ext) {
				filteredList.add(row);
			}
		}

		filteredList.sort(Comparator.comparingInt(row -> row[sortByIndex]));

		int[][] answer = new int[filteredList.size()][];
		for (int i = 0; i < filteredList.size(); i++) {
			answer[i] = filteredList.get(i);
		}

		return answer;
	}

	private int getColumnIndex(String columnName) {
		switch (columnName) {
		case "code":
			return 0;
		case "date":
			return 1;
		case "maximum":
			return 2;
		case "remain":
			return 3;
		default:
			throw new IllegalArgumentException("Invalid column name: " + columnName);
		}
	}
}