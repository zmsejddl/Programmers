package DAY57;

import java.util.*;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		int[] bandage1 = { 5, 1, 5 };
		int[] bandage2 = { 3, 2, 7 };
		int[] bandage3 = { 4, 2, 7 };
		int[] bandage4 = { 1, 1, 1 };
		int[][] attacks1 = { { 2, 10 }, { 9, 15 }, { 10, 5 }, { 11, 5 } };
		int[][] attacks2 = { { 1, 15 }, { 5, 16 }, { 8, 6 } };
		int[][] attacks3 = { { 1, 15 }, { 5, 16 }, { 8, 6 } };
		int[][] attacks4 = { { 1, 2 }, { 3, 2 } };
		System.out.println(sol.solution(bandage1, 30, attacks1));
		System.out.println(sol.solution(bandage2, 20, attacks2));
		System.out.println(sol.solution(bandage3, 20, attacks3));
		System.out.println(sol.solution(bandage4, 5, attacks4));
	}
}

class Solution12 {

	static Map<Integer, Integer> attackInfo = new HashMap<Integer, Integer>();
	static int endTime = 0;
	static int curHealth = 0;
	static int successiveTime = 0;

	public int solution(int[] bandage, int health, int[][] attacks) {
		curHealth = health;
		for (int[] attack : attacks) {
			attackInfo.put(attack[0], attack[1]);
			endTime = attack[0];
		}

		for (int i = 1; i <= endTime; i++) {
			if (attackInfo.containsKey(i)) {
				curHealth -= attackInfo.get(i);
				successiveTime = 0;
			} else {
				curHealth += bandage[1];
				successiveTime++;

				if (successiveTime == bandage[0]) {
					curHealth += bandage[2];
					successiveTime = 0;
				}
				if (curHealth > health) {
					curHealth = health;
				}
			}

			if (curHealth <= 0) {
				return -1;
			}
		}

		return curHealth;
	}

}
