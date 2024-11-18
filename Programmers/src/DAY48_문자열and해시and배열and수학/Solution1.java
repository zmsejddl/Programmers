package DAY48_문자열and해시and배열and수학;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		System.out.println(sol.solution("onetwothreefourfivesixseveneightnine"));
		System.out.println(sol.solution("onefourzerosixseven"));
	}
}

class Solution12 {
	public long solution(String numbers) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		map.put("six", 6);
		map.put("seven", 7);
		map.put("eight", 8);
		map.put("nine", 9);
		map.put("zero", 0);

		String temp = "";
		StringBuilder sb = new StringBuilder();
		for (char c : numbers.toCharArray()) {
			temp += c;
			if (map.containsKey(temp)) {
				sb.append(map.get(temp));
				temp = "";
			}
		}

		return Long.parseLong(sb.toString());
	}
}