package DAY43_조건문and배열and수학and시뮬레이션;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		int[] numbers1 = { 1, 2, 3, 4 };
		int[] numbers2 = { 1, 2, 3, 4, 5, 6 };
		int[] numbers3 = { 1, 2, 3 };
		System.out.println(sol.solution(numbers1, 2));
		System.out.println(sol.solution(numbers2, 5));
		System.out.println(sol.solution(numbers3, 3));
	}
}

class Solution34 {
	public int solution(int[] numbers, int k) {
		int answer = ((k - 1) * 2) % numbers.length;
		return numbers[answer];
	}
}