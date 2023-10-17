package com.xworkz.weapons.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/view",loadOnStartup = 2)
public class WeaponResource extends HttpServlet{
	public WeaponResource() {
		System.out.println("Creating a WeaponResource..");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running in Weapon Resource..");
		String Name=req.getParameter("name");
		String MadeBy=req.getParameter("madeBy");
		String Price=req.getParameter("price");
		String Type=req.getParameter("type");
		System.out.println("Weapon Name is:"+Name);
		System.out.println("MadeBy:"+MadeBy);
		System.out.println("Price:"+Price);
		System.out.println("Type:"+Type);
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
				+ "      <a href=\"weapon.html\">Weapon</a>\r\n"
				+ "  \r\n"
				+ "  </nav>\r\n"
				+ "    <h1>Weapon information</h1>\r\n"
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
				+ "</html>Weapon is saved successfully");
		writer.print("</br>\n Weapon Name is:"+Name);
		writer.print("</br>\n MadeBy:"+MadeBy);
		writer.print("</br>\n Price:"+Price);
		writer.print("</br>\n Type:"+Type);
		writer.print(" <script\r\n"
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
				+ "</html>");
		}

}



