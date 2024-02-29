package com.xworkz.jdbcpro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CollegePreparedStatement {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/jdbc";
		String userName = "root";
		String password = "Xworkzodc@123";
		Connection conn = null;
		PreparedStatement pstmt = null;
		String insertQuery = "INSERT INTO college_info(id,college_name,rating ,location,state) VALUES (?,?,?,?,?)";

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(jdbcUrl, userName, password);
			pstmt = conn.prepareStatement(insertQuery);
			pstmt.setInt(1, 1);
			pstmt.setString(2, "Pesitm");
			pstmt.setInt(3, 4);
			pstmt.setString(4, "shivamogga");
			pstmt.setString(5, "karnataka");
			pstmt.execute();

			pstmt.setInt(1, 2);
			pstmt.setString(2, "BIET");
			pstmt.setInt(3, 6);
			pstmt.setString(4, "Davanagere");
			pstmt.setString(5, "karnataka");
			pstmt.execute();

			pstmt.setInt(1, 3);
			pstmt.setString(2, "RIT");
			pstmt.setInt(3, 5);
			pstmt.setString(4, "Hassan");
			pstmt.setString(5, "Tamil Nadu");
			pstmt.execute();

			pstmt.setInt(1, 4);
			pstmt.setString(2, "jnnce");
			pstmt.setInt(3, 3);
			pstmt.setString(4, "shimoga");
			pstmt.setString(5, "karnataka");
			pstmt.execute();

			pstmt.setInt(1, 5);
			pstmt.setString(2, "rv");
			pstmt.setInt(3, 7);
			pstmt.setString(4, "Bangalore");
			pstmt.setString(5, "karnataka");
			pstmt.execute();

			pstmt.setInt(1, 6);
			pstmt.setString(2, "IIT");
			pstmt.setInt(3, 8);
			pstmt.setString(4, "madras");
			pstmt.setString(5, "Uttar Pradesh");
			pstmt.execute();

			pstmt.setInt(1, 7);
			pstmt.setString(2, "venkateshwara");
			pstmt.setInt(3, 6);
			pstmt.setString(4, "vishakapatanam");
			pstmt.setString(5, "Andhra Pradesh");
			pstmt.execute();

			pstmt.setInt(1, 8);
			pstmt.setString(2, "cgm");
			pstmt.setInt(3, 7);
			pstmt.setString(4, "kashmir");
			pstmt.setString(5, "jammu Kashmir");
			pstmt.execute();

			pstmt.setInt(1, 9);
			pstmt.setString(2, "vtu");
			pstmt.setInt(3, 9);
			pstmt.setString(4, "belgaum");
			pstmt.setString(5, "karnataka");
			pstmt.execute();

			pstmt.setInt(1, 10);
			pstmt.setString(2, "Bits");
			pstmt.setInt(3, 5);
			pstmt.setString(4, "panaji");
			pstmt.setString(5, "goa");

			pstmt.execute();

			System.out.println("Inserted the Record.....");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			System.out.println("Closing the Costly Resources....");
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
}

