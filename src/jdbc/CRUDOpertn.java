package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDOpertn 
{
public void conncetion() throws SQLException, ClassNotFoundException
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/campus", "root","Mayur@123");
	Statement ps=con.createStatement();
	String s1="select * from Student";
	ResultSet rs=ps.executeQuery(s1);
	while(rs.next())
	{
		System.out.println();
		System.out.println("Roll Number:"+rs.getInt(1));
		System.out.println("Name:"+rs.getString(2));
		System.out.println("Marks:"+rs.getInt(3));
	}
}
	public void InsertData() throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/campus", "root","Mayur@123");
		PreparedStatement ps=con.prepareStatement("insert into Student values(?,?,?)");
		ps.setInt(1,17);
		ps.setString(2,"Rohit");
		ps.setInt(4,92);
		ps.executeUpdate();
		System.out.println("Record Added Succesfully Inside Table Here:");
	}
	
	public void updateData() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/campus", "root","mysql123");
		PreparedStatement ps=con.prepareStatement("Update student set rolno=?,name=?? where marks=?");
		ps.setInt(1,18);
		ps.setString(2,"Gayatri");
		ps.setInt(3,88);
		ps.executeUpdate();
		System.out.println("Update Record succesfully Inside Table...");
	}
public void deledaData() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/campus", "root","Mayur@123");
		PreparedStatement ps=con.prepareStatement("Delete from student where marks=?");
		ps.setInt(1,90);
		ps.executeUpdate();
		System.out.println("Delete Record Succesfully Inside Table Here....");
	}

	public static void main(String[] args) throws ClassNotFoundException,SQLException
{
		CRUDOpertn  c1=new CRUDOpertn();
		c1.conncetion();
		//c1.InsertData();
		//c1.updateData();
		c1.deledaData();
	}
}

