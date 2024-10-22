package DAY22_함수_메서드and조건문활용;

public class Solution5 {
	public static void main(String[] args) {
		Solution56 sol = new Solution56();
		System.out.println(sol.solution("banana", "ana"));
		System.out.println(sol.solution("banana", "wxyz"));
	}
}

class Solution56 {
	public int solution(String my_string, String target) {
		int answer = 0;
		if (my_string.indexOf(target) == -1) {
			answer = 0;
		} else if (my_string.indexOf(target) != -1) {
			answer = 1;
		}
		return answer;
	}
}