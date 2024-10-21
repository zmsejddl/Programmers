package DAY21_함수_메서드;

public class Solution5 {
	public static void main(String[] args) {
		Solution56 sol = new Solution56();
		System.out.println(sol.solution("10"));
		System.out.println(sol.solution("8542"));
	}
}

class Solution56 {
	public int solution(String n_str) {
		int answer = Integer.parseInt(n_str);
		return answer;
	}
}