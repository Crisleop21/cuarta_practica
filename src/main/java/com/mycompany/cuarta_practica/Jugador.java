
package com.mycompany.cuarta_practica;


public class Jugador {
    int posicion;
    int id;

    //constructor
    Jugador(int id){
        this.id = id;

    }
    
    //metodo para poder tirar los dados
    void tirar(){
        int  dado1 = (int)(Math.random()*6)+1;
        int  dado2 = (int)(Math.random()*6)+1;
            
        if(dado1 > 6){
            dado1 = 6;
        }
        if(dado2 > 6){
            dado2 = 6;
        }
        this.posicion += dado1+dado2;
        
        this.comprobar_reglas();
    }
    
    
    void caer(int casillaA, int casillaB){
        System.out.printf("Jugador %d cae  de la casilla %d", this.id, casillaA, casillaB);
        this.posicion = casillaB;

    }

    void subir(int casillaA, int casillaB){
        System.out.printf("Jugador %d sube  de la casilla %d", this.id, casillaA, casillaB);
        this.posicion = casillaB;

    }
    
    void comprobar_reglas(){
        switch (this.posicion) {
            case 12:
                this.caer(12, 3);                
                break;
            case 15:
                this.subir(15,27);
                break;
            case 35:
                this.caer(35, 25);                
                break;
            case 42:
                this.subir(42,50);
                break;
            case 55:
                this.caer(55, 25);                
                break;
            case 60:
                this.subir(60,80);
                break;
            case 72:
                this.caer(72, 33);                
                break;
            case 85:
                this.subir(85,94);
                break;
        }
    
    }
    
}
