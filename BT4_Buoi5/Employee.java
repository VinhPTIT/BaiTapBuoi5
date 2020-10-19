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
// khởi tạo class nhan viên
public abstract class Employee {

    protected LevelProblem levelProblem;
    protected Employee employee; //Trình xử lý tiếp theo trong chuỗi

    public Employee(LevelProblem levelProblem) {
        this.levelProblem = levelProblem;
    }
    

    //Đặt trình ghi tiếp theo để tạo danh sách / chuỗi Người xử lý.
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
