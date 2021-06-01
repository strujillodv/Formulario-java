
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import javax.swing.border.EmptyBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author struj
 */
public class FormOne extends JFrame {
    
    static JTextField JTfirtName, JTlastName, JTdocumentType, JTdocumentNumber, JTurlImg, JTbirthday, JTprofession, JTgener, JTcity, JTtelephone;    
    static JLabel title, img, JLfirtName, JLlastName, JLdocumentType, JLdocumentNumber, JLurlImg, JLbirthday, JLprofession, JLgener, JLcity, JLtelephone;
    static JButton next;
    static JScrollPane scroll;
    static ImageIcon icono;
    static Image imagen;
    static ImageIcon iconoEscalado;
    static JComboBox listImg;
    static JComboBox listGener;
    static JComboBox listType;
    
    private String nameImg;

    public FormOne() {
        
        super("Información de Usuario");
        this.nameImg = "man";

        icono = new ImageIcon(getClass().getResource(Variables.img));
        imagen = icono.getImage();
        iconoEscalado = new ImageIcon (imagen.getScaledInstance(160,160,Image.SCALE_SMOOTH));
        
        img = new JLabel();        
        img.setIcon(iconoEscalado);
        
        title = new JLabel("Información de Usuario");
        title.setForeground(Color.WHITE);
        title.setBorder(new EmptyBorder(10, 0, 10, 0));
        
        JLfirtName = new JLabel("Nombre");
        JLlastName = new JLabel("Apellido");
        JLdocumentType = new JLabel("Tipo de documento");
        JLdocumentNumber = new JLabel("Numero de documento");
        JLurlImg = new JLabel("Seleccione un Avatar");
        JLbirthday = new JLabel("Fecha de Nacimiento");
        JLprofession = new JLabel("Profesión");
        JLgener = new JLabel("Genero");
        JLcity = new JLabel("Ciudad");
        JLtelephone = new JLabel("Telefono");
        
        JTfirtName = new JTextField();
        JTlastName = new JTextField();
        JTdocumentType = new JTextField();
        JTdocumentNumber = new JTextField();
        JTurlImg = new JTextField();
        JTbirthday = new JTextField();
        JTprofession = new JTextField();
        JTgener = new JTextField();
        JTcity = new JTextField();
        JTtelephone = new JTextField();
        
        next = new JButton("Siguiente");
        next.addActionListener(new ButtonListener());
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,2,0,10));
        
        JPanel panelName = new JPanel();
        panelName.setLayout(new GridLayout(20,1,0,10));
        
        
        panelName.add(JLfirtName);
        panelName.add(JTfirtName);
        panelName.add(JLlastName);
        panelName.add(JTlastName);
        
        listGener=new JComboBox();
        
        listGener.addItem("Masculino");
        listGener.addItem("Femenino");
        listGener.addActionListener((ActionEvent e) -> {
            if (listGener.getSelectedItem().toString().equals("Femenino")) {
                nameImg = "woman";
            } else {
                nameImg = "man";
            }
        });
        
        panelName.add(JLgener);
        panelName.add(listGener);
        
        
        listImg=new JComboBox();
        
        listImg.addItem("Usuario 1");
        listImg.addItem("Usuario 2");
        listImg.addItem("Usuario 3");
        listImg.addActionListener((ActionEvent e) -> {
            String imgSelect = listImg.getSelectedItem().toString();
            switch (imgSelect) {
                case "Usuario 1":
                    Variables.img = "/img/"+nameImg+"1.png";                    
                    break;
                case "Usuario 2":
                    Variables.img = "/img/"+nameImg+"2.png";
                    break;
                case "Usuario 3":
                    Variables.img = "/img/"+nameImg+"3.png";
                    break;
                default:
                    Variables.img = "/img/"+nameImg+"1.png";
                    break;
            }
            icono = new ImageIcon(getClass().getResource(Variables.img));
            imagen = icono.getImage();
            iconoEscalado = new ImageIcon (imagen.getScaledInstance(160,160,Image.SCALE_SMOOTH));
            img.setIcon(iconoEscalado);
        });
        
        panelName.add(JLurlImg);
        panelName.add(listImg);
        
        panelName.add(JLdocumentType);
        
        listType=new JComboBox();
        
        listType.addItem("C.C.");
        listType.addItem("C.E.");
        listType.addItem("T.I.");
        
        panelName.add(listType);
        panelName.add(JLdocumentNumber);
        panelName.add(JTdocumentNumber);
        panelName.add(JLbirthday);
        panelName.add(JTbirthday);
        panelName.add(JLprofession);
        panelName.add(JTprofession);
        panelName.add(JLcity);
        panelName.add(JTcity);
        panelName.add(JLtelephone);
        panelName.add(JTtelephone);
        
        JPanel panelImg = new JPanel();
        
        panelImg.add(img);
        
        
        panel.add(panelName);
        panel.add(panelImg);
        
        JPanel acctions = new JPanel();
        acctions.setBorder(new EmptyBorder(20, 0, 20, 0));
        
        acctions.add(next);
        
        JPanel panelMain = new JPanel();
        panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));
        panelMain.setBorder(new EmptyBorder(10, 20, 10, 20));        
        
        panelMain.add(title);
        panelMain.add(panel);
        panelMain.add(acctions);
        
        JScrollPane scroll = new JScrollPane();
        
        scroll.setViewportView(panelMain);
        scroll.setBounds(0,0,494,565);
        scroll.setBorder(new EmptyBorder(0, 0, 0, 0));
        scroll.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
        
        add(scroll);
        
        //Configuración del marco General
        Image icon = new ImageIcon(getClass().getResource("/resource/icon.png")).getImage();
        setIconImage(icon);
        setLayout(null);
        setSize(500,600);
        setLocation(Variables.positionX, Variables.positionY);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
    
    private class ButtonListener implements ActionListener {
        
        // Metodo para los eventos de los botones
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            Variables.positionX = getLocation().x;
            Variables.positionY = getLocation().y;
            
            User newUser = new User(
                    JTfirtName.getText(),
                    JTlastName.getText(),
                    listType.getSelectedItem().toString(),
                    JTdocumentNumber.getText(),
                    Variables.img,
                    JTbirthday.getText(),
                    JTprofession.getText(),
                    listGener.getSelectedItem().toString(),
                    JTcity.getText(),
                    JTtelephone.getText()
                    
            );
            
            Variables.user = newUser;
            System.out.println(newUser.getFirstName());
            
            
            dispose();
            FormTwo two = new FormTwo();
            two.setVisible(true);
        }
    }
}
