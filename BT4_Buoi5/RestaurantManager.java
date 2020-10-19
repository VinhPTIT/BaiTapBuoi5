/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT4_Buoi5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author T460
 */
public class RestaurantManager {
    ArrayList<Client> listlients = new ArrayList<>() ;// danh sach khách hang vào quán
    ArrayList<Oder> listoders = new ArrayList<>() ; // danh sach các món mà khách hàng chon
    Employee employee;
  //  Restaurant restaurant = new Restaurant(coCallOder, coCannerOder);
    Client client= null;
    Oder oder ;
    Scanner sc = new Scanner(System.in);
    public  void clientOder(){
        client = new Client();     
        System.out.print("Ten khách hàng: ");
        client.setStrName(sc.nextLine());
        System.out.print("Số điện thoai khách hàng: ");
        client.setBlePhone(sc.nextDouble());  
        listlients.add(client);
    }
    public void callFood(){
        oder = new Oder("Rau,Thit");
        oder.callFoodName();
       // oder.setStrFoodName(sc.nextLine());
        listoders.add(oder);
    }
    public void Singleton(){
        Singleton singleton = Singleton.getINSTANCE();
       // System.out.println(singleton.toString());
    }
    public void Chain_of_responsi(){
        employee = AppEmploy.getEmploy();
        
        employee.lever(LevelProblem.EATING, "Ngộ độc thức ăn");
//        employee.lever(LevelProblem.EATING, "Giám sát xin lỗi");
//        employee.lever(LevelProblem.EATING, "Giám đốc xin lỗi");
    }
}
