package DAY22_함수_메서드and조건문활용;

import java.math.BigInteger;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		System.out.println(sol.solution("582", "734"));
		System.out.println(sol.solution("18446744073709551615", "287346502836570928366"));
		System.out.println(sol.solution("0", "0"));
	}
}

class Solution23 {
	public String solution(String a, String b) {
		BigInteger A = new BigInteger(a);
		BigInteger B = new BigInteger(b);
		BigInteger sum = A.add(B);
		String answer = "" + sum;
		return answer;
	}
}