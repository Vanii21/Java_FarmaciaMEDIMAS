
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexionBD {
    Connection con;
    String url = "jdbc:oracle:thin:@localhost:1521:vanii";
    String user = "vanii";
    String password = "123456";
    
    public Connection conectar(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "Base de datos conectada");
        } catch (Exception e) {
        }
        
        return con;
    }
}
