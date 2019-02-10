package main;
import controllers.MainController;
import connection.Connect;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Rubzer
 */

public class Library {
    
    private static Connection connection = null;
            
    public static void main(String[] args) {
        try{
            connection = new Connect().getConnection();
            MainController controller = new MainController(connection);
        }
        catch(SQLException e){
            System.out.print(e);
        }  
        
    }
}
