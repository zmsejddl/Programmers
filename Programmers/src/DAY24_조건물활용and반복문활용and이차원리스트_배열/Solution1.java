package DAY24_조건물활용and반복문활용and이차원리스트_배열;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		String[] order1 = { "cafelatte", "americanoice", "hotcafelatte", "anything" };
		String[] order2 = { "americanoice", "americano", "iceamericano" };
		System.out.println(sol.solution(order1));
		System.out.println(sol.solution(order2));
	}
}

class Solution12 {
	public int solution(String[] order) {
		int answer = 0;
		for (int i = 0; i < order.length; i++) {
			if (order[i].indexOf("americano") != -1 || order[i].indexOf("anything") != -1) {
				answer += 4500;
			} else if (order[i].indexOf("cafelatte") != -1) {
				answer += 5000;
			}
		}
		return answer;
	}
}