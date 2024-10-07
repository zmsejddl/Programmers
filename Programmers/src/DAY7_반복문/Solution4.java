package DAY7_반복문;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution4 {
	public static void main(String[] args) {
		Solution098 sol = new Solution098();
		System.out.println(Arrays.toString(sol.solution(10)));
	}
}

class Solution098 {
	public int[] solution(int n) {
		ArrayList<Integer> sequence = new ArrayList<Integer>();

		while (n != 1) {
			sequence.add(n);
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
		}
		sequence.add(1);

		int[] answer = new int[sequence.size()];
		for (int i = 0; i < sequence.size(); i++) {
			answer[i] = sequence.get(i);
		}
		return answer;
	}
}