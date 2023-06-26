package com.Example.StudentModel;

public class Student {
	int id;
	String username;
	int no;
	String Subjects;
	public static void main(String args[]) {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return username;
	}
	public void setName(String name) {
		this.username = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	public String getSubjects() {
		return Subjects;
	}

	public void setSubjects(String subjects) {
		Subjects = subjects;
	}

	public Student(int id, String username, int no, String subjects) {
		super();
		this.id = id;
		this.username = username;
		this.no = no;
		Subjects = subjects;
	}

	public void addAttribute(String string, Student stu) {
		// TODO Auto-generated method stub
		
	}
     
	

}
