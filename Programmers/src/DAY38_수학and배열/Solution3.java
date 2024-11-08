package DAY38_수학and배열;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		System.out.println(sol.solution(40));
		System.out.println(sol.solution(23));
	}
}

class Solution34 {
	public int solution(int age) {
		int answer = 2023 - age;
		return answer;
	}
}