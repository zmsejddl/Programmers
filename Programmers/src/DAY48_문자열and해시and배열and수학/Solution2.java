package DAY48_문자열and해시and배열and수학;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		System.out.println(sol.solution("hello", 1, 2));
		System.out.println(sol.solution("I love you", 3, 6));
	}
}

class Solution23 {
	public String solution(String my_string, int num1, int num2) {
		StringBuilder sb = new StringBuilder(my_string);

		char temp = sb.charAt(num1);
		sb.setCharAt(num1, sb.charAt(num2));
		sb.setCharAt(num2, temp);

		return sb.toString();
	}
}