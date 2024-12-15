package DAY67;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		int[] ingredient1 = { 2, 1, 1, 2, 3, 1, 2, 3, 1 };
		int[] ingredient2 = { 1, 3, 2, 1, 2, 1, 3, 1, 2 };
		System.out.println(sol.solution(ingredient1));
		System.out.println(sol.solution(ingredient2));
	}
}

class Solution12 {
	public int solution(int[] ingredient) {
		int answer = 0;
		int[] temp = new int[ingredient.length];
		int index = 0;

		for (int i : ingredient) {
			temp[index++] = i;

			if (index >= 4 && temp[index - 4] == 1 && temp[index - 3] == 2 && temp[index - 2] == 3
					&& temp[index - 1] == 1) {
				index -= 4;
				answer++;
			}
		}
		return answer;
	}
}