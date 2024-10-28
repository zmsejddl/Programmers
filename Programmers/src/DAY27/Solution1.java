package DAY27;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		int[] diffs1 = { 1, 5, 3 };
		int[] diffs2 = { 1, 4, 4, 2 };
		int[] diffs3 = { 1, 328, 467, 209, 54 };
		int[] diffs4 = { 1, 99999, 100000, 99995 };
		int[] times1 = { 2, 4, 7 };
		int[] times2 = { 6, 3, 8, 2 };
		int[] times3 = { 2, 7, 1, 4, 3 };
		int[] times4 = { 9999, 9001, 9999, 9001 };
		System.out.println(sol.solution(diffs1, times1, 30));
		System.out.println(sol.solution(diffs2, times2, 59));
		System.out.println(sol.solution(diffs3, times3, 1723));
		System.out.println(sol.solution(diffs4, times4, 3456789012L));
	}
}

class Solution12 {
	public int solution(int[] diffs, int[] times, long limit) {
		int left = 1;
		int right = 1000000;
		int answer = right;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (canCompleteWithinLimit(diffs, times, limit, mid)) {
				answer = mid;
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return answer;
	}

	private boolean canCompleteWithinLimit(int[] diffs, int[] times, long limit, int level) {
		long totalTime = 0;
		for (int i = 0; i < diffs.length; i++) {
			int diff = diffs[i];
			int timeCur = times[i];
			int timePrev = i > 0 ? times[i - 1] : 0;
			if (diff <= level) {
				totalTime += timeCur;
			} else {
				int mistakes = diff - level;
				totalTime += mistakes * (timeCur + timePrev) + timeCur;
			}
			if (totalTime > limit) {
				return false;
			}
		}
		return totalTime <= limit;
	}
}