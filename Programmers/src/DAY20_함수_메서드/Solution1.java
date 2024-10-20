package DAY20_함수_메서드;

import java.util.Arrays;

public class Solution1 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int[] arr2 = { 58, 172, 746, 89 };
		System.out.println(Arrays.toString(sol.solution(arr1)));
		System.out.println(Arrays.toString(sol.solution(arr2)));
	}
}

class Solution {
	public int[] solution(int[] arr) {
		int two = 1;
		while (two < arr.length) {
			two *= 2;
		}
		if (two == arr.length) {
			return arr;
		}
		int[] answer = new int[two];
		for (int i = 0; i < arr.length; i++) {
			answer[i] = arr[i];
		}
		return answer;
	}
}