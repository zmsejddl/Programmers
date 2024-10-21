package DAY21_함수_메서드;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		int[] rank1 = { 3, 7, 2, 5, 4, 6, 1 };
		int[] rank2 = { 1, 2, 3 };
		int[] rank3 = { 6, 1, 5, 2, 3, 4 };
		boolean[] attendance1 = { false, true, true, true, true, false, false };
		boolean[] attendance2 = { true, true, true };
		boolean[] attendance3 = { true, false, true, false, false, true };
		System.out.println(sol.solution(rank1, attendance1));
		System.out.println(sol.solution(rank2, attendance2));
		System.out.println(sol.solution(rank3, attendance3));
	}
}

class Solution23 {
	public int solution(int[] rank, boolean[] attendance) {
		ArrayList<int[]> list = new ArrayList<int[]>();
		for (int i = 0; i < attendance.length; i++) {
			if (attendance[i]) {
				list.add(new int[] { rank[i], i });
			}
		}
		Collections.sort(list, new Comparator<int[]>() {
			@Override
			public int compare(int[] a, int[] b) {
				return a[0] - b[0];
			}
		});
		int a = list.get(0)[1];
		int b = list.get(1)[1];
		int c = list.get(2)[1];
		int answer = 10000 * a + 100 * b + c;
		return answer;
	}
}