package DAY32;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution5 {
	public static void main(String[] args) {
		Solution56 sol = new Solution56();
		int[] numlist1 = { 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int[] numlist2 = { 1, 9, 3, 10, 13, 5 };
		int[] numlist3 = { 2, 100, 120, 600, 12, 12 };
		System.out.println(Arrays.toString(sol.solution(3, numlist1)));
		System.out.println(Arrays.toString(sol.solution(5, numlist2)));
		System.out.println(Arrays.toString(sol.solution(12, numlist3)));
	}
}

class Solution56 {
	public int[] solution(int n, int[] numlist) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < numlist.length; i++) {
			if (numlist[i] % n == 0) {
				list.add(numlist[i]);
			}
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}