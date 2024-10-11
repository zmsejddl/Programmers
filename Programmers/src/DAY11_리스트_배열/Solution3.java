package DAY11_리스트_배열;

import java.util.Arrays;

public class Solution3 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		int[] indices = { 1, 16, 6, 15, 0, 10, 11, 3 };
		String str = "apporoograpemmemprs";
		System.out.println(sol.solution(str, indices));
	}
}

class Solution23 {
	public String solution(String my_string, int[] indices) {
		StringBuilder answer = new StringBuilder();

		Arrays.sort(indices);

		int indexPointer = 0;

		for (int i = 0; i < my_string.length(); i++) {
			if (indexPointer < indices.length && i == indices[indexPointer]) {
				indexPointer++;
			} else {
				answer.append(my_string.charAt(i));
			}
		}
		return answer.toString();
	}
}