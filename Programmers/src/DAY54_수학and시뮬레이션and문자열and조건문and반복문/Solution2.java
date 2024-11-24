package DAY54_수학and시뮬레이션and문자열and조건문and반복문;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		System.out.println(sol.solution("10", "11"));
		System.out.println(sol.solution("1001", "1111"));
	}
}

class Solution23 {
	public String solution(String bin1, String bin2) {
		int num1 = Integer.parseInt(bin1, 2);
		int num2 = Integer.parseInt(bin2, 2);

		return Integer.toBinaryString(num1 + num2);
	}
}