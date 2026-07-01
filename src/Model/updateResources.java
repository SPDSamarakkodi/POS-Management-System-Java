/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.*;
import Databases.*;
public class updateResources {
    private String newName,newPass,newAddress,newFname,newLname;
    private String SearchValue;
    private int result;
     private String nic;

    public String getPasName() {
        return pasName;
    }

    public void setPasName(String pasName) {
        this.pasName = pasName;
    }

    public String getPasPass() {
        return pasPass;
    }

    public void setPasPass(String pasPass) {
        this.pasPass = pasPass;
    }

    public String getPasAddre() {
        return pasAddre;
    }

    public void setPasAddre(String pasAddre) {
        this.pasAddre = pasAddre;
    }

    public String getPasFname() {
        return pasFname;
    }

    public void setPasFname(String pasFname) {
        this.pasFname = pasFname;
    }

    public String getPasLname() {
        return pasLname;
    }

    public void setPasLname(String pasLname) {
        this.pasLname = pasLname;
    }

    public String getPasnic() {
        return pasnic;
    }

    public void setPasnic(String pasnic) {
        this.pasnic = pasnic;
    }
    ////////////////
    private String pasName,pasPass,pasAddre,pasFname,pasLname,pasnic;
    ///////////////
    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
   
    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }
   
    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public String getNewPass() {
        return newPass;
    }

    public void setNewPass(String newPass) {
        this.newPass = newPass;
    }

    public String getNewAddress() {
        return newAddress;
    }

    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress;
    }

    public String getNewFname() {
        return newFname;
    }

    public void setNewFname(String newFname) {
        this.newFname = newFname;
    }

    public String getNewLname() {
        return newLname;
    }

    public void setNewLname(String newLname) {
        this.newLname = newLname;
    }

    public String getSearchValue() {
        return SearchValue;
    }

    public void setSearchValue(String SearchValue) {
        this.SearchValue = SearchValue;
    }
    
}
