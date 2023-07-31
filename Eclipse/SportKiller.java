package unique.com.acer.book;

import unique.com.acer.Area;
import unique.com.acer.Building;
import unique.com.acer.Corporator;
import unique.com.acer.Floor;
import unique.com.acer.HomeTown;
import unique.com.acer.Lift;
import unique.com.acer.Player;
import unique.com.acer.Sport;

public class SportKiller {

	public static void main(String[] args) {
		System.out.println("Running main in SportKiller");

		String name="Cricket";

		Lift lift=new Lift(1);
		Lift lift1=new Lift(2);

		Lift[] lifts= {lift,lift1};

		Floor floor=new Floor("Fisrt Floor",1);
		Floor floor1=new Floor("Second Floor",2);
		Floor floor2=new Floor("Third Floor",3);
		Floor floor3=new Floor("Fourth Floor",4);
		Floor floor4=new Floor("Fifth Floor",5);
		Floor floor5=new Floor("Sixth Floor",6);
		Floor floor6=new Floor("Seventh Floor",7);

		Floor[] floors= {floor,floor1,floor2,floor3,floor4,floor5,floor6};


		Building building=new Building(floors,lifts);
		Building building1=new Building(floors,lifts);

		Building[] buildings= {building,building1};

		Corporator corporator=new Corporator("Laxmi",buildings);

		Area area=new Area("Bangalore",corporator);
		Area area1=new Area("Mangalore",corporator);
		Area area2=new Area("Mysore",corporator);
		Area area3=new Area("Chennai",corporator);
		Area area4=new Area("Delhi",corporator);


		Area[] areas= {area,area1,area2,area3,area4};

		HomeTown town=new HomeTown("Bangalore",58741d,areas);

		Player player=new Player("Virat",10,town,building);
		Player player1=new Player("Sachin",20,town,building1);

		Player[] players= {player,player1};


		Sport sport=new Sport(name,players);
		sport.printInfo();

	}



	}


