package com.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet(new MyComparator());
		t.add(5);
		t.add(10);
		t.add(0);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}
}

class MyComparator implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		Integer i1 = (Integer)arg0;
		Integer i2 = (Integer)arg1;
		if(i1>i2) {
			return -1;
		}else if(i1<i2) {
			return 1;
		}else {
			return 0;
		}
	
	}
	
}