package DAY14_리스트_배열;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		int[] numbers1 = { 34, 5, 71, 29, 100, 34 };
		int[] numbers2 = { 58, 44, 27, 10, 100 };
		System.out.println(sol.solution(numbers1, 123));
		System.out.println(sol.solution(numbers2, 139));
	}
}

class Solution45 {
	public int solution(int[] numbers, int n) {
		int answer = 0;
		for (int i = 0; i < numbers.length; i++) {
			answer += numbers[i];
			if (answer > n) {
				break;
			}
		}
		return answer;
	}
}