package DAY50_수학and시뮬레이션and문자열and사칙연산;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		int[][] dots1 = { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } };
		int[][] dots2 = { { -1, -1 }, { 1, 1 }, { 1, -1 }, { -1, 1 } };
		System.out.println(sol.solution(dots1));
		System.out.println(sol.solution(dots2));
	}
}

class Solution12 {
	public int solution(int[][] dots) {
		int minX = Integer.MAX_VALUE;
		int maxX = Integer.MIN_VALUE;
		int minY = Integer.MAX_VALUE;
		int maxY = Integer.MIN_VALUE;

		for (int[] dot : dots) {
			minX = Math.min(minX, dot[0]);
			maxX = Math.max(maxX, dot[0]);
			minY = Math.min(minY, dot[1]);
			maxY = Math.max(maxY, dot[1]);
		}

		int width = maxX - minX;
		int height = maxY - minY;

		return width * height;
	}
}