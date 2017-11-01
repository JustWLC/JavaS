package game;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ct_2 {
public static void main(String[] args) throws ClassNotFoundException,SQLException {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spdb", "root", "987654321");
    String sql="select *from users where username='admin'";
    PreparedStatement ps=con.prepareStatement(sql);
    ResultSet rs=ps.executeQuery();
    while(rs.next()){
    	System.out.println(rs.getString("username"));
    }
	        
    
	}
	/*try{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Success loading Mysql Driver");
		
	}catch(Exception e){
		System.out.println("Error loading Mysql Driver");
		e.printStackTrace();
		
	}
	try{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "987654321");
		System.out.println("Success connect Mysql Server");
		String sql="select name from employees where id=2";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()){
			System.out.println(rs.getString("name"));
		}
		
	}catch(Exception e){
		System.out.println("get data error");
		e.printStackTrace();
		
	}
	
}*/
}
