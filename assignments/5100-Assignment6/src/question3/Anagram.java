package question3;

import java.util.Arrays;

public class Anagram {
	public static boolean isAnagram(String s, String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		char[] a=s.toCharArray();
		char[] b=t.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.equals(a, b);
	}
	public static void main(String[] args) {
		String s="anaconda";
		String t="nandacon";
		System.out.println(isAnagram(s,t));
		String y="naaconad";
		System.out.println(isAnagram(s,y));
		
	}
}
