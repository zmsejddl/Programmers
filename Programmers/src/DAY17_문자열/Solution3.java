package DAY17_문자열;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		String[] strArr1 = { "and", "notad", "abcd" };
		String[] strArr2 = { "there", "are", "no", "a", "ds" };
		System.out.println(Arrays.toString(sol.solution(strArr1)));
		System.out.println(Arrays.toString(sol.solution(strArr2)));
	}
}

class Solution34 {
	public String[] solution(String[] strArr) {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].indexOf("ad") == -1) {
				list.add(strArr[i]);
			}
		}
		String[] answer = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}