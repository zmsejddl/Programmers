package DAY36_사칙연산and배열and수학;

public class Soltuion1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		System.out.println(sol.solution(3, 2));
		System.out.println(sol.solution(10, 5));
	}
}

class Solution12 {
	public int solution(int num1, int num2) {
		int answer = num1 % num2;
		return answer;
	}
}