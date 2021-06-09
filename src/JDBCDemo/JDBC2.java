package JDBCDemo;

import java.sql.*;

public class JDBC2 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1. loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. creating connection
        String user ="root";
        String pass ="root";
        String url = "jdbc:mysql://localhost:3306/ganesh";

        Connection con = DriverManager.getConnection(url,user,pass);

        // 3. creating statement
        Statement st = con.createStatement();

        // 4. execute query (DDL - select)

        String sql = "select * from student";

        ResultSet rs = st.executeQuery(sql);

        while(rs.next())
        {
            System.out.print(rs.getInt("id")+" ");
            System.out.print(rs.getString("name")+" ");
            System.out.print(rs.getString("branch")+" ");
            System.out.print(rs.getInt("marks")+" ");
           // System.out.print(rs.getString("division"));
            System.out.println();
        }
        
        
        // 5. closing connections
        st.close();
        con.close();


    }
}
