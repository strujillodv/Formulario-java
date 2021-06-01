
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.List;
import java.awt.ScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

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
    static Checkbox cb1, cb2,cb3,cb4,cb5, cb6,cb7,cb8;
    private boolean cbBoolean1, cbBoolean2, cbBoolean3, cbBoolean4, cbBoolean5, cbBoolean6, cbBoolean7, cbBoolean8, cbBoolean9, cbBoolean10;
    private String cbText1, cbText2, cbText3, cbText4, cbText5, cbText6, cbText7, cbText8, cbText9, cbText10;
    static CheckboxGroup cbg1, cbg2, cbg3, cbg4, cbg5, cbg6;
    
    public FormTwo() {
        
        super("Test de Programación Web");
        
        title = new Label("HTML5");
        title.setBounds(20, 10, 300, 20);
        
        Font fuente = new Font("helvetica", Font.PLAIN, 18);
        Font titleFont = new Font("helvetica", Font.PLAIN, 24);
        title.setFont(titleFont);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(new EmptyBorder(20, 50, 20, 50));
        
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
        q7 = new Label(Variables.quest.get(6).getQuestion());
        q7.setFont(fuente);
        q8 = new Label(Variables.quest.get(7).getQuestion());
        q8.setFont(fuente);
        q9 = new Label(Variables.quest.get(8).getQuestion());
        q9.setFont(fuente);
        q10 = new Label(Variables.quest.get(9).getQuestion());
        q10.setFont(fuente);
        
        panel.add(q1);
        
        cbg1=new CheckboxGroup ();
        
        Checkbox io = new Checkbox(Variables.quest.get(0).getAnswer(0), false, cbg1);
        io.addItemListener((ItemEvent e) -> {
            cbText1 = Variables.quest.get(0).getAnswer(0);
            cbBoolean1 = false;
        });
        
        Checkbox io2 = new Checkbox(Variables.quest.get(0).getAnswer(1), false, cbg1);
        io2.addItemListener((ItemEvent e) -> {
            cbText1 = Variables.quest.get(0).getAnswer(1);
            cbBoolean1 = false;
        });
        
        Checkbox io3 = new Checkbox(Variables.quest.get(0).getAnswer(2), false, cbg1);
        io3.addItemListener((ItemEvent e) -> {
            cbText1 = Variables.quest.get(0).getAnswer(2);
            cbBoolean1 = false;
        });
        
        Checkbox io4 = new Checkbox(Variables.quest.get(0).getAnswer(3), false, cbg1);
        io4.addItemListener((ItemEvent e) -> {
            cbText1 = Variables.quest.get(0).getAnswer(3);
            cbBoolean1 = true;
        });
        
        panel.add(io);
        panel.add(io2);
        panel.add(io3);
        panel.add(io4);
        
        
        panel.add(q2);
        
        Choice c=new Choice(); 
        
        c.add(Variables.quest.get(1).getAnswer(0));
        c.add(Variables.quest.get(1).getAnswer(1));
        c.add(Variables.quest.get(1).getAnswer(2));
        c.add(Variables.quest.get(1).getAnswer(3));
        
        c.addItemListener((ItemEvent e) -> {
            cbBoolean2 = e.getItem().toString().equals("AUDIO");
            cbText2 = e.getItem().toString();
        });
        
        panel.add(c);
        
        panel.add(q3);
        
        List list=new List(4);
        
        list.add(Variables.quest.get(2).getAnswer(0));
        list.add(Variables.quest.get(2).getAnswer(1));
        list.add(Variables.quest.get(2).getAnswer(2));
        list.add(Variables.quest.get(2).getAnswer(3));
        
        list.addItemListener((ItemEvent e) -> {
            cbBoolean3 = e.getItem().toString().equals("2");
            cbText3 = Variables.quest.get(2).getAnswer(Integer.parseInt(e.getItem().toString()));
            System.out.println(cbText2);
        });
        
        panel.add(list);
        
        panel.add(q4);
        
        cb1 = new Checkbox(Variables.quest.get(3).getAnswer(0));
        
        cb1.addItemListener((ItemEvent e) -> {
            cb2.setState(false);
            cb3.setState(false);
            cb4.setState(false);
            cbText4 = Variables.quest.get(3).getAnswer(0);
            cbBoolean4 = true;
            System.out.println(cbg1.toString());
        });
        
        cb2 = new Checkbox(Variables.quest.get(3).getAnswer(1));
        
        cb2.addItemListener((ItemEvent e) -> {
            cb1.setState(false);
            cb3.setState(false);
            cb4.setState(false);
            cbBoolean4 = false;
            cbText4 = Variables.quest.get(3).getAnswer(1);
        });
        cb3 = new Checkbox(Variables.quest.get(3).getAnswer(2));
        
        cb3.addItemListener((ItemEvent e) -> {
            cb2.setState(false);
            cb1.setState(false);
            cb4.setState(false);
            cbBoolean4 = false;
            cbText4 = Variables.quest.get(3).getAnswer(2);
        });
        
        cb4 = new Checkbox(Variables.quest.get(3).getAnswer(3));
        
        cb4.addItemListener((ItemEvent e) -> {
            cb2.setState(false);
            cb3.setState(false);
            cb1.setState(false);
            cbBoolean4 = false;
            cbText4 = Variables.quest.get(3).getAnswer(3);
        });
        
        panel.add(cb1);
        panel.add(cb2);
        panel.add(cb3);
        panel.add(cb4);
        
        
        
        panel.add(q5);
        
        
        Checkbox io51 = new Checkbox(Variables.quest.get(4).getAnswer(0), false, cbg1);
        io.addItemListener((ItemEvent e) -> {
            cbText5 = Variables.quest.get(4).getAnswer(0);
            cbBoolean5 = false;
        });
        
        Checkbox io52 = new Checkbox(Variables.quest.get(4).getAnswer(1), false, cbg1);
        io2.addItemListener((ItemEvent e) -> {
            cbText5 = Variables.quest.get(4).getAnswer(1);
            cbBoolean5 = false;
        });
        
        Checkbox io53 = new Checkbox(Variables.quest.get(4).getAnswer(2), false, cbg1);
        io3.addItemListener((ItemEvent e) -> {
            cbText5 = Variables.quest.get(4).getAnswer(2);
            cbBoolean5 = false;
        });
        
        Checkbox io54 = new Checkbox(Variables.quest.get(4).getAnswer(3), false, cbg1);
        io4.addItemListener((ItemEvent e) -> {
            cbText5 = Variables.quest.get(4).getAnswer(3);
            cbBoolean5 = true;
        });
        
        panel.add(io51);
        panel.add(io52);
        panel.add(io53);
        panel.add(io54);
        
        Choice c2=new Choice(); 
        
        c2.add(Variables.quest.get(5).getAnswer(0));
        c2.add(Variables.quest.get(5).getAnswer(1));
        c2.add(Variables.quest.get(5).getAnswer(2));
        c2.add(Variables.quest.get(5).getAnswer(3));
        
        c2.addItemListener((ItemEvent e) -> {
            cbBoolean6 = e.getItem().toString().equals("<!DOCTYPE html5>");
            cbText6 = e.getItem().toString();
        });
        panel.add(q6);
        panel.add(c2);
        
        
        panel.add(q7);
        
        List list2=new List(4);
        
        list2.add(Variables.quest.get(6).getAnswer(0));
        list2.add(Variables.quest.get(6).getAnswer(1));
        list2.add(Variables.quest.get(6).getAnswer(2));
        list2.add(Variables.quest.get(6).getAnswer(3));
        
        list2.addItemListener((ItemEvent e) -> {
            cbBoolean7 = e.getItem().toString().equals("3");
            cbText7 = Variables.quest.get(6).getAnswer(Integer.parseInt(e.getItem().toString()));
        });
        
        panel.add(list2);
        
        panel.add(q8);
        
        cb5 = new Checkbox(Variables.quest.get(7).getAnswer(0));
        
        cb5.addItemListener((ItemEvent e) -> {
            cb6.setState(false);
            cb7.setState(false);
            cb8.setState(false);
            cbText8 = Variables.quest.get(7).getAnswer(0);
            cbBoolean8 = false;
        });
        
        cb6 = new Checkbox(Variables.quest.get(7).getAnswer(1));
        
        cb6.addItemListener((ItemEvent e) -> {
            cb5.setState(false);
            cb7.setState(false);
            cb8.setState(false);
            cbBoolean8 = false;
            cbText8 = Variables.quest.get(7).getAnswer(1);
        });
        
        cb7 = new Checkbox(Variables.quest.get(7).getAnswer(2));
        
        cb7.addItemListener((ItemEvent e) -> {
            cb5.setState(false);
            cb6.setState(false);
            cb8.setState(false);
            cbBoolean8 = true;
            cbText8 = Variables.quest.get(7).getAnswer(2);
        });
        
        cb8 = new Checkbox(Variables.quest.get(7).getAnswer(3));
        
        cb8.addItemListener((ItemEvent e) -> {
            cb5.setState(false);
            cb6.setState(false);
            cb7.setState(false);
            cbBoolean8 = false;
            cbText8 = Variables.quest.get(7).getAnswer(3);
        });
        
        panel.add(cb5);
        panel.add(cb6);
        panel.add(cb7);
        panel.add(cb8);
        
        
        panel.add(q9);
        
        
        Checkbox io91 = new Checkbox(Variables.quest.get(8).getAnswer(0), false, cbg1);
        io.addItemListener((ItemEvent e) -> {
            cbText9 = Variables.quest.get(8).getAnswer(0);
            cbBoolean9 = true;
        });
        
        Checkbox io92 = new Checkbox(Variables.quest.get(8).getAnswer(1), false, cbg1);
        io2.addItemListener((ItemEvent e) -> {
            cbText9 = Variables.quest.get(8).getAnswer(1);
            cbBoolean9 = false;
        });
        
        Checkbox io93 = new Checkbox(Variables.quest.get(8).getAnswer(2), false, cbg1);
        io3.addItemListener((ItemEvent e) -> {
            cbText9 = Variables.quest.get(8).getAnswer(2);
            cbBoolean9 = false;
        });
        
        Checkbox io94 = new Checkbox(Variables.quest.get(8).getAnswer(3), false, cbg1);
        io4.addItemListener((ItemEvent e) -> {
            cbText9 = Variables.quest.get(8).getAnswer(3);
            cbBoolean9 = true;
        });
        
        panel.add(io91);
        panel.add(io92);
        panel.add(io93);
        panel.add(io94);
        
        Choice c3=new Choice(); 
        
        c3.add(Variables.quest.get(9).getAnswer(0));
        c3.add(Variables.quest.get(9).getAnswer(1));
        c3.add(Variables.quest.get(9).getAnswer(2));
        c3.add(Variables.quest.get(9).getAnswer(3));
        
        c3.addItemListener((ItemEvent e) -> {
            cbBoolean10 = e.getItem().toString().equals("p {color: red;}");
            cbText10 = e.getItem().toString();
        });
        panel.add(q10);
        panel.add(c3);
                
        
        
        next = new Button("Siguiente");
        next.addActionListener(new ButtonListener());
        
        acctions.add(next);
        acctions.setBorder(new EmptyBorder(20, 50, 20, 50));
        
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
    
    
    private class itemListener implements ItemListener {
        
        public void itemStateChanged(ItemEvent e) {
            System.out.println("hey");
            System.out.println(e.getItem());
        }
    }
    
    private class ButtonListener implements ActionListener {
        
        // Metodo para los eventos de los botones
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            Variables.positionX = getLocation().x;
            Variables.positionY = getLocation().y;            
            
            Variables.ans.add(new Question(q1.getText()));
            Variables.ans.get(0).anwer(cbText1, cbBoolean1);
            Variables.ans.add(new Question(q2.getText()));
            Variables.ans.get(1).anwer(cbText2, cbBoolean2);
            Variables.ans.add(new Question(q3.getText()));
            Variables.ans.get(2).anwer(cbText3, cbBoolean3);
            Variables.ans.add(new Question(q4.getText()));
            Variables.ans.get(3).anwer(cbText4, cbBoolean4);
            Variables.ans.add(new Question(q5.getText()));
            Variables.ans.get(4).anwer(cbText5, cbBoolean5);
            Variables.ans.add(new Question(q6.getText()));
            Variables.ans.get(5).anwer(cbText6, cbBoolean6);
            Variables.ans.add(new Question(q7.getText()));
            Variables.ans.get(6).anwer(cbText7, cbBoolean7);
            Variables.ans.add(new Question(q8.getText()));
            Variables.ans.get(7).anwer(cbText8, cbBoolean8);
            Variables.ans.add(new Question(q9.getText()));
            Variables.ans.get(8).anwer(cbText9, cbBoolean9);
            Variables.ans.add(new Question(q10.getText()));
            Variables.ans.get(9).anwer(cbText10, cbBoolean10);
            
            
            dispose();
            FormThree three = new FormThree();
            three.setVisible(true);
        }
    }
    
}
