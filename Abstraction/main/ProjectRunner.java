package com.xwork.abstraction.runner;

import com.xwork.abstractions.MainProject;
import com.xwork.abstractions.Project;

public class ProjectRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in ProjectRunner");
		Project project = new MainProject();
		project.list();
		project.model();
		project.instruments();
		project.name();
		project.phase1();
		project.report();
		project.synopsis();
		project.tittle();
		project.theme();
		project.working();
	}

}
