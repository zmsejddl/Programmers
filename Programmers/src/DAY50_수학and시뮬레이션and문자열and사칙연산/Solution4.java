package DAY50_수학and시뮬레이션and문자열and사칙연산;

public class Solution4 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		System.out.println(sol.solution("3x + 7 + x"));
		System.out.println(sol.solution("x + x + x"));
	}
}

class Solution45 {
	public String solution(String polynomial) {
		int xCoefficient = 0;
		int constant = 0;

		String[] terms = polynomial.split(" ");

		for (String term : terms) {
			if (term.contains("x")) {
				if (term.equals("x")) {
					xCoefficient += 1;
				} else {
					xCoefficient += Integer.parseInt(term.replace("x", ""));
				}
			} else if (!term.equals("+")) {
				constant += Integer.parseInt(term);
			}
		}

		StringBuilder result = new StringBuilder();

		if (xCoefficient != 0) {
			if (xCoefficient == 1) {
				result.append("x");
			} else {
				result.append(xCoefficient).append("x");
			}
		}

		if (constant != 0) {
			if (xCoefficient != 0) {
				result.append(" + ");
			}
			result.append(constant);
		}

		return result.length() > 0 ? result.toString() : "0";
	}
}