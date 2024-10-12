package DAY12_리스트_배열;

import java.util.Arrays;

public class Solution1 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] slicer = { 1, 5, 2 };
		int[] num_list = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(sol.solution(4, slicer, num_list)));
	}
}

class Solution {
	public int[] solution(int n, int[] slicer, int[] num_list) {
		int[] answer = {};
		if (n == 1) {
			answer = new int[slicer[1] + 1];
			for (int i = 0; i <= slicer[1]; i++) {
				answer[i] = num_list[i];
			}
		} else if (n == 2) {
			answer = new int[num_list.length - slicer[0]];
			for (int i = 0; i < answer.length; i++) {
				answer[i] = num_list[slicer[0] + i];
			}
		} else if (n == 3) {
			answer = new int[slicer[1] - slicer[0] + 1];
			for (int i = 0; i < answer.length; i++) {
				answer[i] = num_list[slicer[0] + i];
			}
		} else if (n == 4) {
			int size = ((slicer[1] - slicer[0]) / slicer[2] + 1);
			answer = new int[size];
			for (int i = 0; i < size; i++) {
				answer[i] = num_list[slicer[0] + i * slicer[2]];
			}
		}
		return answer;
	}
}