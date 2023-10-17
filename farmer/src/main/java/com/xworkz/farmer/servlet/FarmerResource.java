package com.xworkz.farmer.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/save",loadOnStartup = 2)

public class FarmerResource extends HttpServlet {
	public FarmerResource() {
		System.out.println("creating a FarmerResource.....");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running in Farmer Resource....");
		String name = req.getParameter("farmerName");
		String Area = req.getParameter("area");
		String SoilType = req.getParameter("soil");
		String CropType = req.getParameter("crop");
		String Fertilizer = req.getParameter("fertilizer");
		String Season = req.getParameter("season");
		String Investment = req.getParameter("investment");
		String profit = req.getParameter("profit");
		String RecordNo = req.getParameter("recordNo");
		System.out.println(name);
		System.out.println(Area);
		System.out.println(SoilType);
		System.out.println(CropType);
		System.out.println(Fertilizer);
		System.out.println(Season);
		System.out.println(Investment);
		System.out.println(profit);
		System.out.println(RecordNo);
		System.out.println("URL:"+req.getRequestURL());
		System.out.println("HTTP METHOD:"+req.getMethod());
		System.out.println("User Agent:"+req.getHeader("user-agent"));
		resp.setContentType("Text/plain");
		PrintWriter writer=resp.getWriter();
		writer.print(name + ","+ Area + ","+ SoilType + ","+ CropType + "," +Fertilizer+ ","+Season+ ","+ 
		 ","+Investment+ ","+profit+ ","+RecordNo+ ","+ " is saved succesfully");
		resp.setContentType("Text/html");
		PrintWriter writer1=resp.getWriter();
		writer.print("<html>");
		writer.print("<head>");
		writer.print("<title>");
		writer.print("</title>");
		writer.print("</head>");
		writer.print("<body>");
		writer.print("</body>");
		writer.print("</html>");

		


	}

}
