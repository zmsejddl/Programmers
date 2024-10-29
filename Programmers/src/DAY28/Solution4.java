package DAY28;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		System.out.println(sol.solution("WORLDworld"));
		System.out.println(sol.solution("GO"));
	}
}

class Solution45 {
	public String solution(String nickname) {
		String answer = "";
		for (int i = 0; i < nickname.length(); i++) {
			if (nickname.charAt(i) == 'l') {
				answer += "I";
			} else if (nickname.charAt(i) == 'w') {
				answer += "vv";
			} else if (nickname.charAt(i) == 'W') {
				answer += "VV";
			} else if (nickname.charAt(i) == 'O') {
				answer += "0";
			} else {
				answer += nickname.charAt(i);
			}
		}
		if (answer.length() < 3) {
			while (answer.length() < 4) {
				answer += "o";
			}
		}
		if (answer.length() > 8) {
			answer = answer.substring(0, 8);
		}
		return answer;
	}
}