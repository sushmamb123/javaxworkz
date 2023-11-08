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

		System.out.println("-------------defalut sorting  to id--------------");
		Stream.of(dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted()
				.forEach(g -> System.out.println(g));
		System.out.println();

		System.out.println("-----------------sort by name in asc--------------");
		Comparator<GameDTO> name = (t1, t2) -> t1.getName().compareTo(t2.getName());
		Stream.of(dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(name)
				.forEach(g -> System.out.println(g));
		System.out.println();

		System.out.println("-----------------sort by name in desc----------");
		Comparator<GameDTO> name2 = (t1, t2) -> t2.getName().compareTo(t1.getName());
		Stream.of(dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(name2)
				.forEach(g -> System.out.println(g));
		System.out.println();

		System.out.println("------------------sort by points in asc---------------");
		Comparator<GameDTO> point = (t1, t2) -> Integer.compare(t1.getPoints(), t2.getPoints());
		Stream.of(dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(point)
				.forEach(g -> System.out.println(g));
		System.out.println();

		System.out.println("------------------sort by points in desc---------------");
		Comparator<GameDTO> point2 = (t1, t2) -> Integer.compare(t2.getPoints(), t1.getPoints());
		Stream.of(dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(point2)
				.forEach(g -> System.out.println(g));
		System.out.println();

		System.out.println("-------------sort by event date in asc---------------");
		Comparator<GameDTO> event = (t1, t2) -> t1.getEventDate().compareTo(t2.getEventDate());
		Stream.of(dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(event)
				.forEach(g -> System.out.println(g));
		System.out.println();

		System.out.println("-------------sort by event date in desc---------------");
		Comparator<GameDTO> event2 = (t1, t2) -> t2.getEventDate().compareTo(t1.getEventDate());
		Stream.of(dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(event2)
				.forEach(g -> System.out.println(g));
		System.out.println();

		System.out.println("-------------sort by name and  points in asc-------------");
		Stream.of(dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(name.thenComparing(point))
				.forEach(g -> System.out.println(g));
		System.out.println();

		System.out.println("--------------sort by name ,points and event date in asc---------");
		Stream.of(dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10)
				.sorted(name.thenComparing(point).thenComparing(event)).forEach(g -> System.out.println(g));
		System.out.println();

		System.out.println("--------------sort by duration, eventdate and Id in  desc----------");
		Comparator<GameDTO> dura = (t1, t2) -> t2.getDuration().compareTo(t1.getDuration());
		Comparator<GameDTO> id = (t1, t2) -> Integer.compare(t2.getId(), t1.getId());
		Stream.of(dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10)
				.sorted(dura.thenComparing(event2).thenComparing(id)).forEach(g -> System.out.println(g));
		System.out.println();

		System.out.println("-----------collect duration in desc-------------");
		Comparator<GameDTO> dura2 = (t1, t2) -> t2.getDuration().compareTo(t1.getDuration());
		Stream.of(dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(dura2)
				.forEach(g -> System.out.println(g.getDuration()));
		System.out.println();

		System.out.println("------------collect only game names--------------");
		Stream.of(dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted()
				.forEach(g -> System.out.println(g.getName()));
		System.out.println();

		System.out.println("---------collect only winners and sort in desc---------------");
		Comparator<GameDTO> winner = (t1, t2) -> t2.getWinner().compareTo(t1.getWinner());
		Stream.of(dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(winner)
				.forEach(g -> System.out.println(g.getWinner()));
		System.out.println();

		System.out.println("------------collect only runner up --------------");
		Stream.of(dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted()
				.forEach(g -> System.out.println(g.getRunnerUp()));
		System.out.println();

		System.out.println("-----------find game by name-------------");

		Collection<GameDTO> game = new ArrayList<GameDTO>();
		game.add(dto1);
		game.add(dto2);
		game.add(dto3);
		game.add(dto4);
		game.add(dto5);
		game.add(dto6);
		game.add(dto7);
		game.add(dto8);
		game.add(dto9);
		game.add(dto10);

		game.stream().filter(gam -> gam.getName().contains("Football")).forEach(g -> System.out.println(g));
		System.out.println();

		System.out.println("------------find game by eventDate-----------");
		Collection<String> name3 = new ArrayList<String>();

		game.stream().filter(g -> g.getEventDate().equals(LocalDate.of(2023, 8, 8)))
				.forEach(e -> name3.add(e.getName()));
		name3.forEach(g -> System.out.println(g));
		System.out.println();

		System.out.println("-----------find winner by game--------");
		game.stream().filter(gam -> gam.getName().contains("Cricket")).forEach(g -> System.out.println(g.getWinner()));
		System.out.println();

		System.out.println("-------- find points by game-----------");
		game.stream().filter(gam -> gam.getName().contains("Kabbadi")).forEach(g -> System.out.println(g.getPoints()));
		System.out.println();

	}
}