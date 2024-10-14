package DAY14_리스트_배열;

public class Solution1 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] num_list1 = { 4, 2, 6, 1, 7, 6 };
		int[] num_list2 = { -1, 2, 5, 6, 3 };
		System.out.println(sol.solution(num_list1));
		System.out.println(sol.solution(num_list2));
	}
}

class Solution {
	public int solution(int[] num_list) {
		int answer = 0;
		int even = 0;
		int odd = 0;
		for (int i = 0; i < num_list.length; i++) {
			if (i % 2 == 0) {
				even += num_list[i];
			} else if (i % 2 != 0) {
				odd += num_list[i];
			}
		}
		if (even > odd) {
			answer = even;
		} else {
			answer = odd;
		}
		return answer;
	}
}