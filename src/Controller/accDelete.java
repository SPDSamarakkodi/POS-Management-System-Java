/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.*;
import java.sql.*;
import Databases.*;
import javax.swing.JOptionPane;
public class accDelete {
    private static Connection con = dbconnect.getConnection();
    public static void deleteWithUsname(searchUserAccountsPT2 obj){
        String usName = obj.getUserName();
        try{
            PreparedStatement ps = con.prepareStatement("DELETE FROM userAccounts WHERE userName = ?");
            ps.setString(1, usName);
            int result = ps.executeUpdate();
            if(result == 1){
                JOptionPane.showMessageDialog(null, "User name - " + usName + "Deleted");
            }
            else{
                JOptionPane.showMessageDialog(null, "Data not deleted : error");
            }
        }
        catch(SQLException ee){
            JOptionPane.showMessageDialog(null, ee.toString());
        }
        catch(Exception ll){
            JOptionPane.showMessageDialog(null, ll.toString());
        }
    }
    public static void deleteWithAccID(searchUserAccountsPT2 obj2){
        String acc_id = obj2.getUserID();
        try{
            PreparedStatement ps2 = con.prepareStatement("DELETE FROM userAccounts WHERE userID = ?");
            ps2.setString(1, acc_id);
            int result = ps2.executeUpdate();
            if(result == 1){
                JOptionPane.showMessageDialog(null, "Account ID:" + acc_id+" Deleted");
            }
            else{
                JOptionPane.showMessageDialog(null, "Data not deleted: error");
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
