package DAY37_수학and배열;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		System.out.println(sol.solution(7, 10));
		System.out.println(sol.solution(4, 12));
	}
}

class Solution34 {
	public int solution(int slice, int n) {
		return (n + slice - 1) / slice;
	}
}