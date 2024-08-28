package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//getConnection(url,un,psw)
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "1234");
		
		//Transaction
		
		//------------------- insert sql ------------------------------
//		//a. write sql
//		  String sql = "insert into user(username,password)values('admin','ad3456')";
//		//b. create statements
//		  Statement  stm  = con.createStatement();
//		//c. execute sql
//		  stm.execute(sql);
//		//d. close db
//		  con.close();
//		  
//		  System.out.println("success");
		
		
	//---------------------- select sql ------------------------------
//		String sql = "select * from user";
//		Statement stm = con.createStatement();
//		ResultSet  rows = stm.executeQuery(sql);
//		
//		while(rows.next()) {
//			System.out.println("Id = "+rows.getInt("id"));
//			System.out.println("UserName = "+rows.getString("username"));
//			System.out.println("Password = "+rows.getString("password"));
//			System.out.println("------------");
//		}
//		
//		con.close();
		
		//------------------- update sql ------------------------------------
		
//		String sql = "update user set  password = 'mmm444' where id = 3  ";
//		Statement stm = con.createStatement();
//		stm.execute(sql);
//		
//		con.close();
//		System.out.println("success");
		
		//---------------------- delete sql ----------------------------------
		String sql = "delete from user where id = 2";
		Statement stm = con.createStatement();
		stm.execute(sql);
		con.close();
		System.out.println("success");
		
	}

}
