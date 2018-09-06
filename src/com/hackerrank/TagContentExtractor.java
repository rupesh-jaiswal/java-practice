package com.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagContentExtractor{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		while(testCases>0){
			String line = in.nextLine();
			boolean matchFound = false;
			String pattern = "<(.+)>([^<]+)</\\1>";
			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(line);
			
			while(m.find()) {
				System.out.println(m.group(2));
				matchFound = true;
			}
			if(!matchFound) {
				System.out.println("None");
			}
          	//Write
			
			testCases--;
		}
	}
}