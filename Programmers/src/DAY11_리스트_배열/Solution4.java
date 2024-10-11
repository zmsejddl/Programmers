package DAY11_리스트_배열;

import java.util.Arrays;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		System.out.println(Arrays.toString(sol.solution(10, 3)));
	}
}

class Solution45 {
	public int[] solution(int start_num, int end_num) {
		int[] answer = new int[start_num - end_num + 1];
		int s = start_num;
		for (int i = 0; i < start_num - end_num + 1; i++) {
			answer[i] = s--;
		}
		return answer;
	}
}