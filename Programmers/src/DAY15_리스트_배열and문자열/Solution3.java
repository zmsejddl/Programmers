package DAY15_리스트_배열and문자열;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		int[] num_list = { 12, 4, 15, 1, 14 };
		System.out.println(sol.solution(num_list));
	}
}

class Solution34 {
	public int solution(int[] num_list) {
		int answer = 0;
		for (int i = 0; i < num_list.length; i++) {
			int count=0;
			while (true) {
				if (num_list[i] == 1) {
					answer+=count;
					break;
				} else if (num_list[i] != 1 && num_list[i] % 2 == 0) {
					num_list[i] /= 2;
					count++;
				} else if (num_list[i] != 1 && num_list[i] % 2 == 1) {
					num_list[i] = (num_list[i] - 1) / 2;
					count++;
				}
			}
		}
		return answer;
	}
}