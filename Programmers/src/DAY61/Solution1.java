package DAY61;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		int[] section1 = { 2, 3, 6 };
		int[] section2 = { 1, 3 };
		int[] section3 = { 1, 2, 3, 4 };
		System.out.println(sol.solution(8, 4, section1));
		System.out.println(sol.solution(5, 4, section2));
		System.out.println(sol.solution(4, 1, section3));
	}
}

class Solution12 {
	public int solution(int n, int m, int[] section) {
		int answer = 0;
		int lastPainted = 0;

		for (int s : section) {
			if (s > lastPainted) {
				answer++;
				lastPainted = s + m - 1;
			}
		}

		return answer;
	}
}