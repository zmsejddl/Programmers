package DAY63;

import java.util.*;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		String[] terms1 = { "A 6", "B 12", "C 3" };
		String[] terms2 = { "Z 3", "D 5" };
		String[] privacies1 = { "2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C" };
		String[] privacies2 = { "2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z" };
		System.out.println(Arrays.toString(sol.solution("2022.05.19", terms1, privacies1)));
		System.out.println(Arrays.toString(sol.solution("2020.01.01", terms2, privacies2)));
	}
}

class Solution12 {
	public int[] solution(String today, String[] terms, String[] privacies) {
		int todayDays = convertToDays(today);

		Map<String, Integer> termMap = new HashMap<String, Integer>();
		for (String term : terms) {
			String[] parts = term.split(" ");
			termMap.put(parts[0], Integer.parseInt(parts[1]));
		}

		List<Integer> expired = new ArrayList<Integer>();

		for (int i = 0; i < privacies.length; i++) {
			String[] parts = privacies[i].split(" ");
			int collectedDate = convertToDays(parts[0]);
			String termType = parts[1];

			int expiryDate = collectedDate + termMap.get(termType) * 28 - 1;

			if (expiryDate < todayDays) {
				expired.add(i + 1);
			}
		}

		return expired.stream().mapToInt(Integer::intValue).toArray();
	}

	private int convertToDays(String date) {
		String[] parts = date.split("\\.");
		int year = Integer.parseInt(parts[0]);
		int month = Integer.parseInt(parts[1]);
		int day = Integer.parseInt(parts[2]);
		return year * 12 * 28 + month * 28 + day;
	}
}