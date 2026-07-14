package com.sait.ps;
import java.sql.*;
public class InsertData {

	public static void main(String[] args) {
		try {
			Connection c=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sait",
					"root","5232");
			PreparedStatement ps=c.prepareStatement(
							"insert into student(name,phone)values(?,?)");
			ps.setString(1,"amiy");
			ps.setString(2,"321654987");
			ps.executeUpdate();
		System.out.println("Data inserted");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
