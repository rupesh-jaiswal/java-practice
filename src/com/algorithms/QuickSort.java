package com.algorithms;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		System.out.println("Enter no of elements to sort");
		int n=src.nextInt();
		int []a= new int[n];
	
		for(int i=0;i<n;i++) {
			a[i]=src.nextInt();
		}
		quicksort(a,0,1,a.length);
		System.out.println("Sorted array");
		print(a);
	}
	private static void quicksort(int[] a, int pivot, int j, int length) {
		// TODO Auto-generated method stub
		for(int i=j;i<length;i++) {
			if(a[pivot]>a[i]) {
				swap(a,pivot,i);
				pivot=i;
			}
		}
		print(a);
		if(length-j>1 && j<length) {
			System.out.println("in recusrsion");
			quicksort(a,0,1,pivot-1);
			quicksort(a,pivot+1,pivot+2,a.length);
		}
		
	}
	private static void swap(int[] a, int j, int i) {
		// TODO Auto-generated method stub
		int temp = a[j];
		a[j]=a[i];
		a[i]=temp;
	}
	private static void print(int [] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+", ");
			
		}
		System.out.println();
	}


}
