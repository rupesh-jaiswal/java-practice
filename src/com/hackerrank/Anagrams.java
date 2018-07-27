package com.hackerrank;

import java.util.Scanner;

public class Anagrams {
	static void sort(char [] a) {
		for(int i=0;i<a.length-1;i++ ) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					char temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	static boolean isAnagram(String a, String b) {
        // Complete the function
		a=a.toLowerCase();
		b=b.toLowerCase();
		char[] aa=a.toCharArray();
		char[] bb = b.toCharArray();
		sort(aa);
		sort(bb);
		a =new String(aa);
		b=new String(bb);
		return a.equals(b);
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

}
