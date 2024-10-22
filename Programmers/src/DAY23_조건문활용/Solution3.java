package DAY23_조건문활용;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		int[] num_list1 = { 1, 2, 3, 4, 5 };
		int[] num_list2 = { 15, 98, 23, 2, 15 };
		System.out.println(sol.solution(num_list1, 3));
		System.out.println(sol.solution(num_list2, 20));
	}
}

class Solution34 {
	public int solution(int[] num_list, int n) {
		int answer = 0;
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] == n) {
				answer = 1;
			}
		}
		return answer;
	}
}