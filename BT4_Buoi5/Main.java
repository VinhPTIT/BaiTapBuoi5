/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT4_Buoi5;

import java.util.Scanner;

/**
 *
 * @author T460
 */
public class Main {
    public static final int New_KH = 1; // khơi tạo khách hàng mới
    public static final int Call_Food = 2; // khách hàng gọi món ăn
    public static final int Singleton = 3;    // Mỗi nhà hàng chỉ có 1 giám đốc
    public static final int Sue = 4;    // Khiếu nại của khách hàng
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RestaurantManager ql = new RestaurantManager();
        while (true) {            
            System.out.println("----------------------");
            System.out.println("1. Khơi tạo khách hang.");
            System.out.println("2. Khách hàng gọi món.");
            System.out.println("3. Hiện ra Singleton.");
            System.out.println("4. Khách hàng khiếu kiện.");
            System.out.print("Mời chọn: ");
            int chon = sc.nextInt();
            switch(chon){
                case New_KH:
                    ql.clientOder();
                    break;
                case Call_Food:
                    ql.callFood();
                    break;
                case Singleton:
                    ql.Singleton();
                    break;
                case  Sue:
                    ql.Chain_of_responsi();
                    break;
                default:
                    System.out.println("Hiên giờ nhà hàng chỉ có 3 chức năng thôi nhé!");
            }
        }
    }
}
