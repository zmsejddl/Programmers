package DAY5_조건문;

public class Solution4 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] num_list = { 3, 4, 5, 2, 1 };
		System.out.println(sol.solution(num_list));
	}
}

class Solution {
	public int solution(int[] num_list) {
		int answer = 0;
		int a = 1;
		int b = 0;
		for (int i = 0; i < num_list.length; i++) {
			a *= num_list[i];
			b += num_list[i];
			if (a > b * b) {
				answer = 0;
			} else {
				answer = 1;
			}
		}
		return answer;
	}
}