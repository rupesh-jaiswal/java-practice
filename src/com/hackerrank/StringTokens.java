package com.hackerrank;

import java.util.Scanner;

public class StringTokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] items = s.trim().split("[ !,?.\\_'@]+");
        if(s.length()==0 || s==null || s.trim().equals("") ||  s.equals("")){
            System.out.println(s.length());
         }
         else if(s.length() > 400000){
             return;
         }
         else{
            System.out.println(items.length);
         }
        for(String item: items) {
        	System.out.println(item);
        }
        // Write your code here.
        scan.close();
	}

}
