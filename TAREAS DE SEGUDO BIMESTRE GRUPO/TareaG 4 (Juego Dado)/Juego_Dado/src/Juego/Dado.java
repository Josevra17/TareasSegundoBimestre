/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

/**
 *
 * @author Jose
 */
public class Dado {
    //ATRIBUTOS

    private int numero;
    boolean volverALanzar = false;

    //CONSTRUCTOR
    public Dado(int numero) {
        this.numero = numero;
        
    }

    Dado() {
    }

    //METODOS GET Y SET
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isVolverALanzar() {
        return volverALanzar;
    }

    public void setVolverALanzar(boolean volverALanzar) {
        this.volverALanzar = volverALanzar;
    }

    //Metodo Mostrar
    void mostrar() {
        System.out.println(numero + " ");
    }

}
