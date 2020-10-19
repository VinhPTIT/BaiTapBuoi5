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
public abstract class Employee {

    protected LevelProblem levelProblem;
    protected Employee employee;

    public Employee(LevelProblem levelProblem) {
        this.levelProblem = levelProblem;
    }
    
    public Employee setNext(Employee employee){
        this.employee=employee;
        return employee;
    }
    
    public  void lever(LevelProblem severity , String msg){
        if(levelProblem.getLevel() <= severity.getLevel()){
            writeMessage(msg);
        }
        if(employee != null){
            employee.lever(severity,msg);
        }
    }
    protected abstract void writeMessage(String msg);
}
