package DAY46_문자열and배열and사칙연산and수학and조건문;

import java.util.Arrays;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		String[] strlist1 = { "We", "are", "the", "world!" };
		String[] strlist2 = { "I", "Love", "Programmers." };
		System.out.println(Arrays.toString(sol.solution(strlist1)));
		System.out.println(Arrays.toString(sol.solution(strlist2)));
	}
}

class Solution23 {
	public int[] solution(String[] strlist) {
		int[] answer = new int[strlist.length];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = strlist[i].length();
		}
		return answer;
	}
}