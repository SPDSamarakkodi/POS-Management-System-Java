/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Databases.*;
import Model.*;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 the process of checking the old admin user name and the password are correct
 * and return a status to move on to next step
 */
public class adInfoUpPro_PT1 {
    private static Connection con = null;
    static String pubPass = null; 
    public static void allowProcess(adminInfoUpdateResources obj){
        con = dbconnect.getConnection();
        String oldname = obj.getAdName();
        String oldpass = obj.getAdPassword();
        pubPass = oldpass;
        try{
        PreparedStatement ps = con.prepareStatement("SELECT adminName,password FROM AdminInfo WHERE adminName = ? AND password = ?");
        ps.setString(1, oldname);
        ps.setString(2, oldpass);
        try(ResultSet dataRead = ps.executeQuery()){
            if(dataRead != null){
                while(dataRead.next()){
                    String line1 = dataRead.getString("adminName");
                    String line2 = dataRead.getString("password");
                    //JOptionPane.showMessageDialog(null, line1 + line2);
                    obj.setStatus(1);
                }
            }
        }
        }
        catch(SQLException ee){
            JOptionPane.showMessageDialog(null, ee.toString());
        }
        catch(Exception ll){
            JOptionPane.showMessageDialog(null, ll.toString()); 
        }
        
       
    }
    public static void updateProcess(adminInfoUpdateResources obj){
        con = dbconnect.getConnection();
        try{
            PreparedStatement ps2 = con.prepareStatement("UPDATE AdminInfo SET adminName = ?,password = ? WHERE password = ? ");
            ps2.setString(1, obj.getNewUsername());
            ps2.setString(2, obj.getNewPassword());
            ps2.setString(3, pubPass);
            int result = ps2.executeUpdate();
            if(result == 1){
                JOptionPane.showMessageDialog(null, "Data updated: \n"+"New user name: "+obj.getNewUsername()+"\nNew password: "+obj.getNewPassword());
            }
            else{
                JOptionPane.showMessageDialog(null,"Data not saved");
            }
        }
        catch(SQLException ee){
            JOptionPane.showMessageDialog(null, ee.toString());
        }
        catch(Exception ll){
            JOptionPane.showMessageDialog(null, ll.toString());
        }
    }
}
