/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.sql.*;
import Model.*;
import Databases.*;
import javax.swing.JOptionPane;
/**
Declare the the inserting process of the new user accounts 
 */
public class userInsertProcess {
    private static Connection con = null;
    public static void insert_process(newUserResources nu){
       con = dbconnect.getConnection();
       int IntID = 0;
       try{
           PreparedStatement ps = con.prepareStatement("SELECT userID FROM userAccounts WHERE userID = (SELECT MAX(userID) FROM userAccounts)");
           try(ResultSet dataRead = ps.executeQuery()){
               if(dataRead != null){
                   while(dataRead.next()){
                       
                     IntID = Integer.parseInt(dataRead.getString("userID")) ;
                   }
               }
               nu.setUserid(String.valueOf(IntID + 1));
              // JOptionPane.showMessageDialog(null, nu.getUserid());
              int number = IntID + 1;
              nu.setUsName(nu.getFname()+number);
              //JOptionPane.showMessageDialog(null, nu.getUsName());
           }
           PreparedStatement ps2 = con.prepareStatement("INSERT INTO userAccounts VALUES (?,?,?,?,?,?,?)");
           ps2.setString(1, nu.getUserid());
           ps2.setString(2, nu.getUsName());
           ps2.setString(3, nu.getNewPassword());
           ps2.setString(4, nu.getAddress());
           ps2.setString(5, nu.getFname());
           ps2.setString(6, nu.getLname());
           ps2.setString(7, nu.getNic());
           int result  = ps2.executeUpdate();
           if(result == 1){
               JOptionPane.showMessageDialog(null, "User ID - " + nu.getUserid() + "\nUser name - " + nu.getUsName() + "\nPassword - " + nu.getNewPassword() + "\nFull name - " + nu.getFname() + nu.getLname() + "\nAddress - " + nu.getAddress() + "\nNIC - " + nu.getNic());
           }
           else{
               JOptionPane.showMessageDialog(null, "Not saved");
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
