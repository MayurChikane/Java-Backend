package jdbc;

import java.sql.*;

public class JdbcConnect {

    public void connection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/campus", "root", "Mayur@123");
        Statement st = conn.createStatement();
        String s1 = "select * from student";
        ResultSet rs = st.executeQuery(s1);
        while (rs.next()) {
            System.out.println();
            System.out.println("Roll NO : " + rs.getInt(1));
            System.out.println("Name : " + rs.getString(2));
            System.out.println("Marks : " + rs.getInt(3));
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        JdbcConnect j = new JdbcConnect();
        j.connection();
    }
}
