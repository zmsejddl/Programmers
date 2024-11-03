package DAY33;

import java.util.Arrays;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		int[] array1 = { 1, 8, 3 };
		int[] array2 = { 9, 10, 11, 8 };
		System.out.println(Arrays.toString(sol.solution(array1)));
		System.out.println(Arrays.toString(sol.solution(array2)));
	}
}

class Solution45 {
	public int[] solution(int[] array) {
		int[] answer = new int[2];
		for (int i = 0; i < array.length; i++) {
			if (answer[0] < array[i]) {
				answer[0] = array[i];
				answer[1] = i;
			}
		}
		return answer;
	}
}