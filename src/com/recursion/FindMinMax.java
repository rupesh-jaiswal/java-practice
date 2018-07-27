package com.recursion;

import java.util.Scanner;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		System.out.println("Enter no of elements");
		int n=src.nextInt();
		System.out.println("Enter elements");
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=src.nextInt();
		}
		System.out.println("Maximum is:  "+getMax(arr,1,arr[0]));
	}

	private static int getMax(int [] arr, int index,int max) {
		// TODO Auto-generated method stub
		System.out.println("calling for index = "+index+" and max = "+max);
		 if(index==arr.length-1) 
			 return (max>arr[0]?max:arr[0]);
		 else {
			 max=getMax(arr,index+1,arr[index+1]);
			 if (max>arr[index]) {
				 return max;
			 }else {
				 return arr[index];
			 }
		 }

	}

}
