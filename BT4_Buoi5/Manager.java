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
// class quản lí kề thừa từ nhân viên nhà hàng
public class Manager extends Employee{

    public  Manager(LevelProblem levelProblem) {
        super(levelProblem);
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("----------------------------");
        System.out.println("Quản lí giải quyết: " + msg);
    }
}
