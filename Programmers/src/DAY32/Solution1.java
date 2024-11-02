package DAY32;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		System.out.println(sol.solution(144));
		System.out.println(sol.solution(976));
	}
}

class Solution12 {
	public int solution(int n) {
		int answer = 0;
		int sqrt = (int) Math.sqrt(n);
		if (sqrt * sqrt == n) {
			answer = 1;
		} else {
			answer = 2;
		}
		return answer;
	}
}