/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizassignment;

import java.util.Random;

/**
 *
 * @author andrewcastro
 */
public class Questions {
    String quotien;
    int answer;

    public String getQuotien() {
        return quotien;
    }

    public int getAnswer() {
        return answer;
    }
    
    public void generate(){
        Random rand = new Random();
        int x;
        int y;
        x = rand.nextInt(200) + 1;
        y = rand.nextInt(200) + 1;
        this.answer = x + y;
        this.quotien = "What is " + x + " + " + y;   
    }
}
