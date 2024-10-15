package DAY15_리스트_배열and문자열;

public class Solution5 {
	public static void main(String[] args) {
		Solution56 sol = new Solution56();
		System.out.println(sol.solution("AbCdEfG", "aBc"));
		System.out.println(sol.solution("aaAA", "aaaaa"));
	}
}

class Solution56 {
	public int solution(String myString, String pat) {
		int answer = 0;
		String LowerMyString = myString.toLowerCase();
		String LowerPat = pat.toLowerCase();
		if (LowerMyString.indexOf(LowerPat) != -1) {
			answer = 1;
		} else if (LowerMyString.indexOf(LowerPat) == -1) {
			answer = 0;
		}
		return answer;
	}
}