package DAY32;

import java.util.Arrays;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		String[] quiz1 = { "3 - 4 = -3", "5 + 6 = 11" };
		String[] quiz2 = { "19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2" };
		System.out.println(Arrays.toString(sol.solution(quiz1)));
		System.out.println(Arrays.toString(sol.solution(quiz2)));
	}
}

class Solution34 {
	public String[] solution(String[] quiz) {
		String[] answer = new String[quiz.length];
		for (int i = 0; i < quiz.length; i++) {
			String[] parts = quiz[i].split(" ");

			int num1 = Integer.parseInt(parts[0]);
			String operator = parts[1];
			int num2 = Integer.parseInt(parts[2]);
			int result = Integer.parseInt(parts[4]);

			switch (operator) {
			case "+":
				if (num1 + num2 == result) {
					answer[i] = "O";
				} else {
					answer[i] = "X";
				}
				break;
			case "-":
				if (num1 - num2 == result) {
					answer[i] = "O";
				} else {
					answer[i] = "X";
				}
				break;
			case "*":
				if (num1 * num2 == result) {
					answer[i] = "O";
				} else {
					answer[i] = "X";
				}
				break;
			case "/":
				if (num1 / num2 == result) {
					answer[i] = "O";
				} else {
					answer[i] = "X";
				}
				break;
			}
		}
		return answer;
	}
}