package com.shoping;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectTest{
public Connection getConnectionDb() {
	   Connection connection=null;
	
	 try{
	Class.forName("com.mysql.jdbc.Driver");
	connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommercedb", "root", "root");
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	 return connection; 
	}
}
