package com.xworkz.email.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/add",loadOnStartup = 2)
public class AddressServlet extends HttpServlet{
	public AddressServlet() {
		System.out.println("creating the AddressServlet....");	
		}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running in Address SErvlet...");
		String No = req.getParameter("no");
		String State = req.getParameter("state");
		String Street = req.getParameter("street");
		String Country = req.getParameter("country");
		String City = req.getParameter("city");
		LoginDTO dto=new LoginDTO(No,State,Street,Country,City);
		req.setAttribute("chandhu", "Address is saved successfully");
		RequestDispatcher dispatcher = req.getRequestDispatcher("Address.jsp");
		dispatcher.forward(req, resp);
		
		

	}

}
