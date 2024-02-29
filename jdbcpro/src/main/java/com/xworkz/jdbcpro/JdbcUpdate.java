package com.xworkz.jdbcpro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/jdbc_1";
		String userName = "root";
		String password = "Xworkzodc@123";
		String updateQuery1="UPDATE location set city='bangalore',state='karnataka' where name='Maddutu'";
		String updateQuery2="UPDATE location set city='hassan',state='Maharashtra' where name='rajajinagar'";
		String updateQuery3="UPDATE location set city='Mumbai',state='Delhi' where name='Hasanamba Temple'";
		String updateQuery4="UPDATE location set city='Chikkmangaluru',state='Rajasthan' where name='Taj mahal'";
		String updateQuery5="UPDATE location set city='Chandni chowk',state='UttarPradesh' where name='GateWayof India'";
		String updateQuery6="UPDATE location set city='Mandya',state='karnataka' where name='Palace'";
		String updateQuery7="UPDATE location set city='Agra',state='karnataka' where name='Redfort'";
		String updateQuery8="UPDATE location set city='china',state='Northern china' where name='Amber palace'";
		String updateQuery9="UPDATE location set city='Vijayanagar',state='Rajasthan' where name='Great wall of china'";
		String updateQuery10="UPDATE location set city='Jaipur',state='karnataka' where name='Hampi'";

		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Establishing a connection");
		try {
			Connection con = DriverManager.getConnection(jdbcUrl, userName, password);
			System.out.println("connection is successfulll...");
			Statement sta = con.createStatement();
			sta.executeUpdate(updateQuery1);
			sta.executeUpdate(updateQuery2);
			sta.executeUpdate(updateQuery3);
			sta.executeUpdate(updateQuery4);
			sta.executeUpdate(updateQuery5);
			sta.executeUpdate(updateQuery6);
			sta.executeUpdate(updateQuery7);
			sta.executeUpdate(updateQuery8);
			sta.executeUpdate(updateQuery9);
			sta.executeUpdate(updateQuery10);
			System.out.println("Updated data!!!!!!!!!!!!!!!!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
