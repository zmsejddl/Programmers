package DAY31;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		System.out.println(sol.solution("hello", "ohell"));
		System.out.println(sol.solution("apple", "elppa"));
		System.out.println(sol.solution("atat", "tata"));
		System.out.println(sol.solution("abc", "abc"));
	}
}

class Solution12 {
	public int solution(String A, String B) {
		if (A.equals(B)) {
			return 0;
		}
		int count = 0;
		String str = A;
		for (int i = 1; i <= A.length(); i++) {
			str = str.substring(str.length() - 1) + str.substring(0, str.length() - 1);
			count++;

			if (str.equals(B)) {
				return count;
			}
		}
		return -1;
	}
}