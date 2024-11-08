package DAY38_수학and배열;

import java.util.Arrays;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		int[] num_list1 = { 1, 2, 3, 4, 5 };
		int[] num_list2 = { 1, 1, 1, 1, 1, 2 };
		int[] num_list3 = { 1, 0, 1, 1, 1, 3, 5 };
		System.out.println(Arrays.toString(sol.solution(num_list1)));
		System.out.println(Arrays.toString(sol.solution(num_list2)));
		System.out.println(Arrays.toString(sol.solution(num_list3)));
	}
}

class Solution45 {
	public int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length];

		for (int i = 0; i < num_list.length / 2; i++) {
			int temp = num_list[i];
			num_list[i] = num_list[num_list.length - 1 - i];
			num_list[num_list.length - 1 - i] = temp;
		}

		for (int i = 0; i < answer.length; i++) {
			answer[i] = num_list[i];
		}
		return answer;
	}
}