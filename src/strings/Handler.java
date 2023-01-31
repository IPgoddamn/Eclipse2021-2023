package strings;

import java.util.Arrays;

public class Handler {

	public static void main(String[] args) {
		String s1 = "Serg";				// literal -> pool
		String s2 = "Serg";
		String s3 = new String("Serg");	//
		String s4 = new String("Serg");
		System.out.println(s1 == s2);	// false	??
		System.out.println(s3 == s4);	// false
		System.out.println(s1 == s4);	// false
		String s5 = "Serg";	
		String s6 = s5;
		s5 += " Mary";
		System.out.println(s5);			// Serg Mary
		System.out.println(s6);			// Serg -> immutable
		String[] n = {"Serg", "Max", "Bohdan", "Vlad", "Ann"};
		// 			  SerA	   Max	  BohAan	VlaA	Ann
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n.length; i++) {
			if(n[i].length() > 3) {
				sb = new StringBuilder(n[i]);
				sb.setCharAt(3, 'A');
				n[i] = sb.toString();
			}
		}
		System.out.println(Arrays.toString(n));
	}				

}
//	 String		StringBuffer =	StringBuilder
//	immutable		mutable			mutable
//	unSafe			safe			unSafe