package com.encapsulation.main;

import com.encapsulation.in.Netflix;

public class NetflixRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in NetflixRunner");
		Netflix netflix = new Netflix();
		netflix.setType("OTT platform");
		netflix.setAvailableInLanguages(99);
		netflix.setListOfLanguages("arabic,catalan,chinese,english,french etc");
		netflix.setHeadquarters("Los Gatos,California,U.S");
		netflix.setCountryOfOrigin("United States");
		netflix.setAreaServed("Worldwide,except china,north korea, russia and syria");
		netflix.setParent("Netflix,Inc");
		netflix.setUrl("www.netflix.com");
		netflix.setCommercial(true);
		netflix.setreRistration("Required");
		netflix.setUsers(238.39);
		netflix.setFounded("January 16,2007");
		netflix.setcurrentStatus("Active");
		netflix.setCeo("Reed Hastings");
		System.out.println("type is :" + netflix.getType());
		System.out.println("Available In Languages in :" + netflix.getAvailableInLanguages());
		System.out.println("List Of Languages are :" + netflix.getListOfLanguages());
		System.out.println("Headquarters in :" + netflix.getHeadquarters());
		System.out.println("Country Of Originis :" + netflix.getCountryOfOrigin());
		System.out.println("AreaServed :" + netflix.getAreaServed());
		System.out.println("Parent is :" + netflix.getParent());
		System.out.println("Url is :" + netflix.getUrl());
		System.out.println("Commercial :" + netflix.getCommercial());
		System.out.println("Registration is :" + netflix.getRegistration());
		System.out.println("Users is :" + netflix.getUsers());
		System.out.println("Founded in :" + netflix.getFounded());
		System.out.println("Ceo is :" + netflix.getCeo());

	}

}
