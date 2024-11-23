package DAY53_배열and정렬and문자열;

import java.util.Arrays;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		int[] numlist1 = { 1, 2, 3, 4, 5, 6 };
		int[] numlist2 = { 10000, 20, 36, 47, 40, 6, 10, 7000 };
		System.out.println(Arrays.toString(sol.solution(numlist1, 4)));
		System.out.println(Arrays.toString(sol.solution(numlist2, 30)));
	}
}

class Solution12 {
	public int[] solution(int[] numlist, int n) {
		Integer[] sortedArr = Arrays.stream(numlist).boxed().toArray(Integer[]::new);

		Arrays.sort(sortedArr, (a, b) -> {
			int distA = Math.abs(a - n);
			int distB = Math.abs(b - n);

			if (distA == distB) {
				return b - a;
			}
			return distA - distB;
		});

		return Arrays.stream(sortedArr).mapToInt(Integer::intValue).toArray();
	}
}