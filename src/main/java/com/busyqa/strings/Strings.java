package com.busyqa.strings;

public class Strings {

	public static void main(String[] args) {
	
		String s3 = "busyQA";
		String s4 = "busyQA";
		String s1 = new String("busyQA");
		String s2 = new String("  busyQA   ");
		
		//System.out.println(s1.length());
		System.out.println((int)s1.charAt(5));
		
		System.out.println(s1.substring(3,5));
		
//		if (s3 == s1) {
//			System.out.println("Are Equal");
//		} else {
//			System.out.println("Are Different");
//		}

	}

}
