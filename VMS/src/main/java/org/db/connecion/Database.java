package org.db.connecion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database 
{
	public static void main(String []args)
	{
	Connection();
}

	private static void Connection() {
		Connection conn=null;
		String url="jdbc:postgresql://192.168.0.116:5432/vmsdbqa";
		String un="postgres";
		String pwd="";
		
		
		try
		{
			Class.forName("org.postgresql.Driver").newInstance();
			conn=DriverManager.getConnection(url, un, pwd);
			String sqlQuery="select * from vms_acl_role_type ";
			Statement stmt=conn.createStatement();
			ResultSet result=stmt.executeQuery(sqlQuery);
			
			//result.next();
			while (result.next())
			{
			System.out.println(result.getString("role_type_name"));
			//System.out.println(result.getString("mba_name"));
			//System.out.println(result.getString("mba_abbr"));
			//System.out.println(result.getString("mba_id"));
			}	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			if(conn!=null)
			{
				conn=null;
			}	
		}
	}
}
