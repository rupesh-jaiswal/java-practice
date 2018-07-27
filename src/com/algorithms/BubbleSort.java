package com.algorithms;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		System.out.println("Enter no of elements to sort");
		int n = src.nextInt();
		System.out.println("Enter elements");
		int []a = new int[n];
		for(int i=0; i<n;i++) {
			a[i] = src.nextInt();
		}
		
		//Bubble Sort algo
		boolean swapped=true;
		for(int i=0;i<n-1 && swapped==true;i++) {
			swapped=false;
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					swap(a,j,j+1);
					swapped=true;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}

	private static void swap(int[] a, int j, int i) {
		// TODO Auto-generated method stub
		int temp = a[j];
		a[j]=a[i];
		a[i]=temp;
	}

}
