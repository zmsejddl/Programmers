package DAY19_문자열and리스트_배열;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution5 {
	public static void main(String[] args) {
		Solution56 sol = new Solution56();
		int[] arr1 = { 0, 1, 1, 2, 2, 3 };
		int[] arr2 = { 0, 1, 1, 1, 1 };
		System.out.println(Arrays.toString(sol.solution(arr1, 3)));
		System.out.println(Arrays.toString(sol.solution(arr2, 4)));
	}
}

class Solution56 {
	public int[] solution(int[] arr, int k) {
		int[] answer = new int[k];
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		}
		for (int i = 0; i < k; i++) {
			if (i < list.size()) {
				answer[i] = list.get(i);
			} else {
				answer[i] = -1;
			}
		}
		return answer;
	}
}