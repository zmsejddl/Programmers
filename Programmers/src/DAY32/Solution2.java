package DAY32;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		System.out.println(sol.solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
		System.out.println(sol.solution("ppprrrogrammers", "pppp"));
		System.out.println(sol.solution("AbcAbcA", "AAA"));
	}
}

class Solution23 {
	public int solution(String str1, String str2) {
		int answer = 2;
		if (str1.contains(str2)) {
			answer = 1;
		}
		return answer;
	}
}