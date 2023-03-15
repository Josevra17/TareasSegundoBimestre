/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

/**
 *
 * @author Jose
 */
public class Jugador {
    //ATRIBUTOS

    private String nombre;
    int puntaje;
    //constructor

    public Jugador(String nombre) {
        this.nombre = nombre;
        
    }

    //METODOS GET Y SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    //METODO MOSTRAR
    void mostrar() {
        System.out.println(nombre+"   "+puntaje);
    }
}
