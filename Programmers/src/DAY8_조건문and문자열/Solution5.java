package DAY8_조건문and문자열;

public class Solution5 {
	public static void main(String[] args) {
		Solution67 sol = new Solution67();
		int[][] queries = { { 2, 3 }, { 0, 7 }, { 5, 9 }, { 6, 10 } };
		System.out.println(sol.solution("rermgorpsam", queries));
	}
}

class Solution67 {
	public String solution(String my_string, int[][] queries) {
		char[] chars = my_string.toCharArray();

		for (int[] query : queries) {
			int s = query[0];
			int e = query[1];

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