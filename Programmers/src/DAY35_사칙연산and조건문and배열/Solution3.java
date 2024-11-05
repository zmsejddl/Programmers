package DAY35_사칙연산and조건문and배열;

import java.util.Arrays;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		System.out.println(Arrays.toString(sol.solution(1, 2, 3, 4)));
		System.out.println(Arrays.toString(sol.solution(9, 2, 1, 3)));
	}
}

class Solution34 {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int[] answer = new int[2];

		int comDenom = denom1 * denom2;
		int newNumer1 = numer1 * denom2;
		int newNumer2 = numer2 * denom1;

		int resultNumer = newNumer1 + newNumer2;

		int gcd = gcd(resultNumer, comDenom);
		resultNumer /= gcd;
		comDenom /= gcd;

		answer[0] = resultNumer;
		answer[1] = comDenom;

		return answer;
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