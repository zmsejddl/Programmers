package DAY21_함수_메서드;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		System.out.println(sol.solution(1.42));
		System.out.println(sol.solution(69.32));
	}
}

class Solution34 {
	public int solution(double flo) {
		int answer = (int) flo;
		return answer;
	}
}