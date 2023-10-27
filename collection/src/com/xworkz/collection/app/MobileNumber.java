package com.xworkz.collection.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MobileNumber {
	public static void main(String[] args) {
		Collection<Long> mobileNumber = new ArrayList();
		mobileNumber.add(9880345234l);
		mobileNumber.add(1234567890l);
		mobileNumber.add(8088107303l);
		mobileNumber.add(7412589632l);
		mobileNumber.add(1236547894l);
		mobileNumber.add(2301456897l);
		mobileNumber.add(4563217897l);
		mobileNumber.add(8523691478l);
		mobileNumber.add(7894561238l);
		mobileNumber.add(9887452216l);
		mobileNumber.add(1208945317l);
		mobileNumber.add(7845269871l);
		mobileNumber.add(6312049785l);
		mobileNumber.add(1598234891l);
		mobileNumber.add(5641238075l);
		mobileNumber.add(4561237891l);
		mobileNumber.add(9856231478l);
		mobileNumber.add(5648912301l);
		mobileNumber.add(8523697415l);
		mobileNumber.add(8974561234l);
		mobileNumber.add(2589746315l);
		mobileNumber.add(4512369785l);
		mobileNumber.add(9845621587l);
		mobileNumber.add(3564128795l);
		mobileNumber.add(4568912345l);
		mobileNumber.add(4569871234l);
		mobileNumber.add(8974561234l);
		mobileNumber.add(7894561235l);
		mobileNumber.add(4561217894l);
		mobileNumber.add(4562315648l);
		mobileNumber.add(8974562589l);
		
	System.out.println("Total mobile number:" + mobileNumber.size());
		Iterator<Long> iter = mobileNumber.iterator();
		while (iter.hasNext()) {
			Long value = iter.next();
			System.out.println("Mobile Number:" + value);
		}
		
		
		System.out.println("--------------------StateNames--------------------------");
		Collection<String> stateName = new ArrayList();
		stateName.add("Andhra Pradesh");
		stateName.add("Arunachal Pradesh");
		stateName.add("Assam");
		stateName.add("Bihar");
		stateName.add("Chhattisgarh");
		stateName.add("Goa");
		stateName.add("Gujarat");
		stateName.add("Haryana");
		stateName.add("Himachal Pradesh");
		stateName.add("Jammu and Kashmir");
		stateName.add("Jharkhand");
		stateName.add("Karnataka");
		stateName.add("Kerala");
		stateName.add("Madya Pradesh");
		stateName.add("Maharashtra");
		stateName.add("Manipur");
		stateName.add("Meghalaya");
		stateName.add("Mizoram");
		stateName.add("Nagaland");
		stateName.add("Odisha");
		stateName.add("Punjab");
		stateName.add("Rajasthan");
		stateName.add("Sikkim");
		stateName.add("Tamil Nadu");
		stateName.add("Telangana");
		stateName.add("Tripura");
		stateName.add("Uttar Pradesh");
		stateName.add("Uttarakhand");
		stateName.add("West Bengal");
		System.out.println("Total State :" + stateName.size());
		Iterator<String> iter1 = stateName.iterator();
		while (iter1.hasNext()) {
			String value = iter1.next();
			System.out.println("State Name:" + value);
		}
		System.out.println("-----------cities name------------");
		Collection<String> cities=new ArrayList<String>();
		cities.add("Mumbai");
		cities.add("Hyderabad");
		cities.add("Chennai");
		cities.add("Pune");
		cities.add("Bengaluru");
		cities.add("Kolkata");
		cities.add("Agra");
		cities.add("Delhi");
		cities.add("Surat");
		cities.add("Jaipur");
		cities.add("Kochi");
		cities.add("Lucknow");
		cities.add("New Delhi");
		cities.add("Madurai");
		cities.add("Mysuru");
		cities.add("Varanasi");
		cities.add("Patna");
		cities.add("Amritsar");
		cities.add("Indore");
		cities.add("Bhopal");


		System.out.println("total cities:"+cities.size());
		Iterator<String> iter3=cities.iterator();
		while(iter3.hasNext()) {
			String ref=iter3.next();
			System.out.println("cities name:"+ref);
		}
		System.out.println("------------laptop model names-------------");
		Collection<String> laptop=new ArrayList<String>();
		laptop.add("Hp Pavillion plus 16");
		laptop.add("Hp Pavillion plus 18");
		laptop.add("HP Envy(AI-powered)");
		laptop.add("Hp Victus 16");
		laptop.add("Hp omen 16");
		laptop.add("Hp Envy 17");
		laptop.add("Hp Chromebook 11a");
		laptop.add("Hp Probook 635 Aero G7");
		laptop.add("Hp Pavillion Gamming 16");
		laptop.add("Hp Dragonfly Folio G3");
		laptop.add("Lenova Thinkpad x1 carbon");
		laptop.add("Lenova Legin5 pro");
		laptop.add("Lenova Thinkpad x1 Extreme");
		laptop.add("Lenova Thinkpad x1 Nano");
		laptop.add("Lenovo Yoga 9i");
		laptop.add("Lenovo Yoga Book 9i");
		laptop.add("Lenova Legion Slim7");
		laptop.add("Lenova Ideapad Gaming 3");
		laptop.add("Lenova V14 G2-ITL");
		laptop.add("Lenova Ideapad Slim 5");
		laptop.add("Lenova Thinkpad E15");
		laptop.add("Lenova Yoga 7 Slim pro");
		laptop.add("Lenova Ideapad Duet 3");
		laptop.add("Lenova Ideapad Duet 7i");
		laptop.add("Lenova Yoga 6");
		laptop.add("Lenova Legin 5 pro");
		laptop.add("Lenova ThinkBook plus");
		laptop.add("Lenova NoteBook G575");
		laptop.add("Lenova Thinkpad P52");
		laptop.add("Lenova Thinkpad N23");
		laptop.add("Lenova Thinkpad T580 20L9");
		laptop.add("Lenova ChromeBook S330");
		laptop.add("Apple MacBook Air 15");
		laptop.add("Apple MacBook Pro 16-inch");
		laptop.add("Apple MacBook Pro 14-inch");
		laptop.add("Apple MacBook Pro MVVJ2LL");
		laptop.add("Apple MacBook Air MREA2HN/A");
		laptop.add("Apple MacBook Pro A1278");
		laptop.add("Apple MacBook Air MD760HN/B");
		laptop.add(" Inspiron 14 7430 2-in-1 Laptop");
		laptop.add("Inspiron Core 15");		
		laptop.add("Vostro 15 3520");
		laptop.add("Inspiron 16 5620");
		laptop.add("Inspiron 14 5430");
		laptop.add("G-Series 15 5520");
		laptop.add("Inspiron 16 plus");
		laptop.add("G-Series 15 5530");
		laptop.add("XPS 13 9315");
		laptop.add("Acer Notebook core i5");
		laptop.add("Acer Travelmate core i5");
		System.out.println("total laptop:"+laptop.size());
		Iterator<String> iter4=laptop.iterator();
		while(iter4.hasNext()) {
			String lap=iter4.next();
			System.out.println("laptop model name:"+lap);
		}


	}

}
