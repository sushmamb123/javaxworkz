package Inheritance;

public class Student extends Qualification {
public String education;
	
	public Student() {
		System.out.println("no-arg constructor in Student");	
		}
	public void qualificationInfo() {
		System.out.println("invoking studentInfo in Student");
	}


}
