package com.xworkz.match.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/cricket", loadOnStartup = 5)
public class MatchServlet extends HttpServlet {
	public MatchServlet() {
		System.out.println("Creating servlet in MatchServlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost in MatchServlet");
		String name = req.getParameter("name");
		String country = req.getParameter("country");
		String date = req.getParameter("date");
		String team1 = req.getParameter("team1");
		String team2 = req.getParameter("team2");
		String team1CName = req.getParameter("team1CName");
		String team2CName = req.getParameter("team2CName");
		String umpireName = req.getParameter("umpireName");
		String stadiumName = req.getParameter("stadiumName");
		String thirdUmpireName = req.getParameter("thirdUmpireName");
		String stadiumCapacity = req.getParameter("stadiumCapacity");

		MatchDTO play = new MatchDTO(name, country, date, team1, team2, team1CName, team2CName, umpireName, stadiumName,
				thirdUmpireName, stadiumCapacity);
		
		req.setAttribute("plays", play);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("MatchSuccess.jsp");
		dispatcher.forward(req, resp);

	}
}