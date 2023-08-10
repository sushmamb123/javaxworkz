package com.encapsulation.main;

import com.encapsulation.in.Cred;

public class CredRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in CredRunner");
		Cred cred = new Cred();
		cred.setType("private");
		cred.setIndustry("Financial service");
		cred.setFounded("2018");
		cred.setFounder("Kunal Shah");
		cred.setHeadquarters("Bangalore,India");
		cred.setRevenue(393);
		cred.setNetIncome(-1279);
		cred.setNumberOfEmployees(800);
		cred.setWebsite("cred.club");
		cred.setMarketingYear("2020-2023");
		cred.setProvides("short term credit lines");
		cred.setUsers(11.2);
		cred.setAreaServed("India");
		cred.setCeo("Kunal Shah");
		System.out.println("type is :" + cred.getType());
		System.out.println("industry is :" + cred.getIndustry());
		System.out.println("Founded in :" + cred.getFounded());
		System.out.println("Founder are :" + cred.getFounder());
		System.out.println("Headquarters in :" + cred.getHeadquarters());
		System.out.println("Revenue in crors :" + cred.getRevenue());
		System.out.println("NetIncome in crors :" + cred.getNetIncome());
		System.out.println("NumberOfEmployees :" + cred.getNumberOfEmployees());
		System.out.println("Website is :" + cred.getWebsite());
		System.out.println("MarketingYear is :" + cred.getMarketingYear());
		System.out.println("Provides is :" + cred.getProvides());
		System.out.println("Users is :" + cred.getUsers());
		System.out.println("AreaServed :" + cred.getAreaServed());
		System.out.println("Ceo is :" + cred.getCeo());
	}
}
