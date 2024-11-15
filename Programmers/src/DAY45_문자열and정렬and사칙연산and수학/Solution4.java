package DAY45_문자열and정렬and사칙연산and수학;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		System.out.println(Arrays.toString(sol.solution(12)));
		System.out.println(Arrays.toString(sol.solution(17)));
		System.out.println(Arrays.toString(sol.solution(420)));
	}
}

class Solution45 {
	public int[] solution(int n) {
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				if (!list.contains(i)) {
					list.add(i);
				}
				n /= i;
			}
		}

		answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}