package DAY30;

public class Solution5 {
	public static void main(String[] args) {
		Solution56 sol = new Solution56();
		System.out.println(sol.solution(2, 2));
		System.out.println(sol.solution(2, 5));
		System.out.println(sol.solution(1, 1));
	}
}

class Solution56 {
	public int solution(int M, int N) {
		int answer = M * N - 1;
		return answer;
	}
}