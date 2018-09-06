package com.hackerrank;

import java.io.*;
import java.util.*;

public class JavaArrayList {

    public static void main(String[] args) {
    	Scanner src = new Scanner(System.in);
    	ArrayList<String []> ar = new ArrayList<>();
    	int lines = src.nextInt();
    	for(int i=0;i<=lines;i++) {
    		String a = src.nextLine();
    		String s1[] = a.split("\\s");
    		ar.add(s1);
    	}
    	
    	System.out.println("Lines: "+lines);
    	System.out.println("Enter test cases");
    	int testCases = src.nextInt();
    	String op [] = new String[testCases];
    	for(int i=0;i<=testCases;i++) {
    		int x=src.nextInt();
    		int y=src.nextInt();
    		String el[] = ar.get(x-1);
    		op[i] = el[y];
    	}
    	for(String s2: op) {
    		System.out.println(s2);
    	}
    	
    	
    }
}