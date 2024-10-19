package DAY19_문자열and리스트_배열;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		int[] arr = { 3, 2, 4, 1, 3 };
		boolean[] flag = { true, false, true, false, false };
		System.out.println(Arrays.toString(sol.solution(arr, flag)));
	}
}

class Solution34 {
	public int[] solution(int[] arr, boolean[] flag) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (flag[i] == true) {
				for (int j = 0; j < arr[i] * 2; j++) {
					list.add(arr[i]);
				}
			} else if (flag[i] == false) {
				for (int j = 0; j < arr[i]; j++) {
					if (!list.isEmpty()) {
						list.remove(list.size() - 1);
					}
				}
			}
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}