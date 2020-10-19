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
public class Restaurant {
    private Command coCallOder;

    public Restaurant(Command coCallOder, Command coCannerOder) {
        this.coCallOder = coCallOder;
    }
    
    public void chooseFood(){
        coCallOder.execute();
    }
}
