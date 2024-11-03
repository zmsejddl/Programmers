package DAY33;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		String[] s11 = { "a", "b", "c" };
		String[] s12 = { "n", "omg" };
		String[] s21 = { "com", "b", "d", "p", "c" };
		String[] s22 = { "m", "dot" };
		System.out.println(sol.solution(s11, s21));
		System.out.println(sol.solution(s12, s22));
	}
}

class Solution23 {
	public int solution(String[] s1, String[] s2) {
		int answer = 0;
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) {
					answer++;
				}
			}
		}
		return answer;
	}
}