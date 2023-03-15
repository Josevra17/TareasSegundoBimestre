
package juego;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose
 */
public class Jugador {
    private String nombre;
    private int puntos;
    //constructor

    public Jugador(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    void mostrar(){
         JOptionPane.showMessageDialog(null,"JUGADOR : "+nombre+"\n"+"PUNTAJE : "+puntos);
    }
}
