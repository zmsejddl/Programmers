package DAY52_dpand수학and조건문and배열;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		int[][] dots1 = { { 1, 4 }, { 9, 2 }, { 3, 8 }, { 11, 6 } };
		int[][] dots2 = { { 3, 5 }, { 4, 1 }, { 2, 4 }, { 5, 10 } };
		System.out.println(sol.solution(dots1));
		System.out.println(sol.solution(dots2));
	}
}

class Solution23 {
	public int solution(int[][] dots) {
		if (getSlope(dots[0], dots[1]) == getSlope(dots[2], dots[3]))
			return 1;
		if (getSlope(dots[0], dots[2]) == getSlope(dots[1], dots[3]))
			return 1;
		if (getSlope(dots[0], dots[3]) == getSlope(dots[1], dots[2]))
			return 1;

		return 0;
	}

	public double getSlope(int[] dot1, int[] dot2) {
		return (double) (dot2[1] - dot1[1]) / (dot2[0] - dot1[0]);
	}
}