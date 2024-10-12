package DAY12_리스트_배열;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		int[] num_list = { 12, 4, 15, 46, 38, -2, 15 };
		System.out.println(sol.solution(num_list));
	}
}

class Solution23 {
	public int solution(int[] num_list) {
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] < 0) {
				return i;
			}
		}
		return -1;
	}
}