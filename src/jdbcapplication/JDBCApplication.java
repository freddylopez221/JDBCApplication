/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcapplication;


import java.sql.*;
/**
 *
 * @author lopz
 */
public class JDBCApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println ("Carga Exitosa");
        
            String url = "jdbc:postgresql://localhost/isma1234?user=lopz&password=fe6efc";
            Connection conn = DriverManager.getConnection(url);
            System.out.println ("Conexion Realizada");
            Statement st = conn.createStatement();
            st.execute("insert into " + " itse (nombre,paterno,materna,sexo)" +
            "values ('Fredyyyy','Lopezzzzz','Damiannnn','Masculinoooo')");
            conn.close();
            
        }catch (ClassNotFoundException ex) {
            System.out.println ("Error: controlador!");
            System.exit(1);        
        } catch (SQLException ex) {
            System.out.println("Error: Conexion");
            ex.printStackTrace();
        }
        // TODO code application logic here
    }
    
}
