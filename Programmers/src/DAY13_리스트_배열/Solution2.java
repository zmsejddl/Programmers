package DAY13_리스트_배열;

import java.util.Arrays;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		int[] num_list1 = { 2, 1, 6 };
		int[] num_list2 = { 5, 2, 1, 7, 5 };
		System.out.println(Arrays.toString(sol.solution(num_list1, 1)));
		System.out.println(Arrays.toString(sol.solution(num_list2, 3)));
	}
}

class Solution23 {
	public int[] solution(int[] num_list, int n) {
		int[] a = new int[num_list.length - n];
		int[] b = new int[n];
		int[] answer = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			a[i] = num_list[n + i];
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = num_list[i];
		}
		System.arraycopy(a, 0, answer, 0, a.length);
		System.arraycopy(b, 0, answer, a.length, b.length);
		return answer;
	}
}