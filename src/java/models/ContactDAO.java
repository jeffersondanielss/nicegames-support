/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import bean.Contact;
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
public class ContactDAO {
    private Connection conexao;
    private PreparedStatement st;
    
    
    public int connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/nicegames", "root", "");
            
            return 1;
            
        } catch(SQLException ex){
            return 0;
            
        } catch(ClassNotFoundException x) {
            return 0;
            
        }
    }
    
    public int saveSupport(Contact cli){
        try{
            String comando = "INSERT INTO `nicegames`.`supportmessage`(`email_cliente`, `subject`, `message`)VALUES(?,?,?)";
            
            st = this.conexao.prepareStatement(comando);
            st.setString(1, cli.getEmail());
            st.setString(2, cli.getSubject());
            st.setString(3, cli.getMessage());
            st.execute();
            return 1;
            
        } catch(SQLException ex){
            if( ex.getErrorCode() == 1062 ) {
                return 2;
            } else {
                return 0;
            }
        }
    }
    
    public void desconnect(){
        try{
            conexao.close();
        } catch(SQLException ex){
            Logger.getLogger(ContactDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
