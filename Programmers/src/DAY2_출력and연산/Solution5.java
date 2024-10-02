package DAY2_출력and연산;

public class Solution5 {
}

class Solution {
	public String solution(String my_string, String overwrite_string, int s) {
		String a = my_string.substring(0, s);
		String b = my_string.substring(s, s + overwrite_string.length());
		String c = my_string.substring(s + overwrite_string.length(), my_string.length());
		String answer = "";
		answer = a + overwrite_string + c;
		return answer;
	}
}