package DAY9_문자열;

public class Solution3 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		System.out.println(sol.solution("ProgrammerS123", 11));
	}
}

class Solution45 {
	public String solution(String my_string, int n) {
		String answer = "";
		answer = my_string.substring(my_string.length() - n);
		return answer;
	}
}