package DAY49_문자열and배열and조건문;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		int[] array1 = { 149, 180, 192, 170 };
		int[] array2 = { 180, 120, 140 };
		System.out.println(sol.solution(array1, 167));
		System.out.println(sol.solution(array2, 190));
	}
}

class Solution23 {
	public int solution(int[] array, int height) {
		int answer = 0;
		for (int i = 0; i < array.length; i++) {
			if (height < array[i]) {
				answer++;
			}
		}
		return answer;
	}
}