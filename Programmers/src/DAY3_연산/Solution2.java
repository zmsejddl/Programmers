package DAY3_연산;

public class Solution2 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] arr = { "a", "b", "c" };
		System.out.println(sol.solution(arr));
	}
}

class Solution {
	public String solution(String[] arr) {
		String answer = "";
		for (int i = 0; i < arr.length; i++) {
			answer+=arr[i];
		}
		return answer;
	}
}