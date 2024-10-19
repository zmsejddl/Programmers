package DAY19_문자열and리스트_배열;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		int[] arr1 = { 0, 1, 1, 1, 0 };
		int[] arr2 = { 0, 1, 0, 1, 0 };
		int[] arr3 = { 0, 1, 1, 0 };
		System.out.println(Arrays.toString(sol.solution(arr1)));
		System.out.println(Arrays.toString(sol.solution(arr2)));
		System.out.println(Arrays.toString(sol.solution(arr3)));
	}
}

class Solution45 {
	public int[] solution(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (list.isEmpty()) {
				list.add(arr[i]);
			} else {
				if (list.get(list.size() - 1) == arr[i]) {
					list.remove(list.size() - 1);
				} else {
					list.add(arr[i]);
				}
			}
		}
		if (list.isEmpty()) {
			return new int[] { -1 };
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}