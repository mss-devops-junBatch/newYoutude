This is dev env...
This is updated file......

package com.velocity.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//register driver class
		Class.forName("com.mysql.jdbc.Driver");
//create connection
		String url = "jdbc:mysql://localhost:3306/empdb?characterEncoding=utf8";
		Connection connection = DriverManager.getConnection(url, "root", "root");
//create statement
		Statement statement = connection.createStatement();
//execute statement
		String sqlquery = "insert into sample(name,email)values('pranita','pranitakamthe95@outlook.com')";
		Boolean isInserted = statement.execute(sqlquery);
		System.out.println(isInserted);
	}
}
