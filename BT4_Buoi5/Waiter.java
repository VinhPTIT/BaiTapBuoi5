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
// khởi tạo class bồi bàn
public class Waiter extends Employee {


    public Waiter(LevelProblem levelProblem) {
       super(levelProblem);
    }


    @Override
    protected void writeMessage(String msg) {
        System.out.println("----------------------------");
        System.out.println("Phục vụ giải quyết: " + msg);
    }

}
