package DAY30;

import java.util.Arrays;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		System.out.println(Arrays.toString(sol.solution(3, 12)));
		System.out.println(Arrays.toString(sol.solution(5, 15)));
		System.out.println(Arrays.toString(sol.solution(4, 14)));
		System.out.println(Arrays.toString(sol.solution(5, 5)));
	}
}

class Solution45 {
	public int[] solution(int num, int total) {
		int[] answer = new int[num];
		answer[0] = (total - (num * (num - 1) / 2)) / num;
		for (int i = 1; i < answer.length; i++) {
			answer[i] = answer[0] + i;
		}
		return answer;
	}
}