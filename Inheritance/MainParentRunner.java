package unique.com.acer.book;

import Inheritance.Children;
import Inheritance.Heridity;
import Inheritance.Kids;
import Inheritance.Parent;
import Inheritance.Qualification;
import Inheritance.Student;
import Inheritance.Studies;

public class MainParentRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MainParentRunner");
		Parent parent=new Parent();
		Parent parent1=new Heridity();
		Parent parent2=new Children();
		Parent parent3=new Kids();
		Parent parent4=new Studies();
		Parent parent5=new Qualification();
		Parent parent6=new Student();
		parent.parentInfo();
		System.out.println(parent.name);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Heridity heridity=new Heridity();
		Heridity heridity1=new Children();
		Heridity heridity2=new Kids();
		Heridity heridity3=new Studies();
		Heridity heridity4=new Qualification();
		Parent heridity5=new Student();
		heridity.heridityInfo();
		System.out.println(heridity.activity);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Children children=new Children();
		Children children1=new Kids();
		Children children2=new Studies();
		Children children3=new Qualification();
		Children children4=new Student();
		children.childrenInfo();
		System.out.println(children.character);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Kids kids=new Kids();
		Kids kids1=new Studies();
		Kids kids2=new Qualification();
		Kids kids3=new Student();
		kids.kidsInfo();
		System.out.println(kids.age);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Studies studies=new Studies();
		Studies studies1=new Qualification();
		Studies studies2=new Student();
		studies.studiesInfo();
		System.out.println(studies.duration);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Qualification qualification=new Qualification();
		Qualification qualification1=new Student();
		qualification.qualificationInfo();
		System.out.println(qualification.ratings);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Student student=new Student();
		student.studiesInfo();
		System.out.println(student.education);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");









	}

}
