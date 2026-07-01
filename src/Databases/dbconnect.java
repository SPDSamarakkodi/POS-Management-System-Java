/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Databases;
import java.sql.*;
import javax.swing.JOptionPane;
/*
The package Databases is used to hold the database connection of the "Stadium" database. The dbconnect.java file 
is the class that we used to create the blueprint of the connection establishment :)
*/
public class dbconnect {
private static Connection con = null;
public static Connection getConnection(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        if(con == null){
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Stadium?useSSL=false","root","raveen007");    
        }
    }
    catch(SQLException ee){
        JOptionPane.showMessageDialog(null, ee.toString());
    }
    catch(Exception ss){
         JOptionPane.showMessageDialog(null, ss.toString());
    }
    return con;
}
}
