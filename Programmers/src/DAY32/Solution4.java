package DAY32;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		System.out.println(sol.solution(1234));
		System.out.println(sol.solution(930211));
	}
}

class Solution45 {
	public int solution(int n) {
		int answer = 0;
		String str = Integer.toString(n);
		char[] charArr = str.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			answer += Character.getNumericValue(charArr[i]);
		}
		return answer;
	}
}