package DAY20_함수_메서드;

import java.util.Arrays;

public class Solution5 {
	public static void main(String[] args) {
		Solution56 sol = new Solution56();
		int[] num_list = { 12, 4, 15, 46, 38, 1, 14 };
		System.out.println(Arrays.toString(sol.solution(num_list)));
	}
}

class Solution56 {
	public int[] solution(int[] num_list) {
		int[] answer = new int[5];
		Arrays.sort(num_list);
		for (int i = 0; i < 5; i++) {
			answer[i] = num_list[i];
		}
		return answer;
	}
}