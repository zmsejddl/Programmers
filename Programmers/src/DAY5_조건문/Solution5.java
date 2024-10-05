package DAY5_조건문;

public class Solution5 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] num_list = { 3, 4, 5, 2, 1 };
		System.out.println(sol.solution(num_list));
	}
}

class Solution {
	public int solution(int[] num_list) {
		int answer = 0;
		String str1 = "";
		String str2 = "";
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 == 0) {
				str1 += Integer.toString(num_list[i]);
			} else if (num_list[i] % 2 == 1) {
				str2 += Integer.toString(num_list[i]);
			}
			int a = str1.isEmpty() ? 0 : Integer.parseInt(str1);
			int b = str2.isEmpty() ? 0 : Integer.parseInt(str2);
			answer = a + b;
		}
		return answer;
	}
}