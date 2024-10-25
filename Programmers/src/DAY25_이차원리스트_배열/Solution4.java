package DAY25_이차원리스트_배열;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		int[][] board = { { 0, 1, 2 }, { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } };
		System.out.println(sol.solution(board, 2));
	}
}

class Solution45 {
	public int solution(int[][] board, int k) {
		int answer = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (i + j <= k) {
					answer += board[i][j];
				}
			}
		}
		return answer;
	}
}