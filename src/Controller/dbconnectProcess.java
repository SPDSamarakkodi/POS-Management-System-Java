/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.sql.*;
import Model.dbconnectResources;
import View.MainMenu;
import javax.swing.JOptionPane;
import Databases.*;
import main.*;
/**
 this conducts the processes by obtaining the data from the Model package and the classes
 */

public class dbconnectProcess {
    private static Connection con = null;
    
    public static void adminLogIn(dbconnectResources m1){
        try{
            con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT adminName,password FROM AdminInfo WHERE adminName = ? AND password = ?");
            ps.setString(1,m1.getName());
            ps.setString(2, m1.getPass());
            try(ResultSet dataRead = ps.executeQuery()){
                if(dataRead != null){
                    while(dataRead.next()){
                        m1.setAdminName(dataRead.getString("adminName"));
                        m1.setPassword(dataRead.getString("password"));
                    }
                }
            }
                    if(m1.getAdminName() != null && m1.getPassword() != null){
                        new MainMenu().setVisible(true);
                        new Main().setVisible(false);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Invalid");
                    }
        }
        catch(Exception ss){
            JOptionPane.showMessageDialog(null,ss.toString());
        }
    }
}
