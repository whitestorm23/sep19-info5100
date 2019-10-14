package question5;

import java.util.ArrayDeque;
import java.util.Arrays;

public class IdString {

	public static void main(String[] args) {
		String s="IDID";
		Solution example=new Solution();
		 System.out.println(Arrays.toString(example.diStringMatch(s)));
		// TODO Auto-generated method stub

	} 
}
class Solution {
	public int[] diStringMatch(String S) {
	      int[] result = new int[S.length() + 1];
	        ArrayDeque<Integer> digit = new ArrayDeque<>();
	        for (int i = 0; i < result.length; i++) digit.addLast(i);
	        for (int i = 0; i < S.length(); i++) {
	            if (S.charAt(i) == 'D') result[i] = digit.removeLast();
	            else result[i] = -1;
	        }
	        for (int i = 0; i < result.length; i++) {
	            result[i] = result[i] == -1 ? digit.removeFirst() : result[i];
	        }
	        result[S.length()] = digit.removeFirst();
	        return result;
	  }
}
