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
public class Deposito extends BANCO {
    int deposito;
    int comprobante;
    @Override
    public void Deposito() {
        deposito=(int) Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor ingrese el valor a depositar\n"));
        if(deposito>=5){
            saldo=deposito+saldo;
            JOptionPane.showMessageDialog(null, ""
                    + "ESPERE....\n"
                    + "====================================\n"
                    + "TRANSACCIO EXITOSA\n"
                    + "                                    \n"
                    + "Su saldo actual es : "+saldo+"\n");
            comprobante= Integer.parseInt(JOptionPane.showInputDialog(null,""
                    + "DESEA IMPRIMIR SU COMPROBANTE\n"
                    + "Se descontara 0.30$ de su cuenta\n"
                    + "1. SI\n"
                    + "2. NO"));
            if(comprobante==1 && saldo>0.30){
                saldo=saldo-0.30;
                JOptionPane.showMessageDialog(null, ""
                + "                                     BANCO PICHICHA                                  \n"
                + "                      AV.BERNARDO VALDIVIEZO Y 10 DE AGOSTO                       \n"
                + "CANTIDAD DE DEPOSITO: "+deposito+"\n"
                + "SU SALDO ACTUAL ES "+saldo);
           
            }else{
            
            }            
        }else{
            JOptionPane.showMessageDialog(null,"EL CAJERO NO ACEPTA DEPOSITOS MENORES A 5$");                   
        }
        
        
        
    }

    
    
    
}
