package com.xworkz.email.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login", loadOnStartup = 3)
public class LoginServlet extends HttpServlet {
	public LoginServlet() {
		System.out.println("Creating login Servlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Runnning in Login Servlet...");
		String UserId = req.getParameter("userId");
		String Password = req.getParameter("password");
		

		if (UserId.equals("admin") && Password.equals("secret")) {
			req.setAttribute("UserId", UserId);
			RequestDispatcher dispatcher = req.getRequestDispatcher("LoginSuccess.jsp");
			dispatcher.forward(req, resp);

		} else {
			req.setAttribute("UserID", "Credential is not matching");
			RequestDispatcher dispatcher = req.getRequestDispatcher("Login.jsp");
			dispatcher.forward(req, resp);

		}

	}

}
