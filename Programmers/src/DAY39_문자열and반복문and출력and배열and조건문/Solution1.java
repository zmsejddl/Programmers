package DAY39_문자열and반복문and출력and배열and조건문;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		System.out.println(sol.solution("jaron"));
		System.out.println(sol.solution("bread"));
	}
}

class Solution12 {
	public String solution(String my_string) {
		String answer = new StringBuilder(my_string).reverse().toString();
		return answer;
	}
}