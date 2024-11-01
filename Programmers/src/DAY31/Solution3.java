package DAY31;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		int[] array1= {7, 77, 17};
		int[] array2= {10, 29};
		System.out.println(sol.solution(array1));
		System.out.println(sol.solution(array2));
	}
}

class Solution34 {
	public int solution(int[] array) {
		int answer = 0;
		for (int i = 0; i < array.length; i++) {
			String strNumber = Integer.toString(array[i]);
			for (int j = 0; j < strNumber.length(); j++) {
				if (strNumber.charAt(j) == '7') {
					answer++;
				}
			}
		}
		return answer;
	}
}