package DAY33;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		System.out.println(sol.solution(29183, 1));
		System.out.println(sol.solution(232443, 4));
		System.out.println(sol.solution(123456, 7));
	}
}

class Solution12 {
	public int solution(int num, int k) {
		int answer = -1;
		String str1 = Integer.toString(num);
		char[] chArr = str1.toCharArray();
		char str2 = Integer.toString(k).charAt(0);
		for (int i = 0; i < chArr.length; i++) {
			if (chArr[i] == str2) {
				answer = i + 1;
				break;
			}
		}
		return answer;
	}
}