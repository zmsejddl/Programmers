package DAY60;

import java.util.*;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		String[] park1 = { "SOO", "OOO", "OOO" };
		String[] park2 = { "SOO", "OXX", "OOO" };
		String[] park3 = { "OSO", "OOO", "OXO", "OOO" };
		String[] routes1 = { "E 2", "S 2", "W 1" };
		String[] routes2 = { "E 2", "S 2", "W 1" };
		String[] routes3 = { "E 2", "S 3", "W 1" };
		System.out.println(Arrays.toString(sol.solution(park1, routes1)));
		System.out.println(Arrays.toString(sol.solution(park2, routes2)));
		System.out.println(Arrays.toString(sol.solution(park3, routes3)));
	}
}

class Solution12 {
	public int[] solution(String[] park, String[] routes) {
		int height = park.length;
		int width = park[0].length();
		int[] positiion = new int[2];

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (park[i].charAt(j) == 'S') {
					positiion[0] = i;
					positiion[1] = j;
					break;
				}
			}
		}

		for (String route : routes) {
			String[] parts = route.split(" ");
			String direction = parts[0];
			int distance = Integer.parseInt(parts[1]);

			int tempRow = positiion[0];
			int tempCol = positiion[1];
			boolean isBlocked = false;

			for (int step = 1; step <= distance; step++) {
				switch (direction) {
				case "N":
					tempRow--;
					break;
				case "S":
					tempRow++;
					break;
				case "W":
					tempCol--;
					break;
				case "E":
					tempCol++;
					break;
				}

				if (tempRow < 0 || tempRow >= height || tempCol < 0 || tempCol >= width
						|| park[tempRow].charAt(tempCol) == 'X') {
					isBlocked = true;
					break;
				}
			}

			if (!isBlocked) {
				positiion[0] = tempRow;
				positiion[1] = tempCol;
			}
		}

		return positiion;
	}
}