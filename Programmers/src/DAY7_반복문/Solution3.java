package DAY7_반복문;

import java.util.Arrays;

public class Solution3 {
	public static void main(String[] args) {
		Solution234 sol = new Solution234();
		System.out.println(Arrays.toString(sol.solution(3, 10)));
	}
}

class Solution234 {
	public int[] solution(int start_num, int end_num) {
		int[] answer = new int[end_num - start_num + 1];
		int index = 0;
		for (int i = start_num; i <= end_num; i++) {
			answer[index++] = i;
		}
		return answer;
	}
}