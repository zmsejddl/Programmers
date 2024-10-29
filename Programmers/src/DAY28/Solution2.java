package DAY28;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		int[] change1 = { 10, -10, 10, -10, 10, -10, 10, -10, 10, -10 };
		int[] change2 = { -10, 25, -33 };
		System.out.println(sol.solution(5141, 500, change1));
		System.out.println(sol.solution(1000, 2000, change2));
	}
}

class Solution23 {
	public int solution(int storage, int usage, int[] change) {
		int total_usage = 0;
		for (int i = 0; i < change.length; i++) {
			usage += usage * change[i] / 100;
			total_usage += usage;
			if (total_usage > storage) {
				return i;
			}
		}
		return -1;
	}
}