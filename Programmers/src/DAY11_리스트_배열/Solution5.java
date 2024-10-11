package DAY11_리스트_배열;

public class Solution5 {
	public static void main(String[] args) {
		Solution56 sol = new Solution56();
		int[] arr = { 1, 1, 1, 1, 0 };
		System.out.println(sol.solution(arr, 3));
	}
}

class Solution56 {
	public int solution(int[] arr, int idx) {
		int answer = -1;
		for (int i = 0; i < arr.length; i++) {
			if (i >= idx && arr[i] == 1) {
				answer = i;
				break;
			}
		}
		return answer;
	}
}