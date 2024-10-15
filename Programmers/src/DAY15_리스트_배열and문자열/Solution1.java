package DAY15_리스트_배열and문자열;

import java.util.Arrays;

public class Solution1 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] arr = { 1, 2, 3, 100, 99, 98 };
		System.out.println(Arrays.toString(sol.solution(arr)));
	}
}

class Solution {
	public int[] solution(int[] arr) {
		int[] answer = new int[arr.length];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = arr[i];
			if (arr[i] % 2 == 0 && arr[i] >= 50) {
				answer[i] = arr[i] / 2;
			} else if (arr[i] % 2 == 1 && arr[i] < 50) {
				answer[i] = arr[i] * 2;
			}
		}
		return answer;
	}
}