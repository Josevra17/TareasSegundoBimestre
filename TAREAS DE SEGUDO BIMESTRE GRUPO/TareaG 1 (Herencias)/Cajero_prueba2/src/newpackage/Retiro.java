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
public class Retiro extends BANCO {
    int retiro;
    int comprobante;
    int caso5;
    @Override
    public void Retiro() {
   
        retiro =(int) Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor ingrese el valor a retirar\n"
                + "1. 10$\n"
                + "2. 20$\n"
                + "3. 50$\n"
                + "4. 100$\n"
                + "5. Otros"));
        switch(retiro){
            case 1 -> {
                saldo= saldo-10;
                JOptionPane.showMessageDialog(null, "Transaccion existosa\n"
                        + "Se ha debitado de su cuenta el monto de: 10$\n"
                        + "Su saldo actual es: "+saldo);
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
                + "CANTIDAD DE RETIRO: "+10+"\n"
                + "SU SALDO ACTUAL ES "+saldo);
 
            }else{
            
            }

            }
            case 2 -> {
                saldo= saldo-20;
                JOptionPane.showMessageDialog(null, "Transaccion existosa\n"
                        + "Se ha debitado de su cuenta el monto de: 20$\n"
                        + "Su saldo actual es: "+saldo);
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
                + "CANTIDAD DE RETIRO: "+20+"\n"
                + "SU SALDO ACTUAL ES "+saldo);
                
            }else{
            
            }
            }
            case 3 -> {
                saldo= saldo-50;
                JOptionPane.showMessageDialog(null, "Transaccion existosa\n"
                        + "Se ha debitado de su cuenta el monto de: 50$\n"
                        + "Su saldo actual es: "+saldo);
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
                + "CANTIDAD DE RETIRO: "+50+"\n"
                + "SU SALDO ACTUAL ES "+saldo);

            }else{
            
            }
            }
            case 4 -> {
                saldo= saldo-100;
                JOptionPane.showMessageDialog(null, "Transaccion existosa\n"
                        + "Se ha debitado de su cuenta el monto de: 100$\n"
                        + "Su saldo actual es: "+saldo);
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
                + "CANTIDAD DE RETIRO: "+100+"\n"
                + "SU SALDO ACTUAL ES "+saldo);
   
            }else{
            
            }
            } 
            case 5 -> {
                caso5 = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL VALOR A RETIRAR"));
                if(saldo>caso5 ){
                    saldo= saldo-caso5;
                    JOptionPane.showMessageDialog(null, "Transaccion existosa\n"
                        + "Se ha debitado de su cuenta el monto de:"+ caso5+"\n"
                        + "Su saldo actual es: "+saldo);
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
                        + "CANTIDAD DE RETIRO: "+caso5+"\n"
                        + "SU SALDO ACTUAL ES "+saldo);

                    }else{
            
            }
                    
                }else{
                    if(caso5>saldo){
                        JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE");
                    }else{
                        if(caso5<5){
                            JOptionPane.showMessageDialog(null, "EL CAJERO NO PERMITE RETIROS MENORES A 5$");
                        }
                    }
                    
                }
            }
        }
        
        
       
    }

    
    
    
   
}
