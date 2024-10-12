package DAY12_리스트_배열;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution5 {
	public static void main(String[] args) {
		Solution56 sol = new Solution56();
		int[] arr = { 0, 1, 2, 3, 4, 5 };
		int[] query = { 4, 1, 2 };
		System.out.println(Arrays.toString(sol.solution(arr, query)));
	}
}

class Solution56 {
	public int[] solution(int[] arr, int[] query) {
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		for (int i = 0; i < query.length; i++) {
			if (i % 2 == 0) {
				list = new ArrayList<Integer>(list.subList(0, query[i] + 1));
			} else {
				list = new ArrayList<Integer>(list.subList(query[i], list.size()));
			}
		}
		answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}