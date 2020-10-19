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
// khơi tạo class giám sát
public class Watch_man extends Employee {

    public Watch_man(LevelProblem levelProblem){
        super(levelProblem);
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("----------------------------");
        System.out.println("Giám sát giải quyết: " + msg);
    }
}
