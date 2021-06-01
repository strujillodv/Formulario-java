/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sergio Antonio Trujillo del Valle
 */
public class Answer {
    
    private final String answer;
    private final boolean value;

    public Answer(String answer, boolean value) {
        this.answer = answer;
        this.value = value;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean isValue() {
        return value;
    }
    
    
    
}
