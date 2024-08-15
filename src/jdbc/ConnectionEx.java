package jdbc;

import java.sql.*;
public class ConnectionEx
{
	public void connection() throws ClassNotFoundException, SQLException 
	{
	Class.forName("com.mysql.cj.jdbc.Driver");//registration done in driver class
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/campus","root","Mayur@123");
	Statement st=con.createStatement();
	String s1="select * from student";
	ResultSet rs=st.executeQuery(s1);
	while(rs.next())
	{
		System.out.println();
		System.out.println("Roll Number:"+rs.getInt(1));
		System.out.println("Name:"+rs.getString(2));
		System.out.println("Marks:"+rs.getInt(3));
	 }
}
public static void main(String[] args) throws ClassNotFoundException, SQLException 
{
	ConnectionEx c1=new ConnectionEx();
	c1.connection();
}
}
