package com.xworkz.sorting.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.sorting.dto.RobotDTO;

public class Robot {

	public static void main(String[] args) {
		System.out.println("invoking in robot...");
		RobotDTO dto1 = new RobotDTO("Manufacturing", false, "Automation", 1.2f);
		RobotDTO dto2 = new RobotDTO("Packing", true, "Cobot", 0.8f);
		RobotDTO dto3 = new RobotDTO("Transport", false, "Humanoid", 1.3f);
		RobotDTO dto4 = new RobotDTO("Surgery", true, "Domestic", 2.3f);
		RobotDTO dto5 = new RobotDTO("Laboratory Research", false, "Swarm", 0.9f);

		Collection<RobotDTO> robot = new ArrayList<RobotDTO>();
		robot.add(dto1);
		robot.add(dto2);
		robot.add(dto3);
		robot.add(dto4);
		robot.add(dto5);

		System.out.println("Total number of robot:" + robot.size());
		for (RobotDTO robotDTO : robot) {
			System.out.println(robotDTO);

		}

		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

		robot.stream().sorted().forEach(r -> System.out.println(r));

	}

}
