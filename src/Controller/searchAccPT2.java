/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.sql.*;
import Databases.*;
import Model.*;
import javax.swing.JOptionPane;
public class searchAccPT2 {
    private static Connection con = dbconnect.getConnection();
    public static void process(searchUserAccountsPT2 obj){
        try{
            String userName = obj.getUserName();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM userAccounts WHERE userName = ?");
            ps.setString(1, userName);
            try(ResultSet dataRead = ps.executeQuery()){
                if(dataRead != null){
                    while(dataRead.next()){
                        obj.setUserID(dataRead.getString("userID"));
                        obj.setUsName(dataRead.getString("userName"));
                        obj.setPassword(dataRead.getString("password"));
                        obj.setAddress(dataRead.getString("address"));
                        obj.setFname(dataRead.getString("Fname"));
                        obj.setLname(dataRead.getString("Lname"));
                        obj.setNic(dataRead.getString("NIC"));
                    }
                }
            }
        }
        catch(SQLException ll){
            JOptionPane.showMessageDialog(null, ll.toString());
        }
        catch(Exception ee){
            JOptionPane.showMessageDialog(null, ee.toString());
        }
    }
    public static void process2(searchUserAccountsPT2 obj){
        try{
            String accID = obj.getUserID();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM userAccounts WHERE userID = ?");
            ps.setString(1, accID);
            try(ResultSet dataRead = ps.executeQuery()){
                if(dataRead != null){
                    while(dataRead.next()){
                        obj.setUserID(dataRead.getString("userID"));
                        obj.setUsName(dataRead.getString("userName"));
                        obj.setPassword(dataRead.getString("password"));
                        obj.setAddress(dataRead.getString("address"));
                        obj.setFname(dataRead.getString("Fname"));
                        obj.setLname(dataRead.getString("Lname"));
                        obj.setNic(dataRead.getString("NIC"));
                    }
                }
            }
        }
        catch(SQLException ll){
            JOptionPane.showMessageDialog(null, ll.toString());
        }
        catch(Exception ee){
            JOptionPane.showMessageDialog(null, ee.toString());
        }
    }
}
