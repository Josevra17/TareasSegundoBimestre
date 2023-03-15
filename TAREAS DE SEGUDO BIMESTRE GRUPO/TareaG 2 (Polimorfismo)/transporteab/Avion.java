/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporteab;

/**
 *
 * @author Lenin
 */
public class Avion  extends Aereo {
    private String nombre_avion;
    private int numero_avion;
    private int velocidad_avion;
     public Avion(String nombre, int numero, int velocidad) {
        this.nombre_avion = nombre;
        this.numero_avion = numero;
        this.velocidad_avion = velocidad;
    }

    public String getNombre_avion() {
        return nombre_avion;
    }

    public void setNombre_avion(String nombre_avion) {
        this.nombre_avion = nombre_avion;
    }

    public int getNumero_avion() {
        return numero_avion;
    }

    public void setNumero_avion(int numero_avion) {
        this.numero_avion = numero_avion;
    }

    public int getVelocidad_avion() {
        return velocidad_avion;
    }

    public void setVelocidad_avion(int velocidad_avion) {
        this.velocidad_avion = velocidad_avion;
    }
    

    
    
    @Override
       public void transportarse (){
           System.out.println("AVION");
        System.out.println("Nombre del Avion :"+getNombre_avion());
        System.out.println("Numero de serie del avion :" +getNumero_avion());
        System.out.println("La velocidad  maxima que va el avion es "+getVelocidad_avion()+"km/h");
    }

    
   
}
