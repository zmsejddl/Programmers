package DAY19_문자열and리스트_배열;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution1 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(Arrays.toString(sol.solution("baconlettucetomato")));
		System.out.println(Arrays.toString(sol.solution("abcd")));
		System.out.println(Arrays.toString(sol.solution("cabab")));
	}
}

class Solution {
	public String[] solution(String myStr) {
		String[] answer = {};
		String[] parts = myStr.split("[abc]+");
		ArrayList<String> list = new ArrayList<String>();
		for (String part : parts) {
			if (!part.isEmpty()) {
				list.add(part);
			}
		}
		if (list.isEmpty()) {
			return new String[] { "EMPTY" };
		} else {
			return list.toArray(new String[list.size()]);
		}
	}
}