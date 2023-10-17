package com.xworkz.player.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/player",loadOnStartup = 1)
public class PlayerResource extends HttpServlet{
	public PlayerResource() {
		System.out.println("creating playerResorce");	
		}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("running in playerResource");
	String name=req.getParameter("playerName");
	String sports=req.getParameter("sports");
	String place=req.getParameter("place");
	String experience=req.getParameter("exp");
	System.out.println(name);
	System.out.println(sports);
	System.out.println(place);
	System.out.println(experience);
	System.out.println("URL:"+req.getRequestURL());
	System.out.println("HTTP METHOD:"+req.getMethod());
	System.out.println("User Agent:"+req.getHeader("user-agent"));
	resp.setContentType("Text/plain");
	PrintWriter writer=resp.getWriter();
	writer.print(name + ","+ sports + ","+ place + ","+ experience + " is saved succesfully");
	


	}
	
	

}
