package DAY9_문자열;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution1 {
	public static void main(String[] args) {
		String[] intStrs = { "0123456789", "9876543210", "9999999999999" };
		Solution sol = new Solution();
		System.out.println(Arrays.toString(sol.solution(intStrs, 50000, 5, 5)));
	}
}

class Solution {
	public int[] solution(String[] intStrs, int k, int s, int l) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < intStrs.length; i++) {
			String str = intStrs[i].substring(s, s + l);
			if (Integer.parseInt(str) > k) {
				list.add(Integer.parseInt(str));
			}
		}
		int[] answer = new int[list.size()];
		for(int i=0;i<answer.length;i++) {
			answer[i]=list.get(i);
		}
		return answer;
	}
}