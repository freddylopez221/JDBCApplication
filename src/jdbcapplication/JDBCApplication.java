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
            
        st.execute("INSERT INTO " + " itse (nombre,paterno,materna,sexo)" +
        "VALUES ('Fredyyyy','Lopezzzzz','Damiannnn','Masculinoooo')");
            
            
        String sql = "DELETE FROM itse WHERE id = 2";
        st.executeUpdate(sql);
        
        ResultSet rs = st.executeQuery("SELECT * FROM itse");
         while ( rs.next() ) {
            int id = rs.getInt("id");
            String  nombre = rs.getString("nombre");
            String  paterno = rs.getString("paterno");
            String  materna = rs.getString("materna");
            String  sexo = rs.getString("sexo");
            
            System.out.println( "ID = " + id );
            System.out.println( "Nombre = " + nombre);
            System.out.println( "Paterno = " + paterno);
            System.out.println( "Materna = " + materna);
            System.out.println( "Sexo = " + sexo);
        
                
         
     
         }
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
