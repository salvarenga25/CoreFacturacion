/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genfactura;

/**
 *
 * @author Guara
 */

import com.mysql.jdbc.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class NewClass {


    public static void main(String [] args) throws Exception {
     Connection conn = null;
try {
    // db parameters
    String url       = "jdbc:mysql://localhost:3306/factura2023?allowPublicKeyRetrieval=true&useSSL=false";
    String user      = "root";
    String password  = "superiker2435";
	
    // create a connection to the database
    conn = DriverManager.getConnection(url, user, password);
    System.out.println("Success!");
    
} catch(SQLException e) {
   System.out.println(e.getMessage());
} finally {
	try{
           if(conn != null)
             conn.close();
	}catch(SQLException ex){
           System.out.println(ex.getMessage());
	}
}
    }
}

