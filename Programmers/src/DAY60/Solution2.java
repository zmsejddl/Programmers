package DAY60;

import java.util.Arrays;

public class Solution2 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		String[] wallpapaer1 = { ".#...", "..#..", "...#." };
		String[] wallpapaer2 = { "..........", ".....#....", "......##..", "...##.....", "....#....." };
		String[] wallpapaer3 = { ".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...",
				"....#...." };
		String[] wallpapaer4 = { "..", "#." };
		System.out.println(Arrays.toString(sol.solution(wallpapaer1)));
		System.out.println(Arrays.toString(sol.solution(wallpapaer2)));
		System.out.println(Arrays.toString(sol.solution(wallpapaer3)));
		System.out.println(Arrays.toString(sol.solution(wallpapaer4)));
	}
}

class Solution23 {
	public int[] solution(String[] wallpaper) {
		int lux = Integer.MAX_VALUE;
		int luy = Integer.MAX_VALUE;
		int rdx = Integer.MIN_VALUE;
		int rdy = Integer.MIN_VALUE;

		for (int i = 0; i < wallpaper.length; i++) {
			for (int j = 0; j < wallpaper[i].length(); j++) {
				if (wallpaper[i].charAt(j) == '#') {
					lux = Math.min(lux, i);
					luy = Math.min(luy, j);
					rdx = Math.max(rdx, i + 1);
					rdy = Math.max(rdy, j + 1);
				}
			}
		}

		return new int[] { lux, luy, rdx, rdy };
	}
}