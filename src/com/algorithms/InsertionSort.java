package com.algorithms;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		System.out.println("Enter no of elements to sort");
		int n=src.nextInt();
		int []a= new int[n];
	
		for(int i=0;i<n;i++) {
			a[i]=src.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			if(a[i]>a[i+1]) {
				swap(a,i,i+1);
			}
			for(int j=i-1;j>0;j--) {
				if(a[j]<a[j-1]) {
					swap(a,j,j-1);
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
