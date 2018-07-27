package com.hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class CurrencyConverter {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        String us ;;
		us = nf.format(payment);
		
		Locale inr = new Locale("inr", "India");
		nf=NumberFormat.getCurrencyInstance(inr);
		String india=nf.format(payment);
		india=india.replaceAll(india.toCharArray()[0]+" ", "Rs.");
		
		nf=NumberFormat.getCurrencyInstance(Locale.CHINA);
		String china = nf.format(payment);
		
		nf=NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String france = nf.format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}
