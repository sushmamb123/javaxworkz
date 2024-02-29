package com.xworkz.jdbcpro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CollegeUpdatePreparedStaement {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/jdbc";
		String userName = "root";
		String password = "Xworkzodc@123";
		String updateQuery = "update college_info set college_name = ? where location=?";
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(jdbcUrl, userName, password);
			pstmt = conn.prepareStatement(updateQuery);
			pstmt.setString(1, "PESITM");
			pstmt.setString(2, "shivamogga");
			pstmt.execute();

			pstmt.setString(1, "JNNCE");
			pstmt.setString(2, "shimoga");
			pstmt.execute();

			pstmt.setString(1, "RV");
			pstmt.setString(2, "Bangalore");
			pstmt.execute();

			pstmt.setString(1, "CGM");
			pstmt.setString(2, "kashmir");
			pstmt.execute();

			pstmt.setString(1, "BITS");
			pstmt.setString(2, "panaji");
			pstmt.execute();

			System.out.println("Updated the Record.....");

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
