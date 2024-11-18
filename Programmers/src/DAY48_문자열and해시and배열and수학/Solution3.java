package DAY48_문자열and해시and배열and수학;

import java.util.Arrays;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		System.out.println(sol.solution("abcabcadc"));
		System.out.println(sol.solution("abdc"));
		System.out.println(sol.solution("hello"));
	}
}

class Solution34 {
	public String solution(String s) {
		String answer = "";
		String[] sp = s.split("");
		Arrays.sort(sp);
		for (int i = 0; i < s.length(); i++) {
			if (s.length() - s.replace(String.valueOf(sp[i]), "").length() == 1) {
				answer += sp[i];
			}
		}
		return answer;
	}
}