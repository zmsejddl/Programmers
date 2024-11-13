package DAY43_조건문and배열and수학and시뮬레이션;

public class Soltuion1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		int[] dot1 = { 2, 4 };
		int[] dot2 = { -7, 9 };
		System.out.println(sol.solution(dot1));
		System.out.println(sol.solution(dot2));
	}
}

class Solution12 {
	public int solution(int[] dot) {
		int answer = 0;
		if (dot[0] > 0 && dot[1] > 0) {
			answer = 1;
		} else if (dot[0] < 0 && dot[1] > 0) {
			answer = 2;
		} else if (dot[0] < 0 && dot[1] < 0) {
			answer = 3;
		} else if (dot[0] > 0 && dot[1] < 0) {
			answer = 4;
		}
		return answer;
	}
}