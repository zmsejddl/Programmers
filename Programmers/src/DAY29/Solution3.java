package DAY29;

import java.util.Arrays;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		System.out.println(Arrays.toString(sol.solution("NSSNEWWN")));
		System.out.println(Arrays.toString(sol.solution("EESEEWNWSNWWNS")));
	}
}

class Solution34 {
	public int[] solution(String route) {
		int east = 0;
		int north = 0;
		int[] answer = new int[2];
		for (int i = 0; i < route.length(); i++) {
			switch (route.charAt(i)) {
			case 'N':
				north++;
				break;
			case 'S':

				north--;
				break;
			case 'E':

				east++;
				break;
			case 'W':

				east--;

				break;
			}
		}
		answer[0] = east;
		answer[1] = north;
		return answer;
	}
}