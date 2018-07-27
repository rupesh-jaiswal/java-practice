package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class JavaSubstringComparisons {
	public static String[] sort(String[] s) {
		for(int i=0;i<s.length-1;i++) {
			for (int j=0;j<s.length-1;j++) {
				if(s[j].compareTo(s[j+1])>0) {
					String temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
		return s;
		
	}
	
	
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String substrings[] =new String[s.length()-(k-1)];
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0;i<s.length()-k+1;i++) {
        	substrings[i]=s.substring(i, i+k);
        }
        sort(substrings);
        //Arrays.sort(substrings);
        smallest = substrings[0];
        largest = substrings[substrings.length-1];
        return smallest + "\n" + largest;
    }
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }

}
