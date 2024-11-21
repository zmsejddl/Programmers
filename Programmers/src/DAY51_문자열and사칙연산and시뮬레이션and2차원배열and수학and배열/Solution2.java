package DAY51_문자열and사칙연산and시뮬레이션and2차원배열and수학and배열;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		int[][] board1 = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0 } };
		int[][] board2 = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 1, 1, 0 },
				{ 0, 0, 0, 0, 0 } };
		int[][] board3 = { { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1 } };
		System.out.println(sol.solution(board1));
		System.out.println(sol.solution(board2));
		System.out.println(sol.solution(board3));
	}
}

class Solution23 {
	public int solution(int[][] board) {
		int n = board.length;

		int[] dx = { -1, -1, -1, 0, 1, 1, 1, 0 };
		int[] dy = { -1, 0, 1, 1, 1, 0, -1, -1 };

		boolean[][] dangerZone = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 1) {
					dangerZone[i][j] = true;
					for (int k = 0; k < 8; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];

						if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
							dangerZone[nx][ny] = true;
						}
					}
				}
			}
		}

		int safeCount = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!dangerZone[i][j]) {
					safeCount++;
				}
			}
		}

		return safeCount;
	}
}