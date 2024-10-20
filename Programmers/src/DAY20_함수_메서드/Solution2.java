package DAY20_함수_메서드;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		int[] arr1 = { 49, 13 };
		int[] arr2 = { 70, 11, 2 };
		int[] arr3 = { 100, 17, 84, 1 };
		int[] arr4 = { 55, 12, 65, 36 };
		int[] arr5 = { 1, 2, 3, 4, 5 };
		int[] arr6 = { 3, 3, 3, 3, 3 };
		System.out.println(sol.solution(arr1, arr2));
		System.out.println(sol.solution(arr3, arr4));
		System.out.println(sol.solution(arr5, arr6));
	}
}

class Solution23 {
	public int solution(int[] arr1, int[] arr2) {
		int answer = 0;
		int sum1 = 0;
		int sum2 = 0;
		if (arr1.length != arr2.length) {
			answer = arr1.length > arr2.length ? 1 : -1;
		} else if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				sum1 += arr1[i];
			}
			for (int i = 0; i < arr2.length; i++) {
				sum2 += arr2[i];
			}
			answer = sum1 > sum2 ? 1 : -1;
			if (sum1 == sum2) {
				answer = 0;
			}
		}
		return answer;
	}
}