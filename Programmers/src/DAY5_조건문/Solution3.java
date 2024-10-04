package DAY5_조건문;

public class Solution3 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(4, 4, 4));
	}
}

class Solution {
	public int solution(int a, int b, int c) {
		int answer = 0;
		if (a != b && a != c && b != c) {
			answer = a + b + c;
		} else if (((a == b) && a != c) || ((a == c) && a != b) || ((c == b) && a != c)) {
			answer = (a + b + c) * (a * a + b * b + c * c);
		} else if (a == b && a == c) {
			answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
		}
		return answer;
	}
}