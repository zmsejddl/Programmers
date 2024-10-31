package DAY30;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		int[] common1 = { 1, 2, 3, 4 };
		int[] common2 = { 2, 4, 8 };
		System.out.println(sol.solution(common1));
		System.out.println(sol.solution(common2));
	}
}

class Solution34 {
	public int solution(int[] common) {
		int answer = 0;
		if (common[1] - common[0] == common[2] - common[1]) {
			answer = common[common.length - 1] + common[1] - common[0];
		} else if (common[1] - common[0] != common[2] - common[1]) {
			answer = common[common.length - 1] * (common[1] / common[0]);
		}
		return answer;
	}
}