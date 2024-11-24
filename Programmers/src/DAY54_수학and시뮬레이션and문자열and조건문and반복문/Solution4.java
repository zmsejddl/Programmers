package DAY54_수학and시뮬레이션and문자열and조건문and반복문;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		System.out.println(sol.solution(1, 13, 1));
		System.out.println(sol.solution(10, 50, 5));
		System.out.println(sol.solution(3, 10, 2));
	}
}

class Solution45 {
	public int solution(int i, int j, int k) {
		int count = 0;
		String target = String.valueOf(k);

		for (int num = i; num <= j; num++) {
			String current = String.valueOf(num);
			for (char c : current.toCharArray()) {
				if (String.valueOf(c).equals(target)) {
					count++;
				}
			}
		}

		return count;
	}
}