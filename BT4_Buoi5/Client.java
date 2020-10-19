/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT4_Buoi5;


/**
 *
 * @author T460
 */
public class Client {
   private String strName;
   private double blePhone;

    public Client(String strName, double blePhone) {
        this.strName = strName;
        this.blePhone = blePhone;
    }

    Client() {
   
    }

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public double getBlePhone() {
        return blePhone;
    }

    public void setBlePhone(double blePhone) {
        this.blePhone = blePhone;
    }

    @Override
    public String toString() {
        return "Client{" + "strName=" + strName + ", blePhone=" + blePhone + '}';
    }
}
