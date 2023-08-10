package com.encapsulation.main;

import com.encapsulation.in.YouTube;

public class YouTubeRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in YouTubeRunner");
		YouTube youTube = new YouTube();
		youTube.setType(15);
		System.out.println("Type is:" + youTube.getType());
		youTube.setVesrion(1.6f);
		System.out.println("Vesion is:" + youTube.getVersion());
		youTube.setNoOfProperties(10);
		System.out.println("Properties is:" + youTube.getNoOfProperties());
		youTube.setFormat("Video Size");
		System.out.println("Format is:" + youTube.getFormat());
		youTube.setUpdates(true);
		System.out.println("Updates is:" + youTube.isUpdates());
		youTube.setPrivacy(true);
		System.out.println("privacy is:" + youTube.isPrivacy());
		youTube.setAdvantage("User Friendly");
		System.out.println("Advantages is:" + youTube.getAdvantage());
		youTube.setNoOfUsers(100);
		System.out.println("Number of Users is:" + youTube.getNoOfUsers());
		youTube.setSafe(false);
		System.out.println("YouTube is:" + youTube.isSafe());
		youTube.setChannelName("Music Hub");
		System.out.println("Channel Name is:" + youTube.getChannelName());
		youTube.setSubscribers(12);
		System.out.println("Subscribers is:" + youTube.getSubscribers());
		youTube.setUserName("Sushma");
		System.out.println("User Name is:" + youTube.getUserName());
		youTube.setPassword(true);
		System.out.println("Password is:" + youTube.isPassword());
		youTube.setInventor("Chad Hurley");
		System.out.println("Inventor Name is:" + youTube.getInventor());

	}

}
