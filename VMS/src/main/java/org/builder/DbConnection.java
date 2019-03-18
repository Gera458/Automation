package org.builder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {

	static final String JDBC_DRIVER = "org.postgresql.Driver";
	static final String DB_URL = "jdbc:postgresql://192.168.0.116:5432/vmsdbqa";

	static final String USER = "postgres";
	static final String PASS = "postgres";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {

			Class.forName("org.postgresql.Driver");

			System.out.println("Connecting to a selected database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected database successfully...");

			System.out.println("Creating statement...");
			stmt = conn.createStatement();

			String db = "select * from vms_acl_role_type";
			ResultSet rs = stmt.executeQuery(db);

			System.out.println("Count the no of rows:");

			int count = 0;
			while (rs.next()) {

				int id = rs.getInt(1);

				String role_type_code = rs.getString(2);
				String role_type_name = rs.getString(3);

				System.out.println(++count + "\t" + id + "\t" + role_type_code + "\t" + role_type_name);

				// System.out.println("ID: " + id);
				// System.out.println(" Status: " + status_id);
				// System.out.print(", role_type_code: " + role_type_name );
				// System.out.println(", Last: " + last);
			}
			// rs.close();
		} catch (SQLException se) {

			se.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		System.out.println("Done");
	}
}
