package unique.com.acer.book;

import Inheritance.Branch;
import Inheritance.College;
import Inheritance.Designation;
import Inheritance.Education;
import Inheritance.Engineering;
import Inheritance.HighSchool;
import Inheritance.Name;
import Inheritance.Primary;

public class EducationRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in EducationRunner");
		
		Education education=new Education();
		Education education1=new Primary();
		Education education2=new HighSchool();
		Education education3=new College();
		Education education4=new Engineering();
		Education education5=new Branch();
		Education education6=new Name();
		Education education7=new Designation();
		education.educationInfo();
		System.out.println(education.name);
		System.out.println("++++++++++++++++++++++++++++");
		Primary primary=new Primary();
		Primary primary1=new HighSchool();
		Primary primary2=new College();
		Primary primary3=new Engineering();
		Primary primary4=new Branch();
		Primary primary5=new Name();
		Primary primary6=new Designation();
		primary.primaryInfo();;
		System.out.println(primary.age);
		System.out.println("-----------------------------------");
		HighSchool highSchool=new HighSchool();
		HighSchool highSchool1=new College();
		HighSchool highSchool2=new Engineering();
		HighSchool highSchool3=new Branch();
		HighSchool highSchool4=new Name();
		HighSchool highSchool5=new Designation();
		highSchool.highSchoolInfo();;
		System.out.println(highSchool.duration);

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		College college=new College();
		College college1=new Engineering();
		College college2=new Branch();
		College college3=new Name();
		College college4=new Designation();
		college.collegeInfo();;
		System.out.println(college.education);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Engineering engineering=new Engineering();
		Engineering engineering1=new Branch();
		Engineering engineering2=new Name();
		Engineering engineering3=new Designation();
		engineering.engineeringInfo();
		System.out.println(engineering.percentage);
		System.out.println("###########################");
		Branch branch=new Branch();
		Branch branch1=new Name();
		Branch branch2=new Designation();
		branch.branchInfo();
		System.out.println(branch.branchName);
		System.out.println("====================================");
		Name name=new Name();
		Name name1=new Designation();
		name.nameInfo();;
		System.out.println(name.branchName);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");
		Designation designation=new Designation();
		designation.designationInfo();;
		System.out.println(designation.exp);
		}




	}


