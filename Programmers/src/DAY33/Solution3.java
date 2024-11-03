package DAY33;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		System.out.println(sol.solution("3 + 4"));
	}
}

class Solution34 {
	public int solution(String my_string) {
		String[] strArr = my_string.split(" ");
		int answer = Integer.parseInt(strArr[0]);
		for (int i = 1; i < strArr.length; i += 2) {
			String operator = strArr[i];
			int num = Integer.parseInt(strArr[i + 1]);
			if (operator.equals("+")) {
				answer += num;
			} else if (operator.equals("-")) {
				answer -= num;
			}
		}
		return answer;
	}
}