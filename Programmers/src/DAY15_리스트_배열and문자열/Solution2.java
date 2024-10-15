package DAY15_리스트_배열and문자열;

import java.util.Arrays;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		int[] arr = { 1, 2, 3, 100, 99, 98 };
		System.out.println(sol.solution(arr));
	}
}

class Solution23 {
	public int solution(int[] arr) {
		int answer = 0;
		int[] previousArr;
		int[] currentArr = Arrays.copyOf(arr, arr.length);
		while (true) {
			previousArr = Arrays.copyOf(currentArr, currentArr.length);
			answer++;

			for (int i = 0; i < currentArr.length; i++) {
				if (currentArr[i] >= 50 && currentArr[i] % 2 == 0) {
					currentArr[i] /= 2;
				} else if (currentArr[i] < 50 && currentArr[i] % 2 == 1) {
					currentArr[i] = currentArr[i] * 2 + 1;
				}
			}
			if (Arrays.equals(previousArr, currentArr)) {
				break;
			}
		}
		return answer - 1;
	}
}