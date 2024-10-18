package DAY18_문자열;

public class Solution5 {
	public static void main(String[] args) {
		Solution56 sol = new Solution56();
		System.out.println(sol.solution("masterpiece"));
		System.out.println(sol.solution("programmers"));
		System.out.println(sol.solution("jerry"));
		System.out.println(sol.solution("burn"));
	}
}

class Solution56 {
	public String solution(String rny_string) {
		String answer = "";
		String[] strArray = rny_string.split("");
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].equals("m")) {
				strArray[i] = "rn";
			}
			answer += strArray[i];
		}
		return answer;
	}
}