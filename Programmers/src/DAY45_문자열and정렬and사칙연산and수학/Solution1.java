package DAY45_문자열and정렬and사칙연산and수학;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		System.out.println(sol.solution("bus"));
		System.out.println(sol.solution("nice to meet you"));
	}
}

class Solution12 {
	public String solution(String my_string) {
		return my_string.replaceAll("[aeiou]", "");
	}
}