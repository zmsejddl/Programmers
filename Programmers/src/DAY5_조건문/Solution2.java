package DAY5_조건문;

public class Solution2 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		boolean[] included = { true, false, false, true, true };
		System.out.println(sol.solution(3, 4, included));
	}
}

class Solution {
	public int solution(int a, int d, boolean[] included) {
		int answer = 0;
		int idx = 0;
		for (int i = 0; i < included.length; i++) {
			if (i == 0) {
				idx += a;
			} else if (i != 0) {
				idx += d;
			}
			if (included[i] == true) {
				answer += idx;
			}
		}
		return answer;
	}
}