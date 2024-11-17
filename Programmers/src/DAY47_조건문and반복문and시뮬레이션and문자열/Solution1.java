package DAY47_조건문and반복문and시뮬레이션and문자열;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		int[] arrays1 = { 3, 10, 28 };
		int[] arrays2 = { 10, 11, 12 };
		System.out.println(sol.solution(arrays1, 20));
		System.out.println(sol.solution(arrays2, 13));
	}
}

class Solution12 {
	public int solution(int[] array, int n) {
		int answer = array[0];
		int min = Math.abs(array[0] - n);

		for (int i = 0; i < array.length; i++) {
			int temp = Math.abs(array[i] - n);
			if (temp < min || (temp == min && array[i] < answer)) {
				min = temp;
				answer = array[i];
			}
		}
		return answer;
	}
}