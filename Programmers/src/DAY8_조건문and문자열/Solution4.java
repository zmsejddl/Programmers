package DAY8_조건문and문자열;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		System.out.println(sol.solution("78720646226947352489"));
	}
}

class Solution45 {
	public int solution(String number) {
		int answer = 0;
		for (int i = 0; i < number.length(); i++) {
			answer += number.charAt(i) - '0';
		}
		return answer % 9;
	}
}