package DAY51_문자열and사칙연산and시뮬레이션and2차원배열and수학and배열;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		System.out.println(sol.solution("aAb1B2cC34oOp"));
		System.out.println(sol.solution("1a2b3c4d123Z"));
	}
}

class Solution12 {
	public int solution(String my_string) {
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();

		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(my_string);

		while (matcher.find()) {
			list.add(Integer.parseInt(matcher.group()));
		}

		for (int i = 0; i < list.size(); i++) {
			answer += list.get(i);
		}
		return answer;
	}
}