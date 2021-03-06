/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cuarta_practica;

import java.util.Random;
import javax.swing.*;

/**
 *
 * @author CRIS
 */
public class Intro extends javax.swing.JFrame {
       
    int filas = 7;
    int columnas = 7;
    int ambas;
    
    
    Boton [][] botones = new Boton[filas][columnas];
    
    /**
     * Creates new form Intro
     */
    public Intro() {
        initComponents();
        Botones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTitulo = new javax.swing.JLabel();
        jtboton = new javax.swing.JButton();
        jlPosicionJugador1 = new javax.swing.JLabel();
        poJu1 = new javax.swing.JLabel();
        jlPosicionJugador2 = new javax.swing.JLabel();
        poJu2 = new javax.swing.JLabel();
        jbdado1 = new javax.swing.JLabel();
        jbdado2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        mostrardado1 = new javax.swing.JLabel();
        mostrardado2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTitulo.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTitulo.setText("Bienvenido al Juego Serpientes y Escaleras");

        jtboton.setText("Tirar Dados");
        jtboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbotonActionPerformed(evt);
            }
        });

        jlPosicionJugador1.setText("Posicion Jugador 1:");

        poJu1.setText("1");

        jlPosicionJugador2.setText("Posicion Jugador 2:");

        poJu2.setText("1");

        jbdado1.setText("Dado  Jugador 1");

        jbdado2.setText("Dado Jugador 2:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        mostrardado1.setText("jLabel1");

        mostrardado2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbdado1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(mostrardado1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(mostrardado2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jlPosicionJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(poJu1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jlPosicionJugador2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(poJu2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbdado2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jtboton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlPosicionJugador1)
                            .addComponent(poJu1))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlPosicionJugador2)
                            .addComponent(poJu2))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mostrardado1)
                            .addComponent(jbdado1))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbdado2)
                            .addComponent(mostrardado2))
                        .addContainerGap(179, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtboton)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(17, 17, 17))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    public void Principal(){
        Users us = new Users();
        us.setVisible(true);
        this.setVisible(false);    
    }
    
    private String[] j1 = new String[49];
    private String[] j2 = new String[49];
    
    private int posj1 = 0;
    private int posj2 = 0;
    
    private int turno = 0;
    
    private Random ran = new Random();
    
      
    private void jtbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbotonActionPerformed
       
        
        if (turno == 0){
            JOptionPane.showMessageDialog(null, "Tuno Jugador uno ");
            
            int espacios = ran.nextInt(6)+1;
            int dado2 = ran.nextInt(6)+1;
            
            posj1 += espacios;
            
            
            int postablero = posj1 +1;
            JOptionPane.showMessageDialog(null, "has sacado un " + espacios + "te mueves a la posicion " +postablero);
             mostrardado1.setText(espacios+"");
             mostrardado2.setText(dado2+"");
          
            for(int i = 0; i < j1.length; i++){
                
                if(posj1 == 2){
                    JOptionPane.showMessageDialog(null, "pisas una escalera subes a la casilla 15");
                    posj1 = 14;                    
                }
                if(posj1 == 10){
                    JOptionPane.showMessageDialog(null, "pisas una escalera subes a la casilla 15");
                    posj1 = 15;                    
                }
                if(posj1 == 35){
                    JOptionPane.showMessageDialog(null, "pisas una escalera subes a la casilla 40");
                    posj1 = 40;                    
                }
                if(posj1 == 18){
                    JOptionPane.showMessageDialog(null, "pisas una serpiente bajas a la casilla 5");
                    posj1 = 5;                    
                }
                
                if(posj1 == 48){
                    JOptionPane.showMessageDialog(null, "pisas una serpiente bajas a la casilla 8");
                    posj1 = 8;                    
                }
                
                if(posj1 == 20 ){
                    JOptionPane.showMessageDialog(null, "pisas una serpiente bajas a la casilla 11");
                    posj1 = 11;                    
                }
                if(i == posj1){
                    j1[i] = "x";
                }else{
                    j1[i] = "_";
                }
                
                //segundo jugador
                if(posj2 == 2){
                    JOptionPane.showMessageDialog(null, "pisas una escalera subes a la casilla 15");
                    posj2 = 14;                    
                }
                if(i == posj2){
                    j2[i] = "o";
                }else{
                    j2[i] = "_";
                }
                
            }
            
            turno = 1;
            
            if(posj1 >= 49){
                JOptionPane.showMessageDialog(null,"Jugador 1 ha ganado! ");
            }
            
        }else  if (turno == 1){
            JOptionPane.showMessageDialog(null, "Tuno Jugador dos ");
            
            int espacios = ran.nextInt(6)+1;
            int dado2 = ran.nextInt(6)+1;
            
            posj2 += espacios;
            
            int postablero = posj2 +1;
            JOptionPane.showMessageDialog(null, "has sacado un " + espacios + " te mueves a la posicion " +postablero);
            mostrardado1.setText(espacios+"");
            mostrardado2.setText(dado2+"");
            for(int i = 0; i < j2.length; i++){
                
                if(posj2 == 2){
                    JOptionPane.showMessageDialog(null, "pisas una escalera subes a la casilla 15");
                    posj2 = 14;                    
                }
                if(posj2 == 2){
                    JOptionPane.showMessageDialog(null, "pisas una escalera subes a la casilla 15");
                    posj2 = 14;                    
                }
                if(posj2 == 10){
                    JOptionPane.showMessageDialog(null, "pisas una escalera subes a la casilla 15");
                    posj2 = 15;                    
                }
                if(posj2 == 35){
                    JOptionPane.showMessageDialog(null, "pisas una escalera subes a la casilla 40");
                    posj2 = 40;                    
                }
                if(posj2 == 18){
                    JOptionPane.showMessageDialog(null, "pisas una serpiente bajas a la casilla 5");
                    posj2 = 5;                    
                }
                
                if(posj2 == 48){
                    JOptionPane.showMessageDialog(null, "pisas una serpiente bajas a la casilla 8");
                    posj2 = 8;                    
                }
                
                if(posj2 == 20 ){
                    JOptionPane.showMessageDialog(null, "pisas una serpiente bajas a la casilla 11");
                }
                    posj2 = 11;
                if(i == posj2){
                    j2[i] = "x";
                }else{
                    j2[i] = "_";
                }
                
                //segundo jugador
                if(posj1 == 2){
                    JOptionPane.showMessageDialog(null, "pisas una escalera subes a la casilla 15");
                    posj1 = 14;                    
                }
                if(i == posj1){
                    j1[i] = "o";
                }else{
                    j1[i] = "_";
                }
                
            }
           
            turno = 1;
            
            if(posj2 >= 49){
                JOptionPane.showMessageDialog(null,"Jugador 2 ha ganado! ");
            }
        }
      
    }//GEN-LAST:event_jtbotonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Intro().setVisible(true);
            }
        });
    }
    
     private int contador = 49;
    
   public void Botones(){
               
        for (int fila = 0; fila<filas ; fila++){
            for(int columna = botones[0].length-1; columna >= 0; columna--){
            botones[fila][columna] = new Boton(49*columna,55*fila,55,55);
            botones[fila][columna].setText(contador+"");
            //botones[fila][columna].setEnabled(false);
//botones[fila][columna].setNombre(fila,columna);
                jPanel2.add(botones[fila][columna]);
            contador--;  
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jTitulo;
    private javax.swing.JLabel jbdado1;
    private javax.swing.JLabel jbdado2;
    private javax.swing.JLabel jlPosicionJugador1;
    private javax.swing.JLabel jlPosicionJugador2;
    private javax.swing.JButton jtboton;
    private javax.swing.JLabel mostrardado1;
    private javax.swing.JLabel mostrardado2;
    private javax.swing.JLabel poJu1;
    private javax.swing.JLabel poJu2;
    // End of variables declaration//GEN-END:variables
}
