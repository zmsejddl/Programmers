package DAY7_반복문;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution5 {
	public static void main(String[] args) {
		Solution345 sol = new Solution345();
		int[] arr = { 1, 4, 2, 5, 3 };
		System.out.println(Arrays.toString(sol.solution(arr)));
	}
}

class Solution345 {
	public int[] solution(int[] arr) {
		ArrayList<Integer> sequence=new ArrayList<Integer>();
		int i=0;
		while(i<arr.length) {
			if(sequence.isEmpty()) {
				sequence.add(arr[i]);
				i++;
			}else if(sequence.isEmpty()==false&&sequence.get(sequence.size()-1)<arr[i]) {
				sequence.add(arr[i]);
				i++;
			}else if(sequence.isEmpty()==false&&sequence.get(sequence.size()-1)>=arr[i]) {
				sequence.remove(sequence.size()-1);
			}
		}
		int[] stk = new int[sequence.size()];
		for (int j = 0; j < sequence.size(); j++) {
			stk[j] = sequence.get(j);
		}
		
		return stk;
	}
}