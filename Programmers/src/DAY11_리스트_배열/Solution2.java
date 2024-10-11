package DAY11_리스트_배열;

import java.util.Arrays;

public class Solution2 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		System.out.println(Arrays.toString(sol.solution(10, 3)));
	}
}

class Solution12 {
	public int[] solution(int n, int k) {
		int[] answer = new int[n / k];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = k * (i + 1);
		}
		return answer;
	}
}