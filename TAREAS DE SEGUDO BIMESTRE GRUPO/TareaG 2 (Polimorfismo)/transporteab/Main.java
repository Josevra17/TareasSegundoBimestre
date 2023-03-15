/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporteab;

/**
 *
 * @author Lenin
 */
public class Main {
    public static void main (String []args ){
      
       System.out.println("============================================");
        System.out.println("TRANSPORTE");
        System.out.println("TRANSPORTE AEREO");
      Helicoptero helicoptero = new Helicoptero ("BLackhawk",5456,200);
      helicoptero.transportarse();
      Avion avion = new Avion("AIR" , 123, 250);
      avion.transportarse();
      System.out.println("==============================================");
        System.out.println("TRANSPORTE TERRESTRE ");
      Taxi taxi = new Taxi("CHEVROLET","LBA-3060",80);
      taxi.transportarse();
   
      Camion camion = new Camion ("HINO","LHA_7885",120);
      camion.transportarse();
      System.out.println("============================================");
    }
}
