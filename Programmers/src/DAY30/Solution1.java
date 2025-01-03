package DAY30;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		String[] storage1 = { "pencil", "pencil", "pencil", "book" };
		String[] storage2 = { "doll", "doll", "doll", "doll" };
		String[] storage3 = { "apple", "steel", "leaf", "apple", "leaf" };
		String[] storage4 = { "mirror", "net", "mirror", "net", "bottle" };
		int[] num1 = { 2, 4, 3, 1 };
		int[] num2 = { 1, 1, 1, 1 };
		int[] num3 = { 5, 3, 5, 3, 7 };
		int[] num4 = { 4, 1, 4, 1, 5 };
		System.out.println(sol.solution(storage1, num1));
		System.out.println(sol.solution(storage2, num2));
		System.out.println(sol.solution(storage3, num3));
		System.out.println(sol.solution(storage4, num4));
	}
}

class Solution12 {
	public String solution(String[] storage, int[] num) {
		int num_item = 0;
		String[] clean_storage = new String[storage.length];
		int[] clean_num = new int[num.length];

		for (int i = 0; i < storage.length; i++) {
			int clean_idx = -1;
			for (int j = 0; j < num_item; j++) {
				if (storage[i].equals(clean_storage[j])) {
					clean_idx = j;
					break;
				}
			}
			if (clean_idx == -1) {
				clean_storage[num_item] = storage[i];
				clean_num[num_item] = num[i];
				num_item += 1;
			} else {
				clean_num[clean_idx] += num[i];
			}
		}

		// 아래 코드에는 틀린 부분이 없습니다.

		int num_max = -1;
		String answer = "";
		for (int i = 0; i < num_item; i++) {
			if (clean_num[i] > num_max) {
				num_max = clean_num[i];
				answer = clean_storage[i];
			}
		}
		return answer;
	}
}