import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.CheckboxGroup;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.List;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
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
public class FormThree extends JFrame {
    
    static JLabel title, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;
    static JButton next;
    static JScrollPane scroll;
    static JCheckBox cb1, cb2,cb3,cb4;
    static Checkbox cb5, cb6,cb7,cb8;
    private boolean cbBoolean1, cbBoolean2, cbBoolean3, cbBoolean4, cbBoolean5, cbBoolean6, cbBoolean7, cbBoolean8, cbBoolean9, cbBoolean10;
    private String cbText1, cbText2, cbText3, cbText4, cbText5, cbText6, cbText7, cbText8, cbText9, cbText10;
    static CheckboxGroup cbg1, cbg2, cbg3, cbg4, cbg5, cbg6;
    JRadioButton io, io2,io3,io4, io51,io52;
    
    public FormThree() {
        
        super("Test de Programación Web");
        
        title = new JLabel("HTML5");
        title.setBounds(20, 10, 300, 20);
        
        Font fuente = new Font("helvetica", Font.PLAIN, 18);
        Font titleFont = new Font("helvetica", Font.PLAIN, 24);
        title.setFont(titleFont);
        
        JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(22,1));
        panel.setBorder(new EmptyBorder(20, 50, 20, 50));
        
        JPanel acctions = new JPanel();
        acctions.setLayout(new FlowLayout());
        
        q1 = new JLabel(Variables.quest.get(10).getQuestion());
        q1.setFont(fuente);
        q2 = new JLabel(Variables.quest.get(11).getQuestion());
        q2.setFont(fuente);
        q3 = new JLabel(Variables.quest.get(12).getQuestion());
        q3.setFont(fuente);
        q4 = new JLabel(Variables.quest.get(13).getQuestion());
        q4.setFont(fuente);
        q5 = new JLabel(Variables.quest.get(14).getQuestion());
        q5.setFont(fuente);
        q6 = new JLabel(Variables.quest.get(15).getQuestion());
        q6.setFont(fuente);
        q7 = new JLabel(Variables.quest.get(16).getQuestion());
        q7.setFont(fuente);
        q8 = new JLabel(Variables.quest.get(17).getQuestion());
        q8.setFont(fuente);
        q9 = new JLabel(Variables.quest.get(18).getQuestion());
        q9.setFont(fuente);
        q10 = new JLabel(Variables.quest.get(19).getQuestion());
        q10.setFont(fuente);
        
        panel.add(q1);
                
        io = new JRadioButton(Variables.quest.get(10).getAnswer(0), false);
        io.addItemListener((ItemEvent e) -> {
            io2.setSelected(false);
            io3.setSelected(false);
            io4.setSelected(false);
            cbText1 = Variables.quest.get(10).getAnswer(0);
            cbBoolean1 = false;
        });
        
        io2 = new JRadioButton(Variables.quest.get(10).getAnswer(1), false);
        io2.addItemListener((ItemEvent e) -> {
            io.setSelected(false);
            io3.setSelected(false);
            io4.setSelected(false);
            cbText1 = Variables.quest.get(10).getAnswer(1);
            cbBoolean1 = false;
        });
        
        io3 = new JRadioButton(Variables.quest.get(10).getAnswer(2), false);
        io3.addItemListener((ItemEvent e) -> {
            io2.setSelected(false);
            io.setSelected(false);
            io4.setSelected(false);
            cbText1 = Variables.quest.get(10).getAnswer(2);
            cbBoolean1 = true;
        });
        
