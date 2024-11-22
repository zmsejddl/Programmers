package DAY52_dpand수학and조건문and배열;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		System.out.println(sol.solution(7, 20));
		System.out.println(sol.solution(11, 22));
		System.out.println(sol.solution(12, 21));
	}
}

class Solution45 {
	public int solution(int a, int b) {
		int gcd = gcd(a, b);

		b /= gcd;

		while (b % 2 == 0) {
			b /= 2;
		}
		while (b % 5 == 0) {
			b /= 5;
		}

		return (b == 1) ? 1 : 2;
	}

	public int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}