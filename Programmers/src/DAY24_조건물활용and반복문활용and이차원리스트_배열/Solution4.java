package DAY24_조건물활용and반복문활용and이차원리스트_배열;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		System.out.println(sol.solution("abcdevwxyz"));
		System.out.println(sol.solution("jjnnllkkmm"));
	}
}

class Solution45 {
	public String solution(String myString) {
		String answer = "";
		char[] ch = myString.toCharArray();
		for (int i = 0; i < myString.length(); i++) {
			if (ch[i] < 'l') {
				ch[i] = 'l';
			}
		}
		for (int i = 0; i < ch.length; i++) {
			answer += ch[i];
		}
		return answer;
	}
}