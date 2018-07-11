
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaConexao {
    
    public static Connection abreConexao(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(
            "jdbc:mysql://localhost/revisao","root","root");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
