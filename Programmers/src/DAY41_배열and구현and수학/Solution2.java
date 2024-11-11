package DAY41_배열and구현and수학;

import javax.swing.event.AncestorEvent;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		System.out.println(sol.solution(23));
		System.out.println(sol.solution(51));
		System.out.println(sol.solution(100));
	}
}

class Solution23 {
	public String solution(int age) {
		String answer = "";

		String str = Integer.toString(age);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '0') {
				answer += 'a';
			} else if (str.charAt(i) == '1') {
				answer += 'b';
			} else if (str.charAt(i) == '2') {
				answer += 'c';
			} else if (str.charAt(i) == '3') {
				answer += 'd';
			} else if (str.charAt(i) == '4') {
				answer += 'e';
			} else if (str.charAt(i) == '5') {
				answer += 'f';
			} else if (str.charAt(i) == '6') {
				answer += 'g';
			} else if (str.charAt(i) == '7') {
				answer += 'h';
			} else if (str.charAt(i) == '8') {
				answer += 'i';
			} else if (str.charAt(i) == '9') {
				answer += 'j';
			}
		}

		return answer;
	}
}