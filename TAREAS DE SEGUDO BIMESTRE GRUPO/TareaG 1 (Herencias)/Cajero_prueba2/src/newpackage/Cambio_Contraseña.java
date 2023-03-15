/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose
 */
public class Cambio_Contraseña extends BANCO {
    int opcamb;
    int pass;
    @Override
    public void Cambio_Contraseña(){
        opcamb=Integer.parseInt(JOptionPane.showInputDialog(null,"Estimado cliente\n"
                + "Desea cambiar la contraseña\n"
                + "1. SI\n"
                + "2. NO"));
        if(opcamb==1){
            pass=Integer.parseInt(JOptionPane.showInputDialog(null,"POR FAVOR INGRESE SU CLAVE ACTUAL\n"));
            if(pass==2309){
                 pass=Integer.parseInt(JOptionPane.showInputDialog(null,"POR FAVOR INGRESE SU CLAVE NUEVA\n"));
                 if(pass!=2309){
                      pass=Integer.parseInt(JOptionPane.showInputDialog(null,"POR FAVOR INGRESE SU CLAVE NUEVAMENTE\n"));
                      if(pass==pass){
                            cont=pass;
                           JOptionPane.showMessageDialog(null, "SU CLAVE SE CAMBIO EXITOSAMENTE");
                      }else{
                          JOptionPane.showMessageDialog(null, "DATOS INCORRECTOS");
                      }
                 }else{
                     JOptionPane.showMessageDialog(null, "DATOS INCORRECTOS");
                 }
            }else {
                JOptionPane.showMessageDialog(null, "DATOS INCORRECTOS");
            }
        }else{
        JOptionPane.showMessageDialog(null, "GRACIAS POR UTILIZAR NUESTROS SERVICIOS");
        }
    
    }
   
    
    
    }
    

