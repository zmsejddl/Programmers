package DAY67;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		String[] babbling1 = { "aya", "yee", "u", "maa" };
		String[] babbling2 = { "ayaye", "uuu", "yeye", "yemawoo", "ayaayaa" };
		System.out.println(sol.solution(babbling1));
		System.out.println(sol.solution(babbling2));
	}
}

class Solution23 {
	public int solution(String[] babbling) {
		int answer = 0;

		for (String word : babbling) {
			if (word.matches("^(aya|ye|woo|ma)+$") && !word.matches(".*(ayaaya|yeye|woowoo|mama).*")) {
				answer++;
			}
		}

		return answer;
	}
}