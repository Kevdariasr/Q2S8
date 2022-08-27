package com.mycompany.ejemplo2;
import javax.swing.*;
public class Ejemplo2 extends JFrame{

    Ejemplo2(){
        setLayout(null);
    }
    
    public static void main(String[] args) {
       Ejemplo2 Formulario1;
       Formulario1 = new Ejemplo2();
       Formulario1.setBounds(171,134,1024,500);
       Formulario1.setResizable(false);
       Formulario1.setVisible(true);
    }
}
