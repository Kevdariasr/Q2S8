package com.mycompany.ejercicio8;
import javax.swing.*;
import java.awt.event.*;
public class Ejercicio8 extends JFrame implements ActionListener {
private JTextField textfield1,textfield2;
private JButton boton1;
    
public Ejercicio8 (){
setLayout(null);
textfield1 = new JTextField();
textfield1.setBounds(10,10,100,30);
add(textfield1);     

textfield2 = new JTextField();
textfield2.setBounds(10,50,100,30);
add(textfield2);

boton1 = new JButton("sumar");
boton1.setBounds(10,90,100,30);
add(boton1);  
boton1.addActionListener(this);     

}
    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource()==boton1){
           String cad1 = textfield1.getText();
           String cad2 = textfield1.getText();
           int a1 = Integer.parseInt(cad1);
           int a2 = Integer.parseInt(cad2);
           int suma=a1+a2;
           String total = String.valueOf(suma);
           setTitle(total);
    
    }
 }
    
    public static void main(String[] args) {
        Ejercicio8 Formulario1 = new Ejercicio8();
       Formulario1.setBounds(0,0,140,150);
       Formulario1.setVisible(true);
    }

    
}
