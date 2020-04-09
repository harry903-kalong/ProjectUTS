
package org.app.npm153.utility;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseUtility {
 private static Connection connection;
 
    static{
    MysqlDataSource ds = new MysqlDataSource();
    ds.setServerName("localhost");
    ds.setDatabaseName("Bengkel");
    ds.setUser("root");
    ds.setPassword("");
        try {
            connection = ds.getConnection();
        } catch (SQLException ex) {
            System.out.println("Error:"+ex.getMessage());
            Logger.getLogger(DatabaseUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
public static Connection getConnection(){
    return connection;   
}
}