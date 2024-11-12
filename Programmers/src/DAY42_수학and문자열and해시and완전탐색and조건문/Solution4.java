package DAY42_수학and문자열and해시and완전탐색and조건문;

import java.math.BigInteger;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		System.out.println(sol.solution(3, 2));
		System.out.println(sol.solution(5, 3));
	}
}

class Solution45 {
	public long solution(int balls, int share) {
		return combination(balls, share).longValue();
	}

	public BigInteger combination(int n, int k) {
		if (k == 0 || n == k) {
			return BigInteger.ONE;
		}

		BigInteger numerator = BigInteger.ONE;
		BigInteger denominator = BigInteger.ONE;

		for (int i = 0; i < k; i++) {
			numerator = numerator.multiply(BigInteger.valueOf(n - i));
			denominator = denominator.multiply(BigInteger.valueOf(i + 1));
		}

		return numerator.divide(denominator);
	}
}
