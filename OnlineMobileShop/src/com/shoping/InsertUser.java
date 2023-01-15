package com.shoping;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertUser {

public static boolean Insertuser (RegisterUser registerUser) { //InsertUser changed 
		
		boolean f = false;
		

		try {
			// insert into DB
			// Create Connection
			ConnectTest connectionTest = new ConnectTest();
			Connection con = connectionTest.getConnectionDb();
			// SQL Query
			String s = "insert into user(Name,Username,Password) values(?,?,?)";
			// Prepared Statement
			PreparedStatement preparedStatement = con.prepareStatement(s);
			// set values of parameter
			preparedStatement.setString(1, registerUser.getName());
			preparedStatement.setString(2, registerUser.getUsername());
			preparedStatement.setString(3, registerUser.getPassword());
			// execute
			preparedStatement.executeUpdate();
			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		
		
	}
	
}