        io4 = new JRadioButton(Variables.quest.get(0).getAnswer(3), false);
        io4.addItemListener((ItemEvent e) -> {
            io2.setSelected(false);
            io3.setSelected(false);
            io.setSelected(false);
            cbText1 = Variables.quest.get(0).getAnswer(3);
            cbBoolean1 = false;
        });
        
        
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(4,1));
        panel2.add(io);
        panel2.add(io2);
        panel2.add(io3);
        panel2.add(io4);
        panel.add(panel2);
        
        
        panel.add(q2);
        
        String[] select = new String[4];
        
        select[0] = Variables.quest.get(11).getAnswer(0);
        select[1] = Variables.quest.get(11).getAnswer(1);
        select[2] = Variables.quest.get(11).getAnswer(2);
        select[3] = Variables.quest.get(11).getAnswer(3);
        
        
        JComboBox  c=new JComboBox(select);         
                
        c.addItemListener((ItemEvent e) -> {
            cbBoolean2 = e.getItem().toString().equals("AUDIO");
            cbText2 = e.getItem().toString();
            
        });
        
        panel.add(c);
        
        panel.add(q3);
        
        String itemList[] = new String[4];
        
        itemList[0] = Variables.quest.get(12).getAnswer(0);
        itemList[1] = Variables.quest.get(12).getAnswer(1);
        itemList[2] = Variables.quest.get(12).getAnswer(2);
        itemList[3] = Variables.quest.get(12).getAnswer(3);
        
        JList list = new JList(itemList);
        
               
        panel.add(list);
        
        panel.add(q4);
        
        cb1 = new JCheckBox(Variables.quest.get(13).getAnswer(0));
        
        cb1.addItemListener((ItemEvent e) -> {
            cb2.setSelected(false);
            cbText4 = Variables.quest.get(13).getAnswer(0);
            cbBoolean4 = true;
        });
        
        cb2 = new JCheckBox(Variables.quest.get(13).getAnswer(1));
        
        cb2.addItemListener((ItemEvent e) -> {
            cb1.setSelected(false);
            cbBoolean4 = false;
            cbText4 = Variables.quest.get(13).getAnswer(1);
        });
        
        
        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(2,1));
        panel3.add(cb1);
        panel3.add(cb2);
        panel.add(panel3);
                     
        panel.add(q5);
        
        
        io51 = new JRadioButton(Variables.quest.get(14).getAnswer(0), false);
        io52 = new JRadioButton(Variables.quest.get(14).getAnswer(1), false);
        
        io51.addItemListener((ItemEvent e) -> {
            io52.setSelected(false);
            cbText5 = Variables.quest.get(14).getAnswer(0);
            cbBoolean5 = false;
        });        
        
        io52.addItemListener((ItemEvent e) -> {
            io51.setSelected(false);
            cbText5 = Variables.quest.get(14).getAnswer(1);
            cbBoolean5 = true;
        });
        
        JPanel panel4 = new JPanel();
        panel4.setLayout(new GridLayout(2,1));
        panel4.add(io51);
        panel4.add(io52);
        panel.add(panel4);
        
        panel.add(q6);
        
        String[] select2 = new String[3];
        
        select2[0] = Variables.quest.get(15).getAnswer(0);
        select2[1] = Variables.quest.get(15).getAnswer(1);
        select2[2] = Variables.quest.get(15).getAnswer(2);
        
        
        JComboBox  c2=new JComboBox(select2);         
                
        c2.addItemListener((ItemEvent e) -> {
            cbBoolean2 = e.getItem().toString().equals("AUDIO");
            cbText2 = e.getItem().toString();
            
        });
        
        panel.add(c2);
              
                      
        panel.add(q7);
        
        List list2=new List(3);
        
        list2.add(Variables.quest.get(16).getAnswer(0));
        list2.add(Variables.quest.get(16).getAnswer(1));
        list2.add(Variables.quest.get(16).getAnswer(2));
        
        list2.addItemListener((ItemEvent e) -> {
            cbBoolean7 = e.getItem().toString().equals("1");
            cbText7 = Variables.quest.get(16).getAnswer(Integer.parseInt(e.getItem().toString()));
        });
        
        panel.add(list2);
        
        panel.add(q8);
        
        cb5 = new Checkbox(Variables.quest.get(17).getAnswer(0));
        
        cb5.addItemListener((ItemEvent e) -> {
            cb6.setState(false);
            cb7.setState(false);
            cbText8 = Variables.quest.get(17).getAnswer(0);
            cbBoolean8 = true;
        });
        
        cb6 = new Checkbox(Variables.quest.get(17).getAnswer(1));
        
        cb6.addItemListener((ItemEvent e) -> {
            cb5.setState(false);
            cb7.setState(false);
            cbBoolean8 = false;
            cbText8 = Variables.quest.get(17).getAnswer(1);
        });
        
        cb7 = new Checkbox(Variables.quest.get(17).getAnswer(2));
        
        cb7.addItemListener((ItemEvent e) -> {
            cb5.setState(false);
            cb6.setState(false);
            cbBoolean8 = false;
            cbText8 = Variables.quest.get(17).getAnswer(2);
        });
        
        JPanel panel5 = new JPanel();
        panel5.setLayout(new GridLayout(3,1));
        panel5.add(cb5);
        panel5.add(cb6);
        panel5.add(cb7);
        panel.add(panel5);
        
       
        panel.add(q9);
        
        List list3=new List(3);
        
        list3.add(Variables.quest.get(18).getAnswer(0));
        list3.add(Variables.quest.get(18).getAnswer(1));
        list3.add(Variables.quest.get(18).getAnswer(2));
        list3.add(Variables.quest.get(18).getAnswer(3));
        
        list3.addItemListener((ItemEvent e) -> {
            cbBoolean9 = e.getItem().toString().equals("2");
            cbText9 = Variables.quest.get(18).getAnswer(Integer.parseInt(e.getItem().toString()));
        });
        
        panel.add(list3);
        
        panel.add(q10);
        
        List list4=new List(3);
        
        list4.add(Variables.quest.get(19).getAnswer(0));
        list4.add(Variables.quest.get(19).getAnswer(1));
        list4.add(Variables.quest.get(19).getAnswer(2));
        list4.add(Variables.quest.get(19).getAnswer(3));
        
        list4.addItemListener((ItemEvent e) -> {
            cbBoolean10 = e.getItem().toString().equals("2");
            cbText10 = Variables.quest.get(19).getAnswer(Integer.parseInt(e.getItem().toString()));
        });
        
        panel.add(list4);
        
         /*
        JCheckBoxio91 = new JCheckbox(Variables.quest.get(8).getAnswer(0), false, cbg1);
        io.addItemListener((ItemEvent e) -> {
            cbText9 = Variables.quest.get(8).getAnswer(0);
            cbBoolean9 = true;
        });
        
        JCheckBoxio92 = new JCheckbox(Variables.quest.get(8).getAnswer(1), false, cbg1);
        io2.addItemListener((ItemEvent e) -> {
            cbText9 = Variables.quest.get(8).getAnswer(1);
            cbBoolean9 = false;
        });
        
        JCheckBoxio93 = new JCheckbox(Variables.quest.get(8).getAnswer(2), false, cbg1);
        io3.addItemListener((ItemEvent e) -> {
            cbText9 = Variables.quest.get(8).getAnswer(2);
            cbBoolean9 = false;
        });
        
        JCheckBoxio94 = new JCheckbox(Variables.quest.get(8).getAnswer(3), false, cbg1);
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
                
        
        */
        next = new JButton("Siguiente");
        next.addActionListener(new ButtonListener());
        
        acctions.add(next);
        acctions.setBorder(new EmptyBorder(20, 50, 20, 50));
        
        panel.add(acctions);
        
        JScrollPane scroll = new JScrollPane();
        
        scroll.setViewportView(panel);
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
            Variables.ans.get(10).anwer(cbText1, cbBoolean1);
            Variables.ans.add(new Question(q2.getText()));
            Variables.ans.get(11).anwer(cbText2, cbBoolean2);
            Variables.ans.add(new Question(q3.getText()));
            Variables.ans.get(12).anwer(cbText3, cbBoolean3);
            Variables.ans.add(new Question(q4.getText()));
            Variables.ans.get(13).anwer(cbText4, cbBoolean4);
            Variables.ans.add(new Question(q5.getText()));
            Variables.ans.get(14).anwer(cbText5, cbBoolean5);
            Variables.ans.add(new Question(q6.getText()));
            Variables.ans.get(15).anwer(cbText6, cbBoolean6);
            Variables.ans.add(new Question(q7.getText()));
            Variables.ans.get(16).anwer(cbText7, cbBoolean7);
            Variables.ans.add(new Question(q8.getText()));
            Variables.ans.get(17).anwer(cbText8, cbBoolean8);
            Variables.ans.add(new Question(q9.getText()));
            Variables.ans.get(18).anwer(cbText9, cbBoolean9);
            Variables.ans.add(new Question(q10.getText()));
            Variables.ans.get(19).anwer(cbText10, cbBoolean10);
            
            
            dispose();
            FormFinal three = new FormFinal();
            three.setVisible(true);
        }
    }
    
}
