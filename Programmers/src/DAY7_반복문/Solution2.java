package DAY7_반복문;

import java.util.Arrays;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		System.out.println(Arrays.toString(sol.solution(5, 555)));
	}
}

class Solution23 {
	public int[] solution(int l, int r) {
		int count = 0;
		for (int i = l; i <= r; i++) {
			boolean isValid = true;
			String str = Integer.toString(i);
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) != '0' && str.charAt(j) != '5') {
					isValid = false;
					break;
				}
			}

			if (isValid) {
				count++;
			}
		}

		if (count == 0) {
			return new int[] { -1 };
		}

		int[] answer = new int[count];
		int index = 0;

		for (int i = l; i <= r; i++) {
			boolean isValid = true;
			String str = Integer.toString(i);
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) != '0' && str.charAt(j) != '5') {
					isValid = false;
					break;
				}
			}

			if (isValid) {
				answer[index++] = i;
			}
		}

		return answer;
	}
}