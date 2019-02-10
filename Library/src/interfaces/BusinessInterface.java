package interfaces;

import java.sql.SQLException;

/**
 * @author Rubzer
 */

public interface BusinessInterface {
    public void Insert() throws SQLException;
    public void Update() throws SQLException;
    public void Delete() throws SQLException;  
    public void Query() throws SQLException; 
}
