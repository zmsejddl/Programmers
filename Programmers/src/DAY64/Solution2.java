package DAY64;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		System.out.println(sol.solution("banana"));
		System.out.println(sol.solution("abracadabra"));
		System.out.println(sol.solution("aaabbaccccabba"));
	}
}

class Solution23 {
	public int solution(String s) {
		int answer = 0;
		char x = s.charAt(0);
		int countX = 0, countOther = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == x) {
				countX++;
			} else {
				countOther++;
			}

			if (countX == countOther) {
				answer++;
				if (i + 1 < s.length()) {
					x = s.charAt(i + 1);
				}
				countX = 0;
				countOther = 0;
			}
		}

		if (countX != 0 || countOther != 0) {
			answer++;
		}

		return answer;
	}
}