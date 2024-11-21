package DAY51_문자열and사칙연산and시뮬레이션and2차원배열and수학and배열;

import java.util.Arrays;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		String[] spell1 = { "p", "o", "s" };
		String[] spell2 = { "z", "d", "x" };
		String[] spell3 = { "s", "o", "m", "d" };
		String[] dic1 = { "sod", "eocd", "qixm", "adio", "soo" };
		String[] dic2 = { "def", "dww", "dzx", "loveaw" };
		String[] dic3 = { "moos", "dzx", "smm", "sunmmo", "som" };
		System.out.println(sol.solution(spell1, dic1));
		System.out.println(sol.solution(spell2, dic2));
		System.out.println(sol.solution(spell3, dic3));
	}
}

class Solution45 {
	public int solution(String[] spell, String[] dic) {
		String sortedSpell = String.join("", spell);
		char[] spellArray = sortedSpell.toCharArray();
		Arrays.sort(spellArray);
		sortedSpell = new String(spellArray);

		for (String word : dic) {
			char[] wordArray = word.toCharArray();
			Arrays.sort(wordArray);
			String sortedWord = new String(wordArray);

			if (sortedSpell.equals(sortedWord)) {
				return 1;
			}
		}

		return 2;
	}
}