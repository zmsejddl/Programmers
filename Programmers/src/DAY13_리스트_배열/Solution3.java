package DAY13_리스트_배열;

import java.util.Arrays;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		String[] str1 = { "u", "u", "l", "r" };
		String[] str2 = { "l" };
		System.out.println(Arrays.toString(sol.solution(str1)));
		System.out.println(Arrays.toString(sol.solution(str2)));
	}
}

class Solution34 {
    public String[] solution(String[] str_list) {
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                String[] answer = new String[i];
                for (int j = 0; j < i; j++) {
                    answer[j] = str_list[j];
                }
                return answer;
            } else if (str_list[i].equals("r")) {
                String[] answer = new String[str_list.length - i - 1];
                for (int j = i + 1; j < str_list.length; j++) {
                    answer[j - i - 1] = str_list[j];
                }
                return answer;
            }
        }
        return new String[0];
    }
}
