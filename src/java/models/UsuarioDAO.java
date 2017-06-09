/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Aluno
 */
public class UsuarioDAO {
    private int totalRegistros;
    
    public int getLogin(String email, String senha){
        try {
            
             // create our mysql database connection
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/nicegames";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nicegames", "root", "");

            // our SQL SELECT query. 
            // if you only need a few columns, specify them by name instead of using "*"
            String query = "select * from cliente where email='" + email + "' and senha=MD5('" + senha + "')";

            // create the java statement
            Statement st = conn.createStatement();

            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);
            
             while (rs.next()) {
                totalRegistros++;
            }
            st.close();
            
           } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
          }
        
        return totalRegistros;
    }
}
