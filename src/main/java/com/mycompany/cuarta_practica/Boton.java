/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cuarta_practica;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Boton extends JButton implements ActionListener{
    
    public Boton(int pos_x, int pos_y, int ancho, int alto){
        setBounds(pos_x, pos_y, ancho, alto);
             
        addActionListener(this);
        
    }
    
        
    public void setNombre(int f, int c){
        setText((f+1)+" , "+(c+1));
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       setBackground(Color.BLUE);
       
    }
    
    
}
