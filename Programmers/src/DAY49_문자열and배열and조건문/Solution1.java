package DAY49_문자열and배열and조건문;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		int[] array1 = { 1, 1, 2, 3, 4, 5 };
		int[] array2 = { 0, 2, 3, 4 };
		System.out.println(sol.solution(array1, 1));
		System.out.println(sol.solution(array2, 1));
	}
}

class Solution12 {
	public int solution(int[] array, int n) {
		int answer = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == n) {
				answer++;
			}
		}
		return answer;
	}
}