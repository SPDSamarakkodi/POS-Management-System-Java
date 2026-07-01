/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.sql.*;
import Databases.*;
import Model.*;
import javax.swing.JOptionPane;

public class accUpdateSection {
    private static Connection con = dbconnect.getConnection();
    public static void updateProcess(updateResources obj){
        String accID = obj.getSearchValue();
        try{
            PreparedStatement ps = con.prepareStatement("UPDATE userAccounts SET userName = ?,password = ?,address = ?,Fname = ?,Lname = ?,NIC = ? WHERE userID = ?");
            ps.setString(1, obj.getNewName());
            ps.setString(2, obj.getNewPass());
            ps.setString(3, obj.getNewAddress());
            ps.setString(4, obj.getNewFname());
            ps.setString(5, obj.getNewLname());
            ps.setString(6, obj.getNic());
            ps.setString(7, accID);
            int result = ps.executeUpdate();
            if(result == 1){
                JOptionPane.showMessageDialog(null, "Data updated");
            }
            else{
                JOptionPane.showMessageDialog(null, "Data not updated");
            }
        }
        catch(SQLException ee){
            JOptionPane.showMessageDialog(null, ee.toString());
        }
        catch(Exception ll){
            JOptionPane.showMessageDialog(null, ll.toString());
        }
    }
    public static void checkData(updateResources obj2){
        try{
         PreparedStatement ps2 = con.prepareStatement("SELECT * FROM userAccounts WHERE userID = ?");
         ps2.setString(1, obj2.getSearchValue());
         try(ResultSet dataSet = ps2.executeQuery()){
             if(dataSet != null){
                 
                 while(dataSet.next()){
                     obj2.setPasName(dataSet.getString("userName"));
                     obj2.setPasPass(dataSet.getString("password"));
                     obj2.setPasAddre(dataSet.getString("address"));
                     obj2.setPasFname(dataSet.getString("Fname"));
                     obj2.setPasLname(dataSet.getString("Lname"));
                     obj2.setPasnic(dataSet.getString("NIC"));
                 }
                 if(obj2.getPasnic()!=null){
                     obj2.setResult(1);
                 }
                 else{
                     obj2.setResult(0); 
                 }
             }
         }
        }
         catch(SQLException ee){
            JOptionPane.showMessageDialog(null, ee.toString());
         }
    }
}
