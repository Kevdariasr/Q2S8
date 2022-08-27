package com.mycompany.ejemplo3;
import javax.swing.*;
public class Ejemplo3 extends JFrame {
private JLabel label1,label2;

public Ejemplo3 (){
    setLayout(null);
       label1 = new JLabel("Sistema de facturación");
       label1.setBounds(10,20,300,30);
       add(label1);
    
       label2 = new JLabel("version 1.0");
       label2.setBounds(50,50,200,30);
       add(label2);
}

    public static void main(String[] args) {
       Ejemplo3 Formulario1;
       Formulario1 = new Ejemplo3();
       Formulario1.setBounds(171,134,1024,500);
       Formulario1.setResizable(false);
       Formulario1.setVisible(true);
    }
}
