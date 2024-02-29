package com.xworkz.jdbcpro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDelete {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/jdbc_1";
		String userName = "root";
		String password = "Xworkzodc@123";
		String delete = "delete from location where name='bangalore'";

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
			int ref = sta.executeUpdate(delete);
			
			System.out.println(ref);
			System.out.println("Data stored successfull...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
