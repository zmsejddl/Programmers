package DAY65;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		System.out.println(sol.solution(5, 3, 2));
		System.out.println(sol.solution(10, 3, 2));
	}
}

class Solution23 {
	public int solution(int number, int limit, int power) {
		int totalWeight = 0;

		for (int i = 1; i <= number; i++) {
			int divisorCount = getDivisorCount(i);
			if (divisorCount > limit) {
				totalWeight += power;
			} else {
				totalWeight += divisorCount;
			}
		}

		return totalWeight;
	}

	private int getDivisorCount(int num) {
		int count = 0;
		for (int i = 1; i * i <= num; i++) {
			if (num % i == 0) {
				count++;
				if (i != num / i) {
					count++;
				}
			}
		}
		return count;
	}
}