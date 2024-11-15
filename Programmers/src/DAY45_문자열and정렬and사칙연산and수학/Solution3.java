package DAY45_문자열and정렬and사칙연산and수학;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		System.out.println(sol.solution("aAb1B2cC34oOp"));
		System.out.println(sol.solution("1a2b3c4d123"));
	}
}

class Solution34 {
	public int solution(String my_string) {
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (char c : my_string.toCharArray()) {
			if (Character.isDigit(c)) {
				list.add(Character.getNumericValue(c));
			}
		}

		for (int i = 0; i < list.size(); i++) {
			answer += list.get(i);
		}
		return answer;
	}
}