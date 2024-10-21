package DAY21_함수_메서드;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		System.out.println(sol.solution("123456789"));
		System.out.println(sol.solution("1000000"));
	}
}

class Solution45 {
	public int solution(String num_str) {
		int answer = 0;
		for (int i = 0; i < num_str.length(); i++) {
			answer += Character.getNumericValue(num_str.charAt(i));
		}
		return answer;
	}
}