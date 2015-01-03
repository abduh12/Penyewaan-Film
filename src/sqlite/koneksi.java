package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sqlite.formLogin;

public class koneksi {
    public void koneksi(){
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst = null;
        try{
            Class.forName("org.sqlite.JDBC");
        }catch(ClassNotFoundException ex){
            Logger.getLogger(formLogin.class.getName()).log(Level.SEVERE,null,ex);
        }
        //membuat koneksi kedalam database
        try{
            conn = DriverManager.getConnection("jdbc:sqlite:sample.db");
            JOptionPane.showMessageDialog(null, "KONEKSI BERHASIL");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "GAGAL KONEKSI "+ex);
        }
    }
}
