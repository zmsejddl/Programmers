package DAY56;

import java.util.*;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		String[] friends1 = { "muzi", "ryan", "frodo", "neo" };
		String[] friends2 = { "joy", "brad", "alessandro", "conan", "david" };
		String[] friends3 = { "a", "b", "c" };
		String[] gifts1 = { "muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi",
				"frodo ryan", "neo muzi" };
		String[] gifts2 = { "alessandro brad", "alessandro joy", "alessandro conan", "david alessandro",
				"alessandro david" };
		String[] gifts3 = { "a b", "b a", "c a", "a c", "a c", "c a" };
		System.out.println(sol.solution(friends1, gifts1));
		System.out.println(sol.solution(friends2, gifts2));
		System.out.println(sol.solution(friends3, gifts3));
	}
}

class Solution12 {
	public int solution(String[] friends, String[] gifts) {
		int answer = 0;
		int friendsLengh = friends.length;
		HashMap<String, Integer> dic = new HashMap<>();
		int[] giftDegree = new int[friendsLengh];
		int[][] giftGraph = new int[friendsLengh][friendsLengh];

		for (int i = 0; i < friendsLengh; i++) {
			dic.put(friends[i], i);
		}

		for (String gift : gifts) {
			String[] giftName = gift.split(" ");
			giftDegree[dic.get(giftName[0])]++;
			giftDegree[dic.get(giftName[1])]--;
			giftGraph[dic.get(giftName[0])][dic.get(giftName[1])]++;
		}

		for (int i = 0; i < friendsLengh; i++) {
			int num = 0;
			for (int j = 0; j < friendsLengh; j++) {
				if (i == j) {
					continue;
				}

				if (giftGraph[i][j] > giftGraph[j][i]
						|| (giftGraph[i][j] == giftGraph[j][i] && giftDegree[i] > giftDegree[j])) {
					num++;
				}
			}

			if (answer < num) {
				answer = num;
			}

		}

		return answer;
	}
}