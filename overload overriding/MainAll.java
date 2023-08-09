package overriding.com.main;

import overriding.com.star.Bakery;
import overriding.com.star.BakeryInfo;
import overriding.com.star.Cafe;
import overriding.com.star.City;
import overriding.com.star.DigitalLibrary;
import overriding.com.star.GoldenTemple;
import overriding.com.star.Hassan;
import overriding.com.star.HassanCity;
import overriding.com.star.Hospital;
import overriding.com.star.Hostel;
import overriding.com.star.Hotel;
import overriding.com.star.Library;
import overriding.com.star.LuluMall;
import overriding.com.star.Mall;
import overriding.com.star.Market;
import overriding.com.star.MysoreZoo;
import overriding.com.star.NavarangTheater;
import overriding.com.star.Pg;
import overriding.com.star.PoliceStation;
import overriding.com.star.Pub;
import overriding.com.star.RailwayStation;
import overriding.com.star.Restorent;
import overriding.com.star.Shop;
import overriding.com.star.Street;
import overriding.com.star.Temple;
import overriding.com.star.Theater;
import overriding.com.star.VegetableMarket;
import overriding.com.star.Zoo;

public class MainAll {

	public static void main(String[] args) {
		System.out.println("invoking main in MainAll");
		System.out.println("****************************");
		Bakery bakery = new BakeryInfo();
		bakery.item();
		bakery.item(40);
		bakery.item(10, "Cake");
		bakery.item(20, "Cake", "Bangalore");
		bakery.item(30, "Cake", "Bangalore", false);
		bakery.item(60, "Cake", "Bangalore", false, 5);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");
		BakeryInfo bakery1 = new BakeryInfo();
		bakery1.item();
		bakery1.item(40);
		bakery1.item(10, "Cold Cake");
		bakery1.item(20, "Cold Cake", "Mysore");
		bakery1.item(30, "Cold Cake", "Mysore", true);
		bakery1.item(60, "Cold Cake", "Mysore", true, 5);

		System.out.println("================================");
		Hotel hotel = new Restorent();
		hotel.food();
		System.out.println("++++++++++++++++++++++");
		Restorent hotel1 = new Restorent();
		hotel1.food();
		System.out.println("**********************");
		Hospital hospital = new Shop();
		hospital.injection();

		Shop shop = new Shop();
		shop.injection();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Hostel hostel = new Pg();
		hostel.owner();

		Pg hostel1 = new Pg();
		hostel1.owner();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Mall mall = new LuluMall();
		mall.invite();

		LuluMall mall1 = new LuluMall();
		mall1.invite();

		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Theater theater = new NavarangTheater();
		theater.display();

		NavarangTheater theater1 = new NavarangTheater();
		theater1.display();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Library library = new DigitalLibrary();
		library.displyaInfo();
		DigitalLibrary library1 = new DigitalLibrary();
		library1.displyaInfo();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		Temple temple = new GoldenTemple();
		temple.pooja();
		GoldenTemple temple1 = new GoldenTemple();
		temple1.pooja();
		System.out.println("***********************************");
		Market market = new VegetableMarket();
		market.sell();

		VegetableMarket market1 = new VegetableMarket();
		market1.sell();
		System.out.println("********************************");
		Street street = new Hassan();
		street.landMark();
		Hassan street1 = new Hassan();
		street1.landMark();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Zoo zoo = new MysoreZoo();
		zoo.buyTicket();
		MysoreZoo zoo1 = new MysoreZoo();
		zoo1.buyTicket();
		System.out.println("**********************************");
		City city = new HassanCity();
		city.welcome();

		HassanCity city1 = new HassanCity();
		city1.welcome();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		Pub pub = new Cafe();
		pub.enjoy();
		Cafe pub1 = new Cafe();
		pub1.enjoy();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		PoliceStation police = new RailwayStation();
		police.arrest();
		RailwayStation police1 = new RailwayStation();
		police1.arrest();
		System.out.println("***********************************8");

	}
}
