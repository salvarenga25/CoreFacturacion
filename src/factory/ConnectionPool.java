/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.activation.DataSource;

/**
 *
 * @author luis_
 */
public class ConnectionPool {
     public static Connection obtenerConexion(String fuente) throws SQLException{
        //DataSource ds=null;
        Connection conexion=null;
        try{
           // Class.forName("com.mysql.cj.jdbc.Driver")
          //  DriverManager.registerDriver(new com.mysql.jdbc.Driver()); //Argregar esto: allowPublicKeyRetrieval=true&useSSL=false si la conexion es bateada
           String url       = "jdbc:mysql://localhost:3306/factura2023?allowPublicKeyRetrieval=true&useSSL=false";
           String user      = "root";
           String password  = "superiker2435";
            conexion = DriverManager.getConnection (
                url,user, password);
     
        }catch(Exception ex){
            throw new SQLException(ex);
        }
        return conexion;
    }
    public static Connection obtenerConexionMysql() throws SQLException{
        return obtenerConexion("jdbc/genxml");
    }
    
    public static void closeConexion(Connection conexion) {
        try {
            if (conexion != null) {
                conexion.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
