package DAY24_조건물활용and반복문활용and이차원리스트_배열;

import java.util.Arrays;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		int[] arr = { 1, 2, 3, 100, 99, 98 };
		System.out.println(Arrays.toString(sol.solution(arr, 3)));
		System.out.println(Arrays.toString(sol.solution(arr, 2)));
	}
}

class Solution34 {
	public int[] solution(int[] arr, int k) {
		int[] answer = new int[arr.length];
		if (k % 2 == 1) {
			for (int i = 0; i < answer.length; i++) {
				answer[i] = arr[i] * k;
			}
		} else if (k % 2 == 0) {
			for (int i = 0; i < answer.length; i++) {
				answer[i] = arr[i] + k;
			}
		}
		return answer;
	}
}