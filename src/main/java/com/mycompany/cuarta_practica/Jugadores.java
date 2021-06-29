
package com.mycompany.cuarta_practica;

import java.util.ArrayList;


public abstract class Jugadores {
    
    ArrayList Nombre;
    ArrayList Apellido;
    
    
    //getters and setter
    public ArrayList getNombre() {
        return Nombre;
    }

    public void setNombre(ArrayList Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList getApellido() {
        return Apellido;
    }

    public void setApellido(ArrayList Apellido) {
        this.Apellido = Apellido;
    }
// generamos el constructor
    public Jugadores(ArrayList Nombre, ArrayList Apellido) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }
    
    //metodos a utilizar
    public abstract void IngresarNombre (String Nombres);
    public abstract void IngresarApellidos (String Apellidos);
    public abstract void PartidasJugadas (int PartidasJugadas);
    public abstract void PartidasGanadas (int PartidasGanadas);
    public abstract void PartidasPerdidas (int PartidasPerdidas);
    
    

    
    
}
