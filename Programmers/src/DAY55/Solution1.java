package DAY55;

import java.util.Arrays;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		int[] wallet1 = { 30, 15 };
		int[] wallet2 = { 50, 50 };
		int[] bill1 = { 26, 17 };
		int[] bill2 = { 100, 241 };
		System.out.println(sol.solution(wallet1, bill1));
		System.out.println(sol.solution(wallet2, bill2));
	}
}

class Solution12 {
	public static int solution(int[] wallet, int[] bill) {
		int answer = 0;

		Arrays.sort(wallet);
		Arrays.sort(bill);

		while (!checkSize(wallet, bill)) {
			fold(wallet, bill);
			answer++;
		}
		return answer;
	}

	private static void fold(int[] wallet, int[] bill) {
		if (bill[0] > bill[1]) {
			bill[0] /= 2;
		} else {
			bill[1] /= 2;
		}
	}

	private static boolean checkSize(int[] wallet, int[] bill) {
		Arrays.sort(wallet);
		Arrays.sort(bill);

		return bill[0] <= wallet[0] && bill[1] <= wallet[1];
	}
}