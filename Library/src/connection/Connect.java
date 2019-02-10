package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Rubzer
 */

public class Connect{
    
    private String JDBC_DRIVER_CLASS = "com.mysql.jdbc.Driver";
    private String server = "jdbc:mysql://localhost:3306/biblioteca";
    private String user = "root";
    private String password = "";
    private static Connection connection = null;
    
    public Connect(){
        try{
            Class.forName(JDBC_DRIVER_CLASS);
            connection = DriverManager.getConnection(server, user, password);
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
