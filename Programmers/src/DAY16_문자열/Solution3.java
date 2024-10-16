package DAY16_문자열;

import java.util.Arrays;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		String[] strArr1 = { "AAA", "BBB", "CCC", "DDD" };
		String[] strArr2 = { "aBc", "AbC" };
		System.out.println(Arrays.toString(sol.solution(strArr1)));
		System.out.println(Arrays.toString(sol.solution(strArr2)));
	}
}

class Solution34 {
	public String[] solution(String[] strArr) {
		String[] answer = new String[strArr.length];
		for (int i = 0; i < answer.length; i++) {
			if (i % 2 == 0) {
				answer[i] = strArr[i].toLowerCase();
			} else {
				answer[i] = strArr[i].toUpperCase();
			}
		}
		return answer;
	}
}