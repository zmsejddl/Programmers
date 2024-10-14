package DAY14_리스트_배열;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		String[] todo_list = { "problemsolving", "practiceguitar", "swim", "studygraph" };
		boolean[] finished = { true, false, true, false };
		System.out.println(Arrays.toString(sol.solution(todo_list, finished)));
	}
}

class Solution34 {
	public String[] solution(String[] todo_list, boolean[] finished) {
		String[] answer = {};
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < finished.length; i++) {
			if (finished[i] == false) {
				list.add(todo_list[i]);
			}
			answer = new String[list.size()];
		}
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}