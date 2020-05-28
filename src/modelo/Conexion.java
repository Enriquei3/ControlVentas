
package modelo;

import com.mysql.jdbc.*;
import java.sql.DriverManager;

/**
 *
 * @author Enrique Isales
 */
public class Conexion {
    Connection con;
    String url="jdbc:mysql://localhost:3306/bd_ventas";  
    String user="root";
    String pass="";
    
    public Connection Conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= (Connection) DriverManager.getConnection(url,user,pass);
            
            
        } catch (Exception e) {
            System.out.print("Conexion Error esta en "+e);
            
        }
        return con;
    }

    
    
  
   
}
