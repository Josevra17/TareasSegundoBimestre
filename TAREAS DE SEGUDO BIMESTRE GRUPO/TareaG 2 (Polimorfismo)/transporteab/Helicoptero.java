/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporteab;

/**
 *
 * @author Lenin
 */
public class Helicoptero extends Aereo {
   private String nombre ;
    
    private  int numero;
    private int velocidad;

    public Helicoptero(String nombre, int numero, int velocidad) {
        this.nombre = nombre;
        this.numero = numero;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    
    

   
   
   @Override
    public void transportarse (){
        System.out.println("HELICOPTERO");
        System.out.println("nombre del Helicoptero:" +getNombre());
        System.out.println("Numero de Serie :"+getNumero());
        System.out.println("A la velocidad que va el helicoptero es :" +getVelocidad()+"km/h");
       
    }

    
}
