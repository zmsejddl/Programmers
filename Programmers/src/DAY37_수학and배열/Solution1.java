package DAY37_수학and배열;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		System.out.println(sol.solution(7));
		System.out.println(sol.solution(1));
		System.out.println(sol.solution(15));
	}
}

class Solution12 {
	public int solution(int n) {
		int answer = 0;
		if (n / 7 < 1) {
			answer = 1;
		}
		if (n / 7 >= 1 && n % 7 != 0) {
			answer = n / 7 + 1;
		} else if (n / 7 >= 1 && n % 7 == 0) {
			answer = n / 7;
		}
		return answer;
	}
}