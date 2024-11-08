package DAY38_수학and배열;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		System.out.println(sol.solution(150000));
		System.out.println(sol.solution(580000));
	}
}

class Solution12 {
	public int solution(int price) {
		double discount = 1.0;

		if (price >= 500000) {
			discount = 0.8;
		} else if (price >= 300000) {
			discount = 0.9;
		} else if (price >= 100000) {
			discount = 0.95;
		}

		return (int) (price * discount);
	}
}