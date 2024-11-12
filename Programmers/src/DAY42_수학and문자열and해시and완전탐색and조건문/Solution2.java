package DAY42_수학and문자열and해시and완전탐색and조건문;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		System.out.println(sol.solution(".... . .-.. .-.. ---"));
		System.out.println(sol.solution(".--. -.-- - .... --- -."));
	}
}

class Solution23 {
	public String solution(String letter) {
		String answer = "";
		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		String[] alpa = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
				"t", "u", "v", "w", "x", "y", "z" };
		String[] str = letter.split(" ");
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < morse.length; j++) {
				if (str[i].equals(morse[j])) {
					answer += alpa[j];
				}
			}
		}
		return answer;
	}
}