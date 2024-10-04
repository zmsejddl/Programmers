package DAY4_연산and조건문;

public class Solution4 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(">", "!", 41, 78));
	}
}

class Solution {
	public int solution(String ineq, String eq, int n, int m) {
		int answer = 0;
		boolean a;
		if (ineq.equals("<") && eq.equals("=")) {
			a = (n <= m);
			if (a == true) {
				answer = 1;
			} else {
				answer = 0;
			}
		} else if (ineq.equals(">") && eq.equals("=")) {
			a = (n >= m);
			if (a == true) {
				answer = 1;
			} else {
				answer = 0;
			}
		}
		if (ineq.equals("<") && eq.equals("!")) {
			a = (n < m);
			if (a == true) {
				answer = 1;
			} else {
				answer = 0;
			}
		} else if (ineq.equals(">") && eq.equals("!")) {
			a = (n > m);
			if (a == true) {
				answer = 1;
			} else {
				answer = 0;
			}
		}
		return answer;
	}
}