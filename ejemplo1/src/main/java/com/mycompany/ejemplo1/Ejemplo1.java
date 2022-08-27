package com.mycompany.ejemplo1;
import javax.swing.*;
public class Ejemplo1 extends JFrame {
private JLabel labell;
    
    public Ejemplo1 () {
       setLayout(null);
       labell = new JLabel("Hola mundo.");
       labell.setBounds(50,50,200,30);
       add(labell);
    }
    
    
    public static void main(String[] args) {
       Ejemplo1 ejemplo= new Ejemplo1();
       ejemplo.setBounds(200,100,1000,600);
       ejemplo.setVisible(true);
    }

}
