package DAY2_출력and연산;

import java.util.Scanner;

public class Solution3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char b;
		char[] charArray = new char[a.length()];
		for (int i = 0; i < a.length(); i++) {
			b = a.charAt(i);
			charArray[i] = b;
			System.out.println(charArray[i]);
		}
	}
}
