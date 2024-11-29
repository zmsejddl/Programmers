package DAY59;

import java.util.*;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		String[] name1 = { "may", "kein", "kain", "radi" };
		String[] name2 = { "kali", "mari", "don" };
		String[] name3 = { "may", "kein", "kain", "radi" };
		int[] yearning1 = { 5, 10, 1, 3 };
		int[] yearning2 = { 11, 1, 55 };
		int[] yearning3 = { 5, 10, 1, 3 };
		String[][] photo1 = { { "may", "kein", "kain", "radi" }, { "may", "kein", "brin", "deny" },
				{ "kon", "kain", "may", "coni" } };
		String[][] photo2 = { { "kali", "mari", "don" }, { "pony", "tom", "teddy" }, { "con", "mona", "don" } };
		String[][] photo3 = { { "may" }, { "kein", "deny", "may" }, { "kon", "coni" } };
		System.out.println(Arrays.toString(sol.solution(name1, yearning1, photo1)));
		System.out.println(Arrays.toString(sol.solution(name2, yearning2, photo2)));
		System.out.println(Arrays.toString(sol.solution(name3, yearning3, photo3)));
	}
}

class Solution23 {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		Map<String, Integer> yearningMap = new HashMap<String, Integer>();
		for (int i = 0; i < name.length; i++) {
			yearningMap.put(name[i], yearning[i]);
		}

		int[] result = new int[photo.length];

		for (int i = 0; i < photo.length; i++) {
			int score = 0;
			for (String person : photo[i]) {
				score += yearningMap.getOrDefault(person, 0);
			}
			result[i] = score;
		}

		return result;
	}
}