/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporteab;

/**
 *
 * @author Lenin
 */
public class Taxi extends Vehiculos {
    private String nombre_marca;
    private String numero_placa;
    private int velocidad;
public Taxi(String nombre_marca, String numero_placa, int velocidad) {
        this.nombre_marca = nombre_marca;
        this.numero_placa = numero_placa;
        this.velocidad = velocidad;
    }
    public String getNombre_marca() {
        return nombre_marca;
    }

    public void setNombre_marca(String nombre_marca) {
        this.nombre_marca = nombre_marca;
    }

    public String getNumero_placa() {
        return numero_placa;
    }

    public void setNumero_placa(String numero_placa) {
        this.numero_placa = numero_placa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    
    
    
    @Override
    public void transportarse(){
        System.out.println("TAXI");
        System.out.println("Nombrede la marca del Taxi:"+getNombre_marca());
        System.out.println("Numero de la Placa :"+getNumero_placa());
        System.out.println("La velocidad maxima del Taxi es :"+getVelocidad()+"km/h");
    }

    
}
