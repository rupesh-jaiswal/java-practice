package com.hackerrank;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntaxChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		String [] op = new String[testCases];
		int i=0;
		while(i<testCases) {
			String pattern = in.nextLine();
			try {
				Pattern p = Pattern.compile(pattern);
				op[i] = "Valid";
			}catch(Exception e) {
				op[i] = "Invalid";
			}
			i++;
		}
		for(String item: op) {
			System.out.println(item);
		}
	}

}
