package DAY9_문자열;

public class Solution5 {
	public static void main(String[] args) {
		Solution457 sol = new Solution457();
		System.out.println(sol.solution("banana", "ana"));
	}
}

class Solution457 {
	public int solution(String my_string, String is_suffix) {
		int answer = 0;
		if (my_string.length() < is_suffix.length()) {
			answer = 0;
		} else if (my_string.substring(my_string.length() - is_suffix.length()).equals(is_suffix)) {
			answer = 1;
		} else {
			answer = 0;
		}
		return answer;
	}
}