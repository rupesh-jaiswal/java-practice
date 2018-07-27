package com.hackerrank;
import java.util.*;

class Student{
	private int id;
	public String fname;
	public double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}
class Checker1 implements Comparator {
    public int compare(Object o1, Object o2) {
    	Student p1 = (Student)o1;
    	Student p2 = (Student)o2;
        if(p1.cgpa<=p2.cgpa) {
            if(p1.cgpa == p2.cgpa) {
                return p1.fname.compareTo(p2.fname);
            }else {
            	return 1;
            }
        }else {
        	return -1;
        }
    }
}
//Complete the code
public class SortingProblem
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
		Checker1 checker =new Checker1();
        Collections.sort(studentList, checker);
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}