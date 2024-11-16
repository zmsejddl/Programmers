package DAY46_문자열and배열and사칙연산and수학and조건문;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		System.out.println(sol.solution("1 2 Z 3"));
		System.out.println(sol.solution("10 20 30 40"));
		System.out.println(sol.solution("10 Z 20 Z 1"));
		System.out.println(sol.solution("10 Z 20 Z"));
		System.out.println(sol.solution("-1 -2 -3 Z"));
	}
}

class Solution12 {
	public int solution(String s) {
		int answer = 0;
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			if (!str[i].equals("Z")) {
				answer += Integer.parseInt(str[i]);
			} else if (str[i].equals("Z")) {
				answer -= Integer.parseInt(str[i - 1]);
			}
		}
		return answer;
	}
}