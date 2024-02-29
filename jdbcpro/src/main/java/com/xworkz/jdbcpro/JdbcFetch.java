package com.xworkz.jdbcpro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcFetch {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/jdbc_1";
		String userName = "root";
		String password = "Xworkzodc@123";
		String select="Select * from location where name='rajajinagar' ";
		

		try {
			Class.forName("com.mysql.jdbc.Driver");// it is a static method;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Establishing a connection");
		try {
			Connection con = DriverManager.getConnection(jdbcUrl, userName, password);
			System.out.println("Connection is successfull..");
			Statement sta = con.createStatement();
		ResultSet set=	sta.executeQuery(select);
		if(set.next()) {
			System.out.println("Result present in results set");
			System.out.println("Location name:"+set.getString("name"));
			System.out.println("city name:"+set.getString("city"));
			System.out.println("pincode:"+set.getInt("pincode"));
		}
			System.out.println("Data stored successfull...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
