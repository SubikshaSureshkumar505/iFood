package iFoodProject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * 
 * @author Kritika Gupta c0788050
 *
 */

public class UsersTable {
	
//	Method for checking if the user mail already exists 
	public static boolean existingMail(String email,Connection conn) {
		PreparedStatement stmt = null;
		ResultSet rst = null;
//		System.out.print("All Good1");
		try {
//			Selecting data from database table and checking if the entered email matches any
			stmt =conn.prepareStatement("Select * from register where email = ?");
			stmt.setString(1, email);
			
//			Storing the result
			rst = stmt.executeQuery();		
			
//			if result exists Than
			if(rst.next()) {
				
//				checking if the ResultSet has the same email address
				if(rst.getString("email").contentEquals(email)){
					return true;	//if yes then sending True as there is a match				
				}else {
					return false; //else false
				}
			}else {
				return false;
			}
		} 
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				stmt.close();
			}
			catch(SQLException s)
			{
				s.printStackTrace();
			}
		}
		return false;
	}
	
//	Method for User regisstration
	public static int RegisterRecord(String username, String email, String password, Connection conn)
	{
		
		PreparedStatement stmt = null;
		
		try {
//			sql for data insertion
			stmt =conn.prepareStatement("insert into register (name, email, password) values(?,?,?)");
			stmt.setString(1, username);
			stmt.setString(2, email);
			stmt.setString(3,password);
		
//			executind query
			int query_success = stmt.executeUpdate();
			
//		sending boolean true is the statement executed successfuly
			return query_success;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		finally {
			try {
				stmt.close();
			}
			catch(SQLException s)
			{
				s.printStackTrace();
			}
		}
		return 0;
		
		
	}
	
//	Method for checking login credentials of User with Database
	public static boolean loginPermissionRecord(String usermail, String password, Connection conn)
	{
		PreparedStatement stmt = null;
		ResultSet rst = null;
//		System.out.print("All Good1");
		try {
//			Select statement to find the user's login credentials in database if exists
			stmt =conn.prepareStatement("Select * from register where email = ?");
			stmt.setString(1, usermail);
			rst = stmt.executeQuery();		
			
//			if the query has the resultset
			if(rst.next()) {
//				System.out.print("All Good5");
//				Matching the user's email and password with the entered mail and password
				if(rst.getString("email").contentEquals(usermail) && rst.getString("password").contentEquals(password)){
					return true;		//if there is a match then it sends boolean true			
				}else {
					return false;	//else false
				}
			}else {
				return false;	// if there is no resultset in that case too it sends false
			}
		} 
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				stmt.close();
			}
			catch(SQLException s)
			{
				s.printStackTrace();
			}
		}
		return false;
	}
	
	public static void insertUsersRecord(String username, String password, String firstname, String lastname, Connection conn)
	{
		
		PreparedStatement stmt = null;
		
		try {
			stmt =conn.prepareStatement("insert into login (username, password, firstname, lastname) values(?,?,?,?)");
			stmt.setString(1, username);
			stmt.setString(2,password);
			stmt.setString(3, firstname);
			stmt.setString(4, lastname);
			
			stmt.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		finally {
			try {
				stmt.close();
			}
			catch(SQLException s)
			{
				s.printStackTrace();
			}
		}
		
		
	}
	

	public static void deleteUsersRecord(String username, String password, String firstname, String lastname, Connection conn)
	{
		
		PreparedStatement stmt = null;
		
		try {
			stmt =conn.prepareStatement("_________________________________");
			stmt.setString(1, " _______");
			stmt.setString(2,"   ______________");
			
			
			stmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			try {
				stmt.close();
			}
			catch(SQLException s)
			{
				s.printStackTrace();
			}
		}
		
		
	}
	
	public static void updateUsersRecord(String username, String password, String firstname, String lastname, Connection conn)
	{
		
		PreparedStatement stmt = null;
		
		try {
			stmt =conn.prepareStatement("_________________________________");
			stmt.setString(1, " _______");
			stmt.setString(2,"   ______________");
			
			
			stmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			try {
				stmt.close();
			}
			catch(SQLException s)
			{
				s.printStackTrace();
			}
		}
		
		
	}
	
	public static void getUsersRecord(String username, String password, String firstname, String lastname, Connection conn)
	{
		
		PreparedStatement stmt = null;
		
		try {
			stmt =conn.prepareStatement("_________________________________");
			stmt.setString(1, " _______");
			stmt.setString(2,"   ______________");
			
			
		//
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			try {
				stmt.close();
			}
			catch(SQLException s)
			{
				s.printStackTrace();
			}
		}
		
		
	}
	
	
}
