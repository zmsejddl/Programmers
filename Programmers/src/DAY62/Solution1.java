package DAY62;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		String[] cards1 = { "i", "drink", "water" };
		String[] cards2 = { "want", "to" };
		String[] cards3 = { "i", "water", "drink" };
		String[] cards4 = { "want", "to" };
		String[] goal = { "i", "want", "to", "drink", "water" };
		System.out.println(sol.solution(cards1, cards2, goal));
		System.out.println(sol.solution(cards3, cards4, goal));
	}
}

class Solution12 {
	public String solution(String[] cards1, String[] cards2, String[] goal) {
		int index1 = 0;
		int index2 = 0;

		for (String word : goal) {
			if (index1 < cards1.length && cards1[index1].equals(word)) {
				index1++;
			} else if (index2 < cards2.length && cards2[index2].equals(word)) {
				index2++;
			} else {
				return "No";
			}
		}
		return "Yes";
	}
}