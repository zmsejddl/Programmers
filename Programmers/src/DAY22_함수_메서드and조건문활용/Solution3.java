package DAY22_함수_메서드and조건문활용;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		System.out.println(sol.solution(123));
		System.out.println(sol.solution(2573));
	}
}

class Solution34 {
	public String solution(int n) {
		String answer = Integer.toString(n);
		return answer;
	}
}