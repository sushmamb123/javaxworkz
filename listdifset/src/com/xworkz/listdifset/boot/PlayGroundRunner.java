package com.xworkz.listdifset.boot;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.listdifset.dto.PlayGroundDTO;

public class PlayGroundRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in playground runner");
		
		PlayGroundDTO dto = new PlayGroundDTO("swing", 10, 78.3f, "Bengaluru");
		PlayGroundDTO dto2 = new PlayGroundDTO("swing", 10, 78.3f, "Bengaluru");
		PlayGroundDTO dto3 = new PlayGroundDTO("Slide", 20, 103.4f, "Hassan");
		PlayGroundDTO dto4 = new PlayGroundDTO("Slide", 20, 103.4f, "Hassan");
		PlayGroundDTO dto5 = new PlayGroundDTO("Sandbox", 80, 86f, "Mysuru");
		PlayGroundDTO dto6 = new PlayGroundDTO("Monkey Bars", 86, 53f, "Chikkamagluru");
		PlayGroundDTO dto7 = new PlayGroundDTO("Jungle", 340, 8273f, "Battipura");

		Collection<PlayGroundDTO> play = new HashSet<PlayGroundDTO>();
		play.add(dto);
		play.add(dto2);
		play.add(dto3);
		play.add(dto4);
		play.add(dto5);
		play.add(dto6);
		play.add(dto7);

		System.out.println("total :" + play.size());

		System.out.println(play.stream().map(t -> t.getLocation()).collect(Collectors.toSet()).size());

	}

}
