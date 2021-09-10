package com.example.lab1;

public class Student implements Comparable<Student>{
	int no;
	String name;
	int age;
	
	public Student(int n, String string, int a) {
		no=n;
		name=string;
		age=a;
	}

	@Override 
	public int compareTo(Student o){
		return name.compareTo(o.name);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [no=" + no + ", name= " + name + ", age= " + age + "]";
	}
}