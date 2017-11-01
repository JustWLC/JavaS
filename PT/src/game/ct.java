package game;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ct {
	//读取数据库数据
/*public  static void main(String[] args)throws ClassNotFoundException,SQLException{
	Connection con=JDBCTool.getConnection("jdbc:mysql://localhost:3306/db", "root", "987654321");
	PreparedStatement ps=con.prepareStatement("select *from employees where id=?");
	ps.setString(1, "3");
	ResultSet rs=ps.executeQuery();
	
	while(rs.next()){
	System.out.println(rs.getString("id"));
	}
	rs.close();
	ps.close();
	con.close();
	
}*/
	//向数据库插入数据
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		Connection con=JDBCTool.getConnection("jdbc:mysql://localhost:3306/db", "root","987654321");
		PreparedStatement ps=con.prepareStatement("insert into employees value('5','Mike','男' ,'2008-5-6','Market','null')");
		/*ps.setString(1, "5");
		ps.setString(2, "Mike");*/
		ps.executeUpdate();
		ps.close();
		con.close();
		
	}
}
