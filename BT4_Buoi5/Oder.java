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
// class goi mon của khách hàng
public class Oder {

    private String strFoodName;

    public Oder(String strFoodName) {
        this.strFoodName = strFoodName;
    }

    Oder() {
        
    }

    public String getStrFoodName() {
        return strFoodName;
    }

    public void setStrFoodName(String strFoodName) {
        this.strFoodName = strFoodName;
    }
    
    //goi mon an
    public void callFoodName() {
        System.out.println("Ten món an goi: " + strFoodName);
    }

}
