
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sergio Antonio Trujillo del Valle
 */
public class Question {
    
    private final String question;    
    private final ArrayList<Answer> answers = new  ArrayList<>();

    public Question(String question) {
        this.question = question;
    }
    
    public void anwer(String answer, boolean value) {
        answers.add(new Answer(answer, value));
    }    

    public String getQuestion() {
        return question;
    }

    public String getAnswer(int answer) {
        return answers.get(answer).getAnswer();
    }
    
    
    
}
