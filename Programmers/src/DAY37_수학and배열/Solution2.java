package DAY37_수학and배열;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		System.out.println(sol.solution(6));
		System.out.println(sol.solution(10));
		System.out.println(sol.solution(4));
	}
}

class Solution23 {
	public int solution(int n) {
		return ((6 * n) / gcd(6, n)) / 6;
	}

	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}