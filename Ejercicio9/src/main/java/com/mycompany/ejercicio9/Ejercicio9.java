package com.mycompany.ejercicio9;
import javax.swing.*;
public class Ejercicio9 extends JFrame {
private JTextField textfield1;
private JScrollPane scrollpanel;
private JTextArea textarea1;

public Ejercicio9 (){
setLayout(null);
textfield1 = new JTextField();
textfield1.setBounds(10,10,200,30);
add(textfield1); 


textarea1 = new JTextArea();
scrollpanel = new JScrollPane(textarea1);
scrollpanel.setBounds(10,50,400,300);
add(scrollpanel);


}

    public static void main(String[] args) {
        
       Ejercicio9 Formulario1 = new Ejercicio9();
       Formulario1.setBounds(0,0,540,400);
       Formulario1.setVisible(true);
        
        
    }
}
