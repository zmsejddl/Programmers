package DAY23_조건문활용;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		System.out.println(sol.solution("abc", "aabcc"));
		System.out.println(sol.solution("tbt", "tbbttb"));
	}
}

class Solution12 {
	public int solution(String str1, String str2) {
		int answer = 0;
		if (str2.indexOf(str1) != -1) {
			answer = 1;
		}
		return answer;
	}
}