package DAY36_사칙연산and배열and수학;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		System.out.println(Arrays.toString(sol.solution(10)));
		System.out.println(Arrays.toString(sol.solution(15)));
	}
}

class Solution45 {
	public int[] solution(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 1) {
				list.add(i);
			}
		}

		int[] answer = new int[list.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}