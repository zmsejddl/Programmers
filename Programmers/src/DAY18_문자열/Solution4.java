package DAY18_문자열;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		System.out.println(sol.solution("ABBAA", "AABB"));
		System.out.println(sol.solution("ABAB", "ABAB"));
	}
}

class Solution45 {
	public int solution(String myString, String pat) {
		int answer = 0;
		char[] ch = myString.toCharArray();
		for (int i = 0; i < myString.length(); i++) {
			if (myString.charAt(i) == 'A') {
				ch[i] = 'B';
			} else if (myString.charAt(i) == 'B') {
				ch[i] = 'A';
			}
		}
		String temp = "";
		for (int i = 0; i < ch.length; i++) {
			temp += ch[i];
		}
		if (temp.contains(pat) == true) {
			answer = 1;
		} else {
			answer = 0;
		}
		return answer;
	}
}