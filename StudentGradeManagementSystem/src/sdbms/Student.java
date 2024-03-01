package sdbms;

public class Student {

	private String id;
	private String name;
	private double marks;
	private static int count=101;     //starts CODETECH101--->auto Generated 

	public Student(String name, double marks) {
		this.id="CODETECH"+count;           
		count++;
		this.name=name;
		this.marks=marks;
		
	}


	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}

	public double getMarks() {
		return marks;
	}


	public void setMarks(double marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

}
