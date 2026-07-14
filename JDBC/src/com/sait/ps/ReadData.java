package com.sait.ps;
import java.sql.*;

public class ReadData {

	public static void main(String[] args) {
		try {
			Connection c=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sait",
					"root","5232");
			PreparedStatement ps=c.prepareStatement("select * from student where name=?");
			ps.setString(1,"mehul");
			ResultSet rs=ps.executeQuery();
			int count=0;
			while(rs.next()) {
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("phone"));
			}
			if(count==0) {
				System.out.println("no record found!!");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}

	