package com.xwork.abstraction.runner;

import com.xwork.abstractions.Degree;
import com.xwork.abstractions.Education;

public class EducationRunner {


	public static void main(String[] args) {
		System.out.println("invoking main in EducationRunner");
		Education education=new Degree();
		education.activities();
		education.Carrer();
		education.college();
		education.confidence();
		education.destiny();
		education.exams();
		education.job();
		education.result();
		education.transfer();
		education.primary();
	

}
}
