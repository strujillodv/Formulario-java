
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.event.ItemEvent;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sergio Antonio Trujillo
 */
public class FormTwo extends JFrame {
    
    static Label title, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;
    static Button next;
    static ScrollPane scroll;
    
    public FormTwo() {
        
        super("Test de Programación Web");
        
        title = new Label("HTML5");
        title.setBounds(20, 10, 300, 20);
        
        Font fuente = new Font("helvetica", Font.PLAIN, 18);
        Font titleFont = new Font("helvetica", Font.PLAIN, 24);
        title.setFont(titleFont);
        
        Panel panel = new Panel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        //panel.setBorder(new EmptyBorder(20, 50, 20, 50));
        
        JPanel acctions = new JPanel();
        acctions.setLayout(new FlowLayout());
        
        q1 = new Label(Variables.quest.get(0).getQuestion());
        q1.setFont(fuente);
        q2 = new Label(Variables.quest.get(1).getQuestion());
        q2.setFont(fuente);
        q3 = new Label(Variables.quest.get(2).getQuestion());
        q3.setFont(fuente);
        q4 = new Label(Variables.quest.get(3).getQuestion());
        q4.setFont(fuente);
        q5 = new Label(Variables.quest.get(4).getQuestion());
        q5.setFont(fuente);
        q6 = new Label(Variables.quest.get(5).getQuestion());
        q6.setFont(fuente);
        q7 = new Label(Variables.quest.get(5).getQuestion());
        q7.setFont(fuente);
        q8 = new Label("");
        q9 = new Label("HTML5");
        q10 = new Label("HTML5");
        
        panel.add(title);
        panel.add(q1);
        
        CheckboxGroup cbg1=new CheckboxGroup ();
        
        panel.add(new Checkbox(Variables.quest.get(0).getAnswer(0), false, cbg1));
        panel.add(new Checkbox(Variables.quest.get(0).getAnswer(1), false, cbg1));
        panel.add(new Checkbox(Variables.quest.get(0).getAnswer(2), false, cbg1));
        panel.add(new Checkbox(Variables.quest.get(0).getAnswer(3), false, cbg1));
        
        panel.add(q2);
        
        Choice c=new Choice(); 
        
        c.add(Variables.quest.get(1).getAnswer(0));
        c.add(Variables.quest.get(1).getAnswer(1));
        c.add(Variables.quest.get(1).getAnswer(2));
        c.add(Variables.quest.get(1).getAnswer(3));
        panel.add(c);
        
        panel.add(q3);
        
        List list=new List(4);
        
        list.add(Variables.quest.get(2).getAnswer(0));
        list.add(Variables.quest.get(2).getAnswer(1));
        list.add(Variables.quest.get(2).getAnswer(2));
        list.add(Variables.quest.get(2).getAnswer(3));
        
        panel.add(list);
        
        panel.add(q4);
        
        Checkbox cb1 = new Checkbox(Variables.quest.get(3).getAnswer(0));
        
        cb1.addItemListener((ItemEvent e) -> {
            cb1.setState(false);
            if (e.getStateChange() == 1) {
            }
            System.out.println(e.getItem());
            System.out.println(e.getClass());
            System.out.println(e.getSource() == cb1);
            System.out.println(e.getID());
            System.out.println(e.getItemSelectable());
            System.out.println(e.getStateChange());
            System.out.println(e.paramString());
        });
        
        Checkbox cb2 = new Checkbox(Variables.quest.get(3).getAnswer(1));
        
        cb2.addItemListener((ItemEvent e) -> {
            System.out.println(e.getStateChange());
        });
        Checkbox cb3 = new Checkbox(Variables.quest.get(3).getAnswer(2));
        Checkbox cb4 = new Checkbox(Variables.quest.get(3).getAnswer(3));
        
        panel.add(cb1);
        panel.add(cb2);
        panel.add(cb3);
        panel.add(cb4);
        
        panel.add(q5);
        
        panel.add(new Checkbox(Variables.quest.get(4).getAnswer(0), false));
        panel.add(new Checkbox(Variables.quest.get(4).getAnswer(1), false));
        panel.add(new Checkbox(Variables.quest.get(4).getAnswer(2), false));
        panel.add(new Checkbox(Variables.quest.get(4).getAnswer(3), false));
        
        panel.add(q6);
        
        panel.add(new Checkbox(Variables.quest.get(5).getAnswer(0), false));
        panel.add(new Checkbox(Variables.quest.get(5).getAnswer(1), false));
        panel.add(new Checkbox(Variables.quest.get(5).getAnswer(2), false));
        panel.add(new Checkbox(Variables.quest.get(5).getAnswer(3), false));
        
        panel.add(q7);
        
        // RadioButton rd = new RadioButton();
        
        panel.add(new Checkbox(Variables.quest.get(5).getAnswer(0), false));
        panel.add(new Checkbox(Variables.quest.get(5).getAnswer(1), false));
        panel.add(new Checkbox(Variables.quest.get(5).getAnswer(2), false));
        panel.add(new Checkbox(Variables.quest.get(5).getAnswer(3), false));
        
        next = new Button("Siguiente");
        
        acctions.add(next);
        
        panel.add(acctions);
        
        ScrollPane scroll = new ScrollPane();
        
        scroll.add(panel);
        scroll.setBounds(0,0,795,590);
        
        
        add(scroll);
        
        //Configuración del marco General
        Image icon = new ImageIcon(getClass().getResource("/img/icon.png")).getImage();
        setIconImage(icon);
        setLayout(null);
        setSize(800,600);
        setLocation(Variables.positionX, Variables.positionY);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
