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
public class CallOder implements Command{
    private  Oder oder;
    
    // khởi tạo món ăn
    public CallOder(Oder oder) {
        this.oder = oder;
    }
    
    // ghi de món ăn khách hàng gọi
    @Override
    public void execute() {
        oder.callFoodName();
    }
    
}
