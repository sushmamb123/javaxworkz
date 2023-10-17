package com.xworkz.police.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/police",loadOnStartup = 2)
public class PoliceResource extends HttpServlet {
	public PoliceResource() {
		System.out.println("creating the PoliceResource");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running in PoliceResource......");
		String name=req.getParameter("stationName");
		String location=req.getParameter("location");
		String InspectorName=req.getParameter("inspectorName");
		String SIName=req.getParameter("siname");
		String HeadConstable=req.getParameter("headConstable");
		String AssistantCommissioner=req.getParameter("assistantCommissioner");
		String NoOfCells=req.getParameter("noOfCells");
		String PendingCases=req.getParameter("pendingCases");
		String painted=req.getParameter("painted");
		System.out.println("Name is:"+name);
		System.out.println("Location is:"+location);
		System.out.println("InspectorName is:"+InspectorName);
		System.out.println("SIName is:"+SIName);
		System.out.println("HeadConstable Name is:"+HeadConstable);
		System.out.println("AssistantCommissioner name is:"+AssistantCommissioner);
		System.out.println("number of cell is:"+NoOfCells);
		System.out.println("cells pending is:"+PendingCases);
		System.out.println("painted:"+painted);
		int convertedCellNo=Integer.parseInt(NoOfCells);
		int convertedPCases=Integer.parseInt(PendingCases);
		boolean convertedPainted=Boolean.parseBoolean(painted);
		resp.setContentType("Text/html");
		PrintWriter writer=resp.getWriter();
		writer.print("<!doctype html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "  <head>\r\n"
				+ "    <meta charset=\"utf-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
				+ "    <title>X-Workz</title>\r\n"
				+ "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" \r\n"
				+ "    integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" \r\n"
				+ "    crossorigin=\"anonymous\">\r\n"
				+ "  </head>\r\n"
				+ "  <body>\r\n"
				+ "  <nav class=\"navbar\" style=\"background-color:#e3f2fd;\">\r\n"
				+ "  <h2 class=\"text-white h4\">Xworkz</h2>\r\n"
				+ "      <a href=\"index.html\">Home</a><br>\r\n"
				+ "      <a href=\"police.html\">Police Station</a>\r\n"
				+ "  \r\n"
				+ "  </nav>\r\n"
				+ "    <h1>Police information</h1>\r\n"
				+ "   <script\r\n"
				+ "		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\"\r\n"
				+ "		integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\"\r\n"
				+ "		crossorigin=\"anonymous\"></script>\r\n"
				+ "	<script\r\n"
				+ "		src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js\"\r\n"
				+ "		integrity=\"sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r\"\r\n"
				+ "		crossorigin=\"anonymous\"></script>\r\n"
				+ "	<script\r\n"
				+ "		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js\"\r\n"
				+ "		integrity=\"sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+\"\r\n"
				+ "		crossorigin=\"anonymous\"></script>\r\n"
				+ "  </body>\r\n"
				+ "</html>Police information is saved successfully");
		writer.print("</br>\n Name is:"+name);
		writer.print("</br>\n Location is:"+location);
		writer.print("</br>\n InspectorName is:"+InspectorName);
		writer.print("</br>\n SIName is:"+SIName);
		writer.print("</br>\n HeadConstable Name is:"+HeadConstable);
		writer.print("</br>\n AssistantCommissioner name is:"+AssistantCommissioner);
		writer.print("</br>\n number of cell is:"+NoOfCells);
		writer.print("</br>\n cells pending is:"+PendingCases);
		writer.print("</br>\n painted:"+painted);
		
		if(convertedPCases>100) {
			writer.print("<span style=color:green></br>\n Too many cases pending</span>");
			}
		else {
			writer.print("<span style=color:red></br>\n less cases cases pending</span>");
		}
		if(convertedCellNo>5) {
			writer.print("<span style=color:green></br>\n Big Station</span>");
			}
		else {
			writer.print("<span style=color:red></br>\n Small Station</span>");
		}
		if(convertedPainted==true) {
			writer.print("<span style=color:green></br>\n Clean</span>");
			}
		else {
			writer.print("<span style=color:red></br>\n Dirty</span>");
		}
		

	}

}
