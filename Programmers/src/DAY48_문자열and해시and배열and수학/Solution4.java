package DAY48_문자열and해시and배열and수학;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		System.out.println(Arrays.toString(sol.solution(24)));
		System.out.println(Arrays.toString(sol.solution(29)));
	}
}

class Solution45 {
	public int[] solution(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				list.add(i);
			}
		}

		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}