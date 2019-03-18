package org.vms.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Database {
	public static ResultSet result;
	public static Connection conn;
	public static Statement stmt;
	public static ResultSetMetaData rsmd;

	public static void dataBaseConnection(String sqlQuery) {
		conn = null;
		String url = "jdbc:postgresql://192.168.0.116:5432/vmsdbqa";
		String un = "postgres";
		String pwd = "";
		try {
			Class.forName("org.postgresql.Driver").newInstance();
			conn = DriverManager.getConnection(url, un, pwd);
			stmt = conn.createStatement();
			result = stmt.executeQuery(sqlQuery);
			result.next();
			// rsmd=result.getMetaData();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (conn != null) {
				conn = null;
			}
		}
		// return rsmd;
	}
}
