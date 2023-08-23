package com.xwork.inter.run;

import com.xwork.inter.Enginner;
import com.xwork.inter.MetroRule;
import com.xwork.inter.Military;
import com.xwork.inter.PG;
import com.xwork.inter.TempleRules;
import com.xwork.inter.app.AnjaneyaTemple;
import com.xwork.inter.app.EnginnerStudent;
import com.xwork.inter.app.HostelPg;
import com.xwork.inter.app.MetroTrain;
import com.xwork.inter.app.NavyMilitary;

public class MetroRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MetroRunner");
		MetroRule metro = new MetroTrain();
		metro.run("Namma Metro");
		metro.speed(45);
		metro.stop();
		System.out.println("****************************");
		System.out.println("invoking main in TempleRunner");
		TempleRules rule = new AnjaneyaTemple();
		rule.dress("ethnic");
		rule.photo();
		rule.fees(100);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("invoking main in Pg");
		PG pg = new HostelPg();
		pg.name("SJR");
		pg.food(false);
		pg.payment(6000);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("invoking main in Enginner");
		Enginner stu = new EnginnerStudent();
		stu.attendance(10);
		stu.branch("EEE");
		stu.regular();
		System.out.println("****************************");
		System.out.println("invoking main in Military");
		Military mil = new NavyMilitary();
		mil.name("Scout");
		mil.age(25);
		mil.weapon("AKM");
	}

}
