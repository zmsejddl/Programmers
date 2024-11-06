package DAY36_사칙연산and배열and수학;

import java.util.Arrays;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		int[] array1 = { 1, 2, 7, 10, 11 };
		int[] array2 = { 9, -1, 0 };
		System.out.println(sol.solution(array1));
		System.out.println(sol.solution(array2));
	}
}

class Solution23 {
	public int solution(int[] array) {
		Arrays.sort(array);
		int answer = array[array.length / 2];
		return answer;
	}
}