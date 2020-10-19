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
public class AppEmploy {
    public static Employee getEmploy(){
        Employee manager = new  Manager(LevelProblem.EATING);
        Employee watch_man = manager.setNext(new Watch_man(LevelProblem.EATING));
        watch_man.setNext(new Waiter(LevelProblem.EATING));
    
        return manager;
        
    }
}
