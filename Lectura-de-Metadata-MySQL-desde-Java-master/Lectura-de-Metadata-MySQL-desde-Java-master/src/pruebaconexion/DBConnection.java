package pruebaconexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @description Connects to the DB.
 *
 * @author MindFusion LLC
 * @version 1.0 $Date: 11/09/2016
 */

public class DBConnection {

    public static Connection connection;
    
    public static Connection getConnection(String DB_URL,String DB_USER,String DB_PASSWORD) {
        
        try {
          connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
          System.err.println("The connection is successfully obtained");

        } catch(SQLException ex){

            System.err.println("error establishing connection");
        }
        
        return connection;
    }
    
    //CloseConexion
    public static Connection closeConnection(){
    
        try{
        
            connection.close();
        }catch(SQLException ex){
        
            System.err.println("Failed to close connection. Error: "+ex.getMessage());
        }
        return connection;
    }
}
