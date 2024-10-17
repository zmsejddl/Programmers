package DAY17_문자열;

import java.util.ArrayList;
import java.util.Arrays;

import javax.print.attribute.standard.Sides;

public class Solution5 {
	public static void main(String[] args) {
		Solution56 sol = new Solution56();
		System.out.println(Arrays.toString(sol.solution(" i    love  you")));
		System.out.println(Arrays.toString(sol.solution("    programmers  ")));
	}
}

class Solution56 {
	public String[] solution(String my_string) {
		String[] answer = my_string.split(" ");
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < answer.length; i++) {
			if (answer[i].equals("")) {
				continue;
			} else {
				list.add(answer[i]);
			}
		}
		String[] answer2 = new String[list.size()];
		for (int i = 0; i < answer2.length; i++) {
			answer2[i] = list.get(i);
		}
		return answer2;
	}
}