package DAY22_함수_메서드and조건문활용;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		int[] arr1 = { 293, 1000, 395, 678, 94 };
		int[] arr2 = { 110, 66, 439, 785, 1 };
		int[] delete_list1 = { 94, 777, 104, 1000, 1, 12 };
		int[] delete_list2 = { 377, 823, 119, 43 };
		System.out.println(Arrays.toString(sol.solution(arr1, delete_list1)));
		System.out.println(Arrays.toString(sol.solution(arr2, delete_list2)));
	}
}

class Solution45 {
	public int[] solution(int[] arr, int[] delete_list) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for (int num : arr) {
			list1.add(num);
		}
		for (int i = 0; i < delete_list.length; i++) {
			if (list1.contains(delete_list[i])) {
				list1.remove(Integer.valueOf(delete_list[i]));
			}
		}
		int[] answer = new int[list1.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list1.get(i);
		}
		return answer;
	}
}