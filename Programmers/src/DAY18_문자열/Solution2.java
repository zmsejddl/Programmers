package DAY18_문자열;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		System.out.println(Arrays.toString(sol.solution("axbxcxdx")));
		System.out.println(Arrays.toString(sol.solution("dxccxbbbxaaaa")));
	}
}

class Solution23 {
	public String[] solution(String myString) {
		String[] strArray = myString.split("x");
		ArrayList<String> list = new ArrayList<String>();
		for (String str : strArray) {
			if (!str.isEmpty()) {
				list.add(str);
			}
		}
		String[] answer = list.toArray(new String[list.size()]);
		Arrays.sort(answer);
		return answer;
	}
}