package DAY31;

public class Solution5 {
public static void main(String[] args) {
	Solution56 sol=new Solution56();
	System.out.println(sol.solution(2, 10));
	System.out.println(sol.solution(7, 15));
}
}

class Solution56 {
	public int solution(int n, int t) {
		int answer = n;
		for (int i = 0; i < t; i++) {
			answer *= 2;
		}
		return answer;
	}
}