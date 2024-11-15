package DAY45_문자열and정렬and사칙연산and수학;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		System.out.println(Arrays.toString(sol.solution("hi12392")));
		System.out.println(Arrays.toString(sol.solution("p2o4i8gj2")));
		System.out.println(Arrays.toString(sol.solution("abcde0")));
	}
}

class Solution23 {
	public int[] solution(String my_string) {
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (char c : my_string.toCharArray()) {
			if (Character.isDigit(c)) {
				list.add(Character.getNumericValue(c));
			}
		}

		answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		Arrays.sort(answer);
		return answer;
	}
}