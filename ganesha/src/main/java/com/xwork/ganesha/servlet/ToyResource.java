package com.xwork.ganesha.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/toys", loadOnStartup = 2)

public class ToyResource extends HttpServlet {
	public ToyResource() {
		System.out.println("Creating ToyResource....");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running in toy resources....");
		String toyName = req.getParameter("toyName");
		String color = req.getParameter("color");
		String idealFor = req.getParameter("idealFor");
		String age = req.getParameter("minAge");
		String quantity = req.getParameter("quantity");
		System.out.println(toyName);
		System.out.println(color);
		System.out.println(idealFor);
		System.out.println(age);
		System.out.println(quantity);
	}

}
