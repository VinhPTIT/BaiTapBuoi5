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
public class Singleton {
    public  static Singleton instance = null;
    
    private Singleton(){
        
    }
      
    public static Singleton getINSTANCE(){
        if(instance == null){
            instance = new Singleton();
            System.out.println("Giám đốc nhà hàng.");
        }
        return instance;
        
    }
}
