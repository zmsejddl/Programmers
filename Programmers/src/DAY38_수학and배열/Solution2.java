package DAY38_수학and배열;

import java.util.Arrays;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		System.out.println(Arrays.toString(sol.solution(5500)));
		System.out.println(Arrays.toString(sol.solution(15000)));
	}
}

class Solution23 {
	public int[] solution(int money) {
		int[] answer = new int[2];
		answer[0] = money / 5500;
		answer[1] = money % 5500;
		return answer;
	}
}