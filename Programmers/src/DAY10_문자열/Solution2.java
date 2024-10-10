package DAY10_문자열;

public class Solution2 {
	public static void main(String[] args) {
		Solution123 sol = new Solution123();
		System.out.println(sol.solution("banana", "ban"));
		System.out.println(sol.solution("banana", "nan"));
	}
}

class Solution123 {
	public int solution(String my_string, String is_prefix) {
		int answer = 0;
		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.substring(0, i).equals(is_prefix)) {
				answer = 1;
			}
		}
		return answer;
	}
}