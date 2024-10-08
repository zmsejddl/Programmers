package DAY8_조건문and문자열;

import java.util.Arrays;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		System.out.println(sol.solution(2, 2, 2, 2));
	}
}

class Solution23 {
	public int solution(int a, int b, int c, int d) {
		int answer = 0;
		int[] dice = { a, b, c, d };
		Arrays.sort(dice);

		if (dice[0] == dice[3]) {
			answer = dice[0] * 1111;
		} else if (dice[0] == dice[2] || dice[1] == dice[3]) {
			int p = (dice[0] == dice[2]) ? dice[0] : dice[3];
			int q = (dice[0] == dice[2]) ? dice[3] : dice[0];
			answer = (10 * p + q) * (10 * p + q);
		} else if (dice[0] == dice[1] && dice[2] == dice[3]) {
			int p = dice[0];
			int q = dice[2];
			answer = (p + q) * Math.abs(p - q);
		} else if (dice[0] == dice[1] || dice[1] == dice[2] || dice[2] == dice[3]) {
			int p = (dice[0] == dice[1]) ? dice[0] : dice[2];
			int q = (dice[0] != dice[1]) ? dice[0] : dice[2];
			int r = (dice[3] != dice[2]) ? dice[3] : dice[1];
			answer = q * r;
		} else {
			answer = dice[0];
		}
		return answer;
	}
}