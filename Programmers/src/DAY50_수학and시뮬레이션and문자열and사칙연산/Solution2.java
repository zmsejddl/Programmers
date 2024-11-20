package DAY50_수학and시뮬레이션and문자열and사칙연산;

import java.util.Arrays;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		String[] keyinput1 = { "left", "right", "up", "right", "right" };
		String[] keyinput2 = { "down", "down", "down", "down", "down" };
		int[] board1 = { 11, 11 };
		int[] board2 = { 7, 9 };
		System.out.println(Arrays.toString(sol.solution(keyinput1, board1)));
		System.out.println(Arrays.toString(sol.solution(keyinput2, board2)));
	}
}

class Solution23 {
	public int[] solution(String[] keyinput, int[] board) {
		int[] answer = { 0, 0 };
		int xLimit = board[0] / 2;
		int yLimit = board[1] / 2;

		for (String key : keyinput) {
            switch (key) {
                case "up":
                    if (answer[1] < yLimit) answer[1]++;
                    break;
                case "down":
                    if (answer[1] > -yLimit) answer[1]--;
                    break;
                case "left":
                    if (answer[0] > -xLimit) answer[0]--;
                    break;
                case "right":
                    if (answer[0] < xLimit) answer[0]++;
                    break;
            }
        }

		return answer;
	}
}