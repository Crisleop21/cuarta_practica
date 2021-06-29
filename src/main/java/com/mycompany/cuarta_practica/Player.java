/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cuarta_practica;

import java.util.ArrayList;

/**
 *
 * @author CRIS
 */
public class Player extends Jugadores{

    public Player(ArrayList Nombre, ArrayList Apellido) {
        super(Nombre, Apellido);
    }

    @Override
    public void IngresarNombre(String Nombres) {
        super.Nombre.add(Nombres);
    }

    @Override
    public void IngresarApellidos(String Apellidos) {
        super.Apellido.add(Apellidos);
        
    }

    @Override
    public void PartidasJugadas(int PartidasJugadas) {
        String mostrarPartidas = "";
        if (super.Nombre.contains(PartidasJugadas)==true){
            mostrarPartidas =  super.Nombre.get(super.Nombre.indexOf(PartidasJugadas)).toString();        
        }else{
            mostrarPartidas = "No tiene partidas jugadas";
            
        }
    }

    @Override
    public void PartidasGanadas(int PartidasGanadas) {
         String mostrarPartidas = "";
        if (super.Nombre.contains(PartidasGanadas)==true){
            mostrarPartidas =  super.Nombre.get(super.Nombre.indexOf(PartidasGanadas)).toString();        
        }else{
            mostrarPartidas = "No tiene partidas jugadas";
            
        }
    }

    @Override
    public void PartidasPerdidas(int PartidasPerdidas) {
         String mostrarPartidas = "";
        if (super.Nombre.contains(PartidasPerdidas)==true){
            mostrarPartidas =  super.Nombre.get(super.Nombre.indexOf(PartidasPerdidas)).toString();        
        }else{
            mostrarPartidas = "No tiene partidas jugadas";
            
        }
    }
    
}
