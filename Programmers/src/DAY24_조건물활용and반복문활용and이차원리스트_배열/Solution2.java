package DAY24_조건물활용and반복문활용and이차원리스트_배열;

import java.util.Arrays;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		String[] picture1 = { ".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...",
				"....x...." };
		String[] picture2 = { "x.x", ".x.", "x.x" };
		System.out.println(Arrays.toString(sol.solution(picture1, 2)));
		System.out.println(Arrays.toString(sol.solution(picture2, 3)));
	}
}

class Solution23 {
	public String[] solution(String[] picture, int k) {
		String[] answer = new String[picture.length * k];
		int index = 0;
		for (int i = 0; i < picture.length; i++) {
			String str = picture[i];
			StringBuilder result = new StringBuilder();
			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				for (int t = 0; t < k; t++) {
					result.append(c);
				}
			}
			for (int j = 0; j < k; j++) {
				answer[index++] = result.toString();
			}
		}
		return answer;
	}
}