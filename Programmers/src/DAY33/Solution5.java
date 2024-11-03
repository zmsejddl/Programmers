package DAY33;

public class Solution5 {
	public static void main(String[] args) {
		Solution56 sol = new Solution56();
		System.out.println(sol.solution("happy birthday!"));
		System.out.println(sol.solution("I love you~"));
	}
}

class Solution56 {
	public int solution(String message) {
		int answer = message.length() * 2;
		return answer;
	}
}