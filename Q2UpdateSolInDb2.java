package my.com.assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q2UpdateSolInDb2 {

	public static void main(String[] args) {
		final String DATA_BASE_DRIVER = "com.mysql.cj.jdbc.Driver";
		
		Statement stmt = null;
		Connection con = null;
		ResultSet rs = null;
		try {
			// load driver
			Class.forName(DATA_BASE_DRIVER);
			System.out.println("driver loaded");
			
			//connect to db
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/may5", "root", "Emids123");
			System.out.println("Connection established");
			// create stmt
			stmt = con.createStatement();
			System.out.println("stmt created");
			// execute stmt
//			rs = stmt.executeQuery("select *from emp");
			int updated = stmt.executeUpdate("update emp set salary=salary+(salary*0.1)");
			
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			
			if(updated!=0) {
				System.out.println("Total records updated : "+updated);
			}

			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			if(con!=null) {
				try {
					con.close();
					System.out.println("Con closed");
				}catch (Exception e) {
					// TODO: handle exception
					System.out.println("con closing exception");
				}
			}
			if(stmt!=null) {
				try {
					stmt.close();
					System.out.println("Stmt closed");
				}catch (Exception e) {
					// TODO: handle exception
					System.out.println("stmt closing exception");
				}
			}
			if(rs!=null) {
				try {
					rs.close();
					System.out.println("Rs closed");
				}catch (Exception e) {
					// TODO: handle exception
					System.out.println("Rs closing exception");
				}
			}
		}
		

	}

}
