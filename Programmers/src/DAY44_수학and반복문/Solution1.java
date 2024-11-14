package DAY44_수학and반복문;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		int[] box1 = { 1, 1, 1 };
		int[] box2 = { 10, 8, 6 };
		System.out.println(sol.solution(box1, 1));
		System.out.println(sol.solution(box2, 3));
	}
}

class Solution12 {
	public int solution(int[] box, int n) {
		int answer = 0;
		if (box[0] < n || box[1] < n || box[2] < n) {
			answer = 0;
		} else {
			answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
		}
		return answer;
	}
}