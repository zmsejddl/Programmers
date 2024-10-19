package DAY19_문자열and리스트_배열;

import java.util.Arrays;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		int[] arr1 = { 5, 1, 4 };
		int[] arr2 = { 6, 6 };
		int[] arr3 = { 1 };
		System.out.println(Arrays.toString(sol.solution(arr1)));
		System.out.println(Arrays.toString(sol.solution(arr2)));
		System.out.println(Arrays.toString(sol.solution(arr3)));
	}
}

class Solution23 {
	public int[] solution(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int[] answer = new int[sum];
		int index = 0;
		for (int num : arr) {
			for (int j = 0; j < num; j++) {
				answer[index++] = num;
			}
		}
		return answer;
	}
}