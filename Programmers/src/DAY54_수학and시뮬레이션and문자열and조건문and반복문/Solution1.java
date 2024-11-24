package DAY54_수학and시뮬레이션and문자열and조건문and반복문;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		System.out.println(sol.solution(100));
		System.out.println(sol.solution(1081));
	}
}

class Solution12 {
	public int solution(int chicken) {
		int service = 0;
		int coupons = chicken;

		while (coupons >= 10) {
			int newChicken = coupons / 10;
			service += newChicken;
			coupons = newChicken + (coupons % 10);
		}

		return service;
	}
}