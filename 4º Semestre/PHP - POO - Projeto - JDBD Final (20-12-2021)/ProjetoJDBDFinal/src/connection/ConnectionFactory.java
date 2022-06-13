
package connection;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/contato";//String de conexão JDBC
        String user = "root";
        String password = "";
            try {
                return (Connection) DriverManager.getConnection(url, user, password);
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }        
    }    

    public static void closeConnection(Connection conn){
        try{
            if (conn != null){
                conn.close();
            }
        }catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
   
    public static void closeConnection(Connection conn, Statement stmt){
        closeConnection(conn);
        try{
            if (stmt != null){
                stmt.close();
            }
        }catch(SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void closeConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

