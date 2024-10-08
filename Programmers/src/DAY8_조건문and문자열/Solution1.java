package DAY8_조건문and문자열;

public class Solution1 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(true, false, false, false));
	}
}

class Solution {
	public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
		boolean answer = true;
		answer = (x1 || x2) && (x3 || x4);
		return answer;
	}
}