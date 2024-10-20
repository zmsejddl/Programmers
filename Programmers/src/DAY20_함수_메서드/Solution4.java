package DAY20_함수_메서드;

import java.util.Arrays;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		int[] arr1 = { 49, 12, 100, 276, 33 };
		int[] arr2 = { 444, 555, 666, 777 };
		System.out.println(Arrays.toString(sol.solution(arr1, 27)));
		System.out.println(Arrays.toString(sol.solution(arr2, 100)));
	}
}

class Solution45 {
	public int[] solution(int[] arr, int n) {
		int[] answer = new int[arr.length];
		if (arr.length % 2 == 0) {
			for (int i = 0; i < arr.length; i++) {
				answer[i] = arr[i];
				if (i % 2 != 0) {
					answer[i] = arr[i] + n;
				}
			}
		} else if (arr.length % 2 != 0) {
			for (int i = 0; i < arr.length; i++) {
				answer[i] = arr[i];
				if (i % 2 == 0) {
					answer[i] = arr[i] + n;
				}
			}
		}
		return answer;
	}
}