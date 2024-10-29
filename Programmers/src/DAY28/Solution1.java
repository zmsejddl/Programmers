package DAY28;

import java.util.Arrays;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		String[] cpr1 = { "call", "respiration", "repeat", "check", "pressure" };
		String[] cpr2 = { "respiration", "repeat", "check", "pressure", "call" };
		System.out.println(Arrays.toString(sol.solution(cpr1)));
		System.out.println(Arrays.toString(sol.solution(cpr2)));
	}
}

class Solution12 {
	public int[] solution(String[] cpr) {
		int[] answer = { 0, 0, 0, 0, 0 };
		String[] basic_order = { "check", "call", "pressure", "respiration", "repeat" };

		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < basic_order.length; j++) {
				if (cpr[i].equals(basic_order[j])) {
					answer[i] = j + 1;
					break;
				}
			}
		}
		return answer;
	}
}
