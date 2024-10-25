package DAY25_이차원리스트_배열;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		int[][] arr1 = { { 5, 192, 33 }, { 192, 72, 95 }, { 33, 95, 999 } };
		int[][] arr2 = { { 19, 498, 258, 587 }, { 63, 93, 7, 754 }, { 258, 7, 1000, 723 }, { 587, 754, 723, 81 } };
		System.out.println(sol.solution(arr1));
		System.out.println(sol.solution(arr2));
	}
}

class Solution23 {
	public int solution(int[][] arr) {
		int answer = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] != arr[j][i]) {
					answer = 0;
				}
			}
		}
		return answer;
	}
}