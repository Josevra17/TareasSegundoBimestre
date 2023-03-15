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
public class CAJERO extends BANCO {
        BANCO dep = new Deposito();
        BANCO ret = new Retiro();
        BANCO cons = new Consulta_Saldo();
        BANCO contra = new Cambio_Contraseña();
        
        @Override
        public void Cajero(){
            int c;
            int p,opcion;
            
            JOptionPane.showMessageDialog(null, "                                       BUENAS TARDES\n"
                + "BIENVENIDO A LOS CAJEROS AUTOMATICOS DEl BANCO PICHINCHA\n");
                c = Integer.parseInt(JOptionPane.showInputDialog("POR FAVOR\n"
                + "INGRESE SU CONTRASEÑA"));
        if(cont==c){
            p = 1;
            JOptionPane.showMessageDialog(null,"BIEVENIDO\n"
                    + "VERIFICANDO ESPERE....\n"
                    + "======================================");
        }else{
            p=0;
            c = Integer.parseInt(JOptionPane.showInputDialog("CONTRASEÑA INCORRECTA\n"
                    + "POR FAVOR\n"
                + "INGRESE SU CONTRASEÑA NUEVAMENTE\n"
                    + "Le queda 2 Intentos"));
            if(cont==c){
                 p = 1;
                JOptionPane.showMessageDialog(null,"BIEVENIDO\n"
                    + "VERIFICANDO ESPERE....\n"
                    + "======================================");
            }else{
                p=0;
                c = Integer.parseInt(JOptionPane.showInputDialog("CONTRASEÑA INCORRECTA\n"
                    + "POR FAVOR\n"
                + "INGRESE SU CONTRASEÑA NUEVAMENTE\n"
                    + "Le queda 1 Intento"));
                if(c==cont){
                    p = 1;
            JOptionPane.showMessageDialog(null,"BIEVENIDO\n"
                    + "VERIFICANDO ESPERE....\n"
                    + "======================================");   
                }else{
                    JOptionPane.showMessageDialog(null,"POR FAVOR ACERCARSE CON LA BREVEDAD PROSIBLE A NUESTRAS OFICINAS");
                }
            }
        }
        
        if(p==1){
            do{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,""
                + "1. DEPOSITO\n"
                + "2. RETIRO\n"
                + "3. CONSULTA DE SALDO\n"
                + "4. CAMBIAR LA CONTRASEÑA\n"
                + "5. Salir"));      
                switch(opcion){
                case 1 -> {
                    dep.Deposito();
                    opcion=5;
                }
                case 2 -> {
                    ret.Retiro();
                    opcion=5;
                }
                case 3 -> {
                    cons.Consulta_Saldo();
                    //opcion=5;
                }
                case 4-> {
                    contra.Cambio_Contraseña();
                    opcion=5;
                }
                case 5-> {
                JOptionPane.showMessageDialog(null,"SALIENDO...");
                }
                default -> {
                    JOptionPane.showMessageDialog(null,"POR FAVOR INGRESE UNA OPCION VALIDA\n");
                }
            }
            }while(opcion !=5);  
        }
    
        
        }
        
}
