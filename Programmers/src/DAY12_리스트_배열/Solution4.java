package DAY12_리스트_배열;

import java.util.Arrays;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		int[] arr1 = { 1, 2, 1, 4, 5, 2, 9 };
		int[] arr2 = { 1, 2, 1 };
		int[] arr3 = { 1, 1, 1 };
		int[] arr4 = { 1, 2, 1, 2, 1, 10, 2, 1 };
		System.out.println(Arrays.toString(sol.solution(arr1)));
		System.out.println(Arrays.toString(sol.solution(arr2)));
		System.out.println(Arrays.toString(sol.solution(arr3)));
		System.out.println(Arrays.toString(sol.solution(arr4)));
	}
}

class Solution45 {
	public int[] solution(int[] arr) {
		int f = -1;
		int l = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 2) {
				if (f == -1) {
					f = i;
				}
				l = i;
			}
		}
		if (f == -1) {
			return new int[] { -1 };
		}
		int[] answer = new int[l - f + 1];
		for (int i = f; i <= l; i++) {
			answer[i - f] = arr[i];
		}
		return answer;
	}
}