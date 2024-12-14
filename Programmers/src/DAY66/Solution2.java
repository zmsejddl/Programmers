package DAY66;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		int[] food1 = { 1, 3, 4, 6 };
		int[] food2 = { 1, 7, 1, 2 };
		System.out.println(sol.solution(food1));
		System.out.println(sol.solution(food2));
	}
}

class Solution23 {
	public String solution(int[] food) {
		StringBuilder left = new StringBuilder();

		for (int i = 1; i < food.length; i++) {
			int count = food[i] / 2;
			for (int j = 0; j < count; j++) {
				left.append(i);
			}
		}

		String right = left.reverse().toString();
		return left.reverse().append("0").append(right).toString();
	}
}