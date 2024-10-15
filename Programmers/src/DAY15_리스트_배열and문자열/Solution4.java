package DAY15_리스트_배열and문자열;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		int[] num_list1 = { 3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1 };
		int[] num_list2 = { 2, 3, 4, 5 };
		System.out.println(sol.solution(num_list1));
		System.out.println(sol.solution(num_list2));
	}
}

class Solution45 {
	public int solution(int[] num_list) {
		int answer = 0;
		int temp = 1;
		if (num_list.length > 10) {
			for (int i = 0; i < num_list.length; i++) {
				answer += num_list[i];
			}
		} else if (num_list.length <= 10) {
			for (int i = 0; i < num_list.length; i++) {
				temp *= num_list[i];
			}
			answer = temp;
		}
		return answer;
	}
}