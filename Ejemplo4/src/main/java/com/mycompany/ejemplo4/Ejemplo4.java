package com.mycompany.ejemplo4;
import javax.swing.*;
public class Ejemplo4 extends JFrame{
private JLabel label1,label2,label3;

public Ejemplo4 (){
    setLayout(null);
       label1 = new JLabel("Rojo");
       label1.setBounds(10,20,100,30);
       add(label1);
    
       label2 = new JLabel("verde");
       label2.setBounds(10,60,100,30);
       add(label2);
       
       label3 = new JLabel("Azul");
       label3.setBounds(10,100,100,30);
       add(label3);
}

    public static void main(String[] args) {
    Ejemplo4 Formulario1 = new Ejemplo4();
       Formulario1.setBounds(0,0,300,200);
       Formulario1.setVisible(true);
    }
}
