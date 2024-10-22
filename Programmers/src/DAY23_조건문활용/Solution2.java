package DAY23_조건문활용;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		String[] str_list1 = { "abc", "def", "ghi" };
		String[] str_list2 = { "abc", "bbc", "cbc" };
		System.out.println(sol.solution(str_list1, "ef"));
		System.out.println(sol.solution(str_list2, "c"));
	}
}

class Solution23 {
	public String solution(String[] str_list, String ex) {
		String answer = "";
		for (int i = 0; i < str_list.length; i++) {
			if (str_list[i].indexOf(ex) == -1) {
				answer += str_list[i];
			}
		}
		return answer;
	}
}