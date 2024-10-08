package DAY8_조건문and문자열;

public class Solution3 {
	public static void main(String[] args) {
		Solution234 sol = new Solution234();
		int[] index_list = { 16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7 };
		System.out.println(sol.solution("cvsgiorszzzmrpaqpe", index_list));
	}
}

class Solution234 {
	public String solution(String my_string, int[] index_list) {
		String answer = "";
		for (int i = 0; i < index_list.length; i++) {
			answer += my_string.charAt(index_list[i]);
		}
		return answer;
	}
}