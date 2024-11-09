package DAY39_문자열and반복문and출력and배열and조건문;

import java.util.Arrays;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		int[] num_list1 = { 1, 2, 3, 4, 5 };
		int[] num_list2 = { 1, 3, 5, 7 };
		System.out.println(Arrays.toString(sol.solution(num_list1)));
		System.out.println(Arrays.toString(sol.solution(num_list2)));
	}
}

class Solution34 {
	public int[] solution(int[] num_list) {
		int[] answer = { 0, 0 };
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 == 0) {
				answer[0]++;
			} else if (num_list[i] % 2 == 1) {
				answer[1]++;
			}
		}
		return answer;
	}
}