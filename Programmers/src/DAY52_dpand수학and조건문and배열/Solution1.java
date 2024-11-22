package DAY52_dpand수학and조건문and배열;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		System.out.println(sol.solution(15));
		System.out.println(sol.solution(40));
	}
}

class Solution12 {
	public int solution(int n) {
		int answer = 0;
		int count = 0;

		while (n > 0) {
			count++;
			if (count % 3 == 0 || String.valueOf(count).contains("3")) {
				continue;
			}
			n--;
			answer = count;
		}
		return answer;
	}
}