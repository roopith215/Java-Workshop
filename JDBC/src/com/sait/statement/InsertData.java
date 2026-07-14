package com.sait.statement;
import java.sql.*;
public class InsertData {

	public static void main(String[] args) {
		try {
			Connection c=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sait",
					"root","5232");
			Statement st=c.createStatement();
			st.executeUpdate(
					"insert into student(name,phone)values('aayush','45612345')");
		System.out.println("Data inserted");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
