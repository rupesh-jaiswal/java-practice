package com.recursion;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of fibonacci elements");
		Scanner src = new Scanner(System.in);
		int n=src.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(fibo(i));
		}
	}
	
	public static int fibo(int n) {
		if(n<=2) {
			return 1;
		}else {
			return fibo(n-1)+fibo(n-2);
		}
	}

}
