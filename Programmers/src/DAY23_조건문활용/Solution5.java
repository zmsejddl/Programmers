package DAY23_조건문활용;

import java.time.LocalDate;

public class Solution5 {
	public static void main(String[] args) {
		Solution56 sol = new Solution56();
		int[] date1_1 = { 2021, 12, 28 };
		int[] date1_2 = { 1024, 10, 24 };
		int[] date2_1 = { 2021, 12, 29 };
		int[] date2_2 = { 1024, 10, 24 };
		System.out.println(sol.solution(date1_1, date2_1));
		System.out.println(sol.solution(date1_2, date2_2));
	}
}

class Solution56 {
	public int solution(int[] date1, int[] date2) {
		int answer = 0;
		LocalDate d1 = LocalDate.of(date1[0], date1[1], date1[2]);
		LocalDate d2 = LocalDate.of(date2[0], date2[1], date2[2]);
		if (d1.isBefore(d2)) {
			answer = 1;
		} else {
			answer = 0;
		}
		return answer;
	}
}