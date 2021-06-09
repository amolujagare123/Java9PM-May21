package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1. loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. creating connection
        String user ="root";
        String pass ="root";
        String url = "jdbc:mysql://localhost:3306/9batch";

        Connection con = DriverManager.getConnection(url,user,pass);

        // 3. creating statement
        Statement st = con.createStatement();

        // 4. execute query (DML - insert/update/delete)

        String sql = "insert into student values(1,'Amol', 'IT', 78,'A')";
        st.executeUpdate(sql);

        // 5. closing connections
        st.close();
        con.close();


    }
}
