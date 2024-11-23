package DAY53_배열and정렬and문자열;

public class Solution3 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		String[] id_pw1 = { "meosseugi", "1234" };
		String[] id_pw2 = { "programmer01", "15789" };
		String[] id_pw3 = { "rabbit04", "98761" };
		String[][] db1 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };
		String[][] db2 = { { "programmer02", "111111" }, { "programmer00", "134" }, { "programmer01", "1145" } };
		String[][] db3 = { { "jaja11", "98761" }, { "krong0313", "29440" }, { "rabbit00", "111333" } };
		System.out.println(sol.solution(id_pw1, db1));
		System.out.println(sol.solution(id_pw2, db2));
		System.out.println(sol.solution(id_pw3, db3));
	}
}

class Solution34 {
	public String solution(String[] id_pw, String[][] db) {
		String answer = "fail";
		for (int i = 0; i < db.length; i++) {
			if (id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])) {
				answer = "login";
			} else if (id_pw[0].equals(db[i][0]) && !id_pw[1].equals(db[i][1])) {
				answer = "wrong pw";
			}
		}
		return answer;
	}
}