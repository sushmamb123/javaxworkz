package com.xworkz.sorting.boot;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Stream;

import com.xworkz.sorting.dto.GameDTO;

public class Game {

	public static void main(String[] args) {
		System.out.println("invoking main in Game.....");
		GameDTO dto1 = new GameDTO(1, "cricket", 22, 100, LocalDate.of(2023, 11, 6), "India", "Australia",
				LocalTime.of(7, 45, 55));
		GameDTO dto2 = new GameDTO(2, "Boxing", 2, 250, LocalDate.of(2023, 12, 16), "K Harrington", "Bferreira",
				LocalTime.of(0, 25, 00));
		GameDTO dto3 = new GameDTO(3, "HandBall", 16, 150, LocalDate.of(2023, 6, 15), "France", "ROC",
				LocalTime.of(2, 15, 45));
		GameDTO dto4 = new GameDTO(4, "gymnastics", 2, 80, LocalDate.of(2023, 2, 15), "Italy", "Bulgaria",
				LocalTime.of(2, 45, 55));
		GameDTO dto5 = new GameDTO(5, "Cycling", 10, 150, LocalDate.of(2023, 12, 8), " kmithishall", "starikova",
				LocalTime.of(1, 15, 45));
		GameDTO dto6 = new GameDTO(6, "WaterPole", 20, 200, LocalDate.of(2023, 12, 8), "Serebia", "greece",
				LocalTime.of(1, 32, 45));
		GameDTO dto7 = new GameDTO(7, "Football", 22, 150, LocalDate.of(2023, 12, 8), "Getafu", "cadaz",
				LocalTime.of(6, 35, 58));
		GameDTO dto8 = new GameDTO(8, "Kabbadi", 16, 50, LocalDate.of(2022, 12, 12), "Bengaluru bulls",
				"Bangal worriors", LocalTime.of(1, 12, 46));
		GameDTO dto9 = new GameDTO(9, "Marathon", 10, 10, LocalDate.of(2021, 8, 8), "Ekipchoje", "Angeya",
				LocalTime.of(2, 8, 00));
		GameDTO dto10 = new GameDTO(10, "BasketBall", 10, 80, LocalDate.of(2021, 8, 9), "Us", "Japan",
				LocalTime.of(2, 30, 15));

		Stream.of(dto10, dto9, dto8, dto7, dto6, dto5, dto4, dto3, dto2, dto1).sorted()
				.forEach(s -> System.out.println(s));
		System.out.println("^^^^^^^^^^^^^^^^^^^sorting to id in asc order^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Comparator<GameDTO> game = (t1, t2) -> Integer.compare(t1.getId(), t2.getId());
		Stream.of(dto10, dto9, dto8, dto7, dto6, dto5, dto4, dto3, dto2, dto1).sorted(game)
				.forEach(s -> System.out.println(s));
		System.out.println("**********************sort by name in asc order*****************************");
		Comparator<GameDTO> game1 = (t1, t2) -> t1.getName().compareTo(t2.getName());
		Stream.of(dto10, dto9, dto8, dto7, dto6, dto5, dto4, dto3, dto2, dto1).sorted(game1)
				.forEach(s -> System.out.println(s));
		System.out.println("-------------------sort by name in desc order-----------------------");
		Comparator<GameDTO> game2 = (t1, t2) -> t2.getName().compareTo(t1.getName());
		Stream.of(dto10, dto9, dto8, dto7, dto6, dto5, dto4, dto3, dto2, dto1).sorted(game2)
				.forEach(s -> System.out.println(s));
		System.out.println("--------------------sort by points in asc----------------------------");
		Comparator<GameDTO> game3 = (t1, t2) -> Integer.compare(t1.getPoints(), t2.getPoints());
		Stream.of(dto10, dto9, dto8, dto7, dto6, dto5, dto4, dto3, dto2, dto1).sorted(game3)
				.forEach(s -> System.out.println(s));
		System.out.println("---------------------sort by points in desc---------------------------");
		Comparator<GameDTO> game4 = (t1, t2) -> Integer.compare(t2.getPoints(), t1.getPoints());
		Stream.of(dto10, dto9, dto8, dto7, dto6, dto5, dto4, dto3, dto2, dto1).sorted(game4)
				.forEach(s -> System.out.println(s));
		System.out.println("-------------------sort by name,points,eventdate in asc--------------------------");
		Comparator<GameDTO> name = (n1, n2) -> n1.getName().compareTo(n2.getName());
		Comparator<GameDTO> points = (p1, p2) -> Integer.compare(p1.getPoints(), p2.getPoints());
		Comparator<GameDTO> eventDate = (e1, e2) -> e1.getEventDate().compareTo(e2.getEventDate());
		Stream.of(dto10, dto9, dto8, dto7, dto6, dto5, dto4, dto3, dto2, dto1)
				.sorted(name.thenComparing(points).thenComparing(eventDate)).forEach(s -> System.out.println(s));
		System.out.println("-------------sort by duration,eventDate,id in desc--------------------------------");
		Comparator<GameDTO> duration = (d1, d2) -> d2.getDuration().compareTo(d1.getDuration());
		Comparator<GameDTO> eventD = (e1, e2) -> e2.getEventDate().compareTo(e1.getEventDate());
		Comparator<GameDTO> id = (t1, t2) -> Integer.compare(t2.getId(), t1.getId());
		Stream.of(dto10, dto9, dto8, dto7, dto6, dto5, dto4, dto3, dto2, dto1)
				.sorted(duration.thenComparing(eventD).thenComparing(id)).forEach(s -> System.out.println(s));
		System.out.println(
				"----------------------collect only duration in desc-----------------------------------------");
		Comparator<GameDTO> durations = (d1, d2) -> d2.getDuration().compareTo(d1.getDuration());
		Stream.of(dto10, dto9, dto8, dto7, dto6, dto5, dto4, dto3, dto2, dto1).sorted(durations)
				.forEach(s -> System.out.println("Duration of game:" + s.getDuration()));
		System.out.println("----------------collect only games--------------------------------");
		Comparator<GameDTO> names = (n1, n2) -> n1.getName().compareTo(n2.getName());
		Stream.of(dto10, dto9, dto8, dto7, dto6, dto5, dto4, dto3, dto2, dto1).sorted(names)
				.forEach(s -> System.out.println("game name:" + s.getName()));
		System.out
				.println("-----------------------collect only winners sort in desc----------------------------------");
		Comparator<GameDTO> winner = (n1, n2) -> n2.getWinner().compareTo(n1.getWinner());
		Stream.of(dto10, dto9, dto8, dto7, dto6, dto5, dto4, dto3, dto2, dto1).sorted(winner)
				.forEach(s -> System.out.println("game winner name:" + s.getWinner()));
		System.out.println("--------------------------collect only runnerup-----------------------------");
		Comparator<GameDTO> runnerUp = (n1, n2) -> n1.getRunnerUp().compareTo(n2.getRunnerUp());
		Stream.of(dto10, dto9, dto8, dto7, dto6, dto5, dto4, dto3, dto2, dto1).sorted(runnerUp)
				.forEach(s -> System.out.println("game ruunerUp name:" + s.getRunnerUp()));
		System.out.println("------------------------------find  game by name--------------------------------");
		Collection<GameDTO> dto = new ArrayList<GameDTO>();
		dto.add(dto1);
		dto.add(dto2);
		dto.add(dto3);
		dto.add(dto4);
		dto.add(dto5);
		dto.add(dto6);
		dto.add(dto7);
		dto.add(dto8);
		dto.add(dto9);
		dto.add(dto10);

		dto.stream().filter(gam -> gam.getName().contains("Football")).forEach(g -> System.out.println(g));
		System.out.println();

		System.out.println("------------find game by eventDate-----------");
		Collection<String> name3 = new ArrayList<String>();

		dto.stream().filter(g -> g.getEventDate().equals(LocalDate.of(2023, 11, 6)))
				.forEach(e -> name3.add(e.getName()));
		name3.forEach(g -> System.out.println(g));
		System.out.println();

		System.out.println("-----------find winner by game--------");
		dto.stream().filter(gam -> gam.getName().contains("cricket")).forEach(g -> System.out.println(g.getWinner()));
		System.out.println();

		System.out.println("-------- find points by game-----------");
		dto.stream().filter(gam -> gam.getName().contains("Kabbadi")).forEach(g -> System.out.println(g.getPoints()));
		System.out.println();
	}

}
