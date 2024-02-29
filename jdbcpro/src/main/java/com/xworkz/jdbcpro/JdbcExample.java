package com.xworkz.jdbcpro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//mainprotocal:subprotocal
//load and register driver class
//connection with database
//create statement
//
//execute - ddl,dml,dql-return type boolean
//executeUpdate -dml-return type int,we can execute only dml queries
public class JdbcExample {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/jdbc_1";
		String userName = "root";
		String password = "Xworkzodc@123";

		try {
			Class.forName("com.mysql.jdbc.Driver");// it is a static method;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Establishing a connection");
		String query = "Insert into location(id,name,city,state,pincode)Values(1,'rajajinagar','Bangalore','karnataka',573120)";
		String query2 = "Insert into location(id,name,city,state,pincode)Values(2,'Palace','Mysore','karnataka',570001)";
		String query3 = "Insert into location(id,name,city,state,pincode)Values(3,'Hasanamba Temple','Hassan','karnataka',573201)";
		String query4 = "Insert into location(id,name,city,state,pincode)Values(4,'GateWayof India','Mumbai','Maharashtra',400001)";
		String query5 = "Insert into location(id,name,city,state,pincode)Values(5,'Cofee','Chikkmangaluru','karnataka',577101)";
		String query6 = "Insert into location(id,name,city,state,pincode)Values(6,'Redfort','Chandni chowk','Delhi',110006)";
		String query7 = "Insert into location(id,name,city,state,pincode)Values(7,'Maddutu','Mandya','karnataka',571404)";
		String query8 = "Insert into location(id,name,city,state,pincode)Values(8,'Taj mahal','Agra','UttarPradesh',223007)";
		String query9 = "Insert into location(id,name,city,state,pincode)Values(9,'Great wall of china','china','Northern china',630000)";
		String query10 = "Insert into location(id,name,city,state,pincode)Values(10,'Amber palace','Jaipur','Rajasthan',384265)";
		String query11 = "Insert into location(id,name,city,state,pincode)Values(11,'Hampi','Vijayanagar','karnataka',583239)";

		try {
			Connection con = DriverManager.getConnection(jdbcUrl, userName, password);
			System.out.println("Connection is successfull..");
			Statement sta = con.createStatement();
			sta.execute(query);
			sta.execute(query2);
			sta.execute(query3);
			sta.execute(query4);
			sta.execute(query5);
			sta.execute(query6);
			sta.execute(query7);
			sta.execute(query8);
			sta.execute(query9);
			sta.execute(query10);
			sta.execute(query11);

			System.out.println("Data stored successfull...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
