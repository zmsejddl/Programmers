package DAY3_연산;

public class Solution1 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution("aaaa", "bbbb"));
	}
}

class Solution {
	public String solution(String str1, String str2) {
		String answer = "";
		char[] a = new char[str1.length()];
		char[] b = new char[str2.length()];
		for (int i = 0; i < str1.length(); i++) {
			a[i] = str1.charAt(i);
			b[i] = str2.charAt(i);
		}
		for (int i = 0; i < str1.length(); i++) {
			answer += a[i];
			answer += b[i];
		}
		return answer;
	}
}