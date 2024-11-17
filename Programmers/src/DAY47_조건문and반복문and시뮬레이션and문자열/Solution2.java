package DAY47_조건문and반복문and시뮬레이션and문자열;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		System.out.println(sol.solution(3));
		System.out.println(sol.solution(29423));
	}
}

class Solution23 {
	public int solution(int order) {
		int answer = 0;
		String str = String.valueOf(order);
		String[] sp = str.split("");
		for (int i = 0; i < sp.length; i++) {
			if (sp[i].equals("3") || sp[i].equals("6") || sp[i].equals("9")) {
				answer++;
			}
		}
		return answer;
	}
}