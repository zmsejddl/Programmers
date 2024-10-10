package DAY10_문자열;

public class Solution3 {
	public static void main(String[] args) {
		Solution234 sol = new Solution234();
		System.out.println(sol.solution("Progra21Sremm3", 6, 12));
	}
}

class Solution234 {
	public String solution(String my_string, int s, int e) {
		String answer = "";
		char[] chars = my_string.toCharArray();

		for (int i = s; i < e; i++) {
			while (s < e) {
				char temp = chars[s];
				chars[s] = chars[e];
				chars[e] = temp;
				s++;
				e--;
			}
		}
		return new String(chars);
	}
}