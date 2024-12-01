package DAY61;

import java.util.*;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		String[] keymap1 = { "ABACD", "BCEFD" };
		String[] keymap2 = { "AA" };
		String[] keymap3 = { "AGZ", "BSSS" };
		String[] targets1 = { "ABCD", "AABB" };
		String[] targets2 = { "B" };
		String[] targets3 = { "ASA", "BGZ" };
		System.out.println(Arrays.toString(sol.solution(keymap1, targets1)));
		System.out.println(Arrays.toString(sol.solution(keymap2, targets2)));
		System.out.println(Arrays.toString(sol.solution(keymap3, targets3)));
	}
}

class Solution23 {
	public int[] solution(String[] keymap, String[] targets) {
		Map<Character, Integer> charToMinPress = new HashMap<Character, Integer>();

		for (String key : keymap) {
			for (int i = 0; i < key.length(); i++) {
				char c = key.charAt(i);
				charToMinPress.put(c, Math.min(charToMinPress.getOrDefault(c, Integer.MAX_VALUE), i + 1));
			}
		}

		int[] result = new int[targets.length];

		for (int i = 0; i < targets.length; i++) {
			int totalPresses = 0;
			boolean isPossible = true;

			for (char c : targets[i].toCharArray()) {
				if (!charToMinPress.containsKey(c)) {
					isPossible = false;
					break;
				}
				totalPresses += charToMinPress.get(c);
			}

			result[i] = isPossible ? totalPresses : -1;
		}

		return result;
	}
}