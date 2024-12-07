package DAY63;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		System.out.println(sol.solution("3141592", "271"));
		System.out.println(sol.solution("500220839878", "7"));
		System.out.println(sol.solution("10203", "15"));
	}
}

class Solution23 {
	public int solution(String t, String p) {
		int answer = 0;
		int windowSize = p.length();
		long target = Long.parseLong(p);

		for (int i = 0; i <= t.length() - windowSize; i++) {
			String sub = t.substring(i, i + windowSize);
			long num = Long.parseLong(sub);
			if (num <= target) {
				answer++;
			}
		}

		return answer;
	}
}