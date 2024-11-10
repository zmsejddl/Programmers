package DAY40_문자열and조건문and수학and반복문;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		System.out.println(sol.solution("abcdef", "f"));
		System.out.println(sol.solution("BCBdbe", "B"));
	}
}

class Solution12 {
	public String solution(String my_string, String letter) {
		String answer = my_string.replaceAll(letter, "");
		return answer;
	}
}