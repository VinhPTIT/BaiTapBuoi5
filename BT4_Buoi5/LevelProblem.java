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
// class các mức độ khiếu kiện
public enum LevelProblem {
    // Các vẫn đề nảy sinh khi gọi đồ
    LONG_TIME_WAITING(0),// thời gian đợi
    QUESTION_PRICE(1),// câu hỏi
    DEPORTMENT(2), // bộ phận
    EATING(3),// đồ ăn
    HYGIENE(4),// vệ sinh
    POISONING(5);// trúng độc

    private int level;

    LevelProblem(int level) {
        this.level = level;
     
    }

    public int getLevel() {
        return level;
    }

}
