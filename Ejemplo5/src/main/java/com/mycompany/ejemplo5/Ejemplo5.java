package com.mycompany.ejemplo5;
import javax.swing.*;
import java.awt.event.*;
public class Ejemplo5 extends JFrame implements ActionListener {

    JButton boton1,boton2;
    public Ejemplo5(){
       setLayout(null);
       boton1 = new JButton("Finalizar");
       boton1.setBounds(150,125,200,120);
       add(boton1);  
    }
@Override
public void actionPerformed(ActionEvent e) {
      
 if (e.getSource()==boton1){
 System.exit(0);
    }
        
 }

    public static void main(String[] args) {
       Ejemplo5 Formulario1 = new Ejemplo5();
       Formulario1.setBounds(0,0,450,350);
       Formulario1.setVisible(true);;
    }



}
