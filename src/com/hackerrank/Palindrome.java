package com.hackerrank;

import java.util.Scanner;

public class Palindrome {

	public static void main(String args[]) { 
		Scanner sc=new Scanner(System.in);
	     String A=sc.next();
	     char[] ac=A.toCharArray();
	     String reverse= "";
	     for(int i=ac.length-1;i>=0;i--)
	    	 reverse+=ac[i];
	     //StringBuilder sb=new StringBuffer();
	     //sb.append(A);
	     //sb.reverse();
	     System.out.println(A.equals(reverse)?"Yes":"No");
	}
}
