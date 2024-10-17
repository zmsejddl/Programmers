package DAY17_문자열;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		System.out.println(sol.solution("banana", "ana"));
		System.out.println(sol.solution("aaaa", "aa"));
	}
}

class Solution23 {
	public int solution(String myString, String pat) {
		int answer = 0;
		for (int i = 0; i < myString.length() - pat.length() + 1; i++) {
			if (myString.substring(i, i + pat.length()).equals(pat)) {
				answer++;
			}
		}
		return answer;
	}
}