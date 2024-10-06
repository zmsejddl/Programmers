package DAY6_조건문and반복문;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		System.out.println(sol.solution(0, "wsdawsdassw"));
	}
}

class Solution23 {
	public int solution(int n, String control) {
		int answer = n;
		char a;
		for (int i = 0; i < control.length(); i++) {
			a = control.charAt(i);
			if (a == 'w') {
				answer += 1;
			} else if (a == 's') {
				answer -= 1;
			} else if (a == 'd') {
				answer += 10;
			} else if (a == 'a') {
				answer -= 10;
			}
		}
		return answer;
	}
}