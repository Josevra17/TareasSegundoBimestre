
package juego;

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author Jose
 */
public class Juego {

    private Dado[] dados=new Dado[5];
    private Jugador[] jugadores;
    void menu(){       
        inicializaciones();
        registrarJugadores();
        jugar();
        mostrar();
    }
    
    void inicializaciones(){
        for(int i=0;i<dados.length;i++){
            dados[i]=new Dado(1,true);
        }
                
        int num=Integer.parseInt(JOptionPane.showInputDialog(null,"CUANTOS JUADORES SERAN: "));
        //inicializar el arreglo jugadores
        jugadores=new Jugador[num];
    }
    
    void registrarJugadores(){
        String nom ,m;
        for(int i=0;i<jugadores.length;i++){
            nom=JOptionPane.showInputDialog(null,"Nombre del jugador"+(i+1));
            jugadores[i]=new Jugador(nom,0);
        }
            m="--------------- Lista de jugadores ---------------\n";
        for (int j = 0; j < jugadores.length; j++) {   
            m=m+"Jugador "+(j+1)+" =   "+ jugadores[j].getNombre()+"\n";
        }
        JOptionPane.showMessageDialog(null, m);
    }
    
    void jugar() {
        //System.out.print("jugar");4\
        primerLanzamiento();
    }
    void primerLanzamiento(){
        String[] opc = {"Lanzar Dados Nuevamente", "Terminar Turno"};
        String m;
        for (int i = 0; i < jugadores.length; i++) {
            JOptionPane.showMessageDialog(null, "JUGADOR "+(i+1));
            m="==============PRIMER INTENTO ===============\n";
            for (int j = 0; j < dados.length; j++) {
                int nr = (int) (Math.random() * 6 + 1);
                dados[j] = new Dado(nr, false);
                m = m + "       ===>          " + dados[j].getNumero() + "\n";
                m = m + "           " + "         DADO " + (j + 1) + "\n";
            }
            dados[1].mostrar(m);
            m = " ";
            int op = JOptionPane.showOptionDialog(null,"ELEGIR DADO(S) QUE VOLVERA A LANZAR", "OPCIONES  ", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opc, opc[0]);
            if (op==0) {
                segundoLanzamiento(i);
            }
            puntos(i);
            jugadores[i].mostrar();

        }
    }
    void mostrar() {
        String m,m2="";
        int n = 0, mayor,x=0;
        mayor = 0;
        m = "==================== PUNTAJES FINALES  ======================\n";
        for (int j = 0; j < jugadores.length; j++) {
            if (jugadores[j].getPuntos() > jugadores[mayor].getPuntos()) {
                mayor = j;
            } else {
                if (jugadores[j].getPuntos() == jugadores[mayor].getPuntos()) {
                    n++;
                    m2 = m2 + "Jugador =  " + jugadores[j].getNombre() + "  Puntaje es = " + jugadores[j].getPuntos() + "\n";
                    x=jugadores[j].getPuntos();
                }
            }
            m = m + "JUGADOR  " + (j + 1) + "=  " + jugadores[j].getNombre() + "  PUNTAJE = " + jugadores[j].getPuntos() + "\n";
        }
        if (n <= 1 ) {
            m = m + ".............................................................................................................................\n";
            m = m + "********************  GANADOR   ********************\n";
            m = m + "JUGADOR  =  " + jugadores[mayor].getNombre() + "  PUNTAJE = " + jugadores[mayor].getPuntos() + "\n";
            JOptionPane.showMessageDialog(null, m);

        } else {
            if (n>1 ) {
                m2 = m + ".............................................................................................................................\n"
                       + "============== EMPATE   ===================\n" + m2;
                JOptionPane.showMessageDialog(null, m2);
            }
        }
    }
    void segundoLanzamiento(int i) {
        String[] opc = {"Volver a Tirar", "Cancelar y \nTerminar Turno"};
        String m="";
                JCheckBox group = new JCheckBox();
                String msgString1 = "Seleccione el dado que quiere volver a tirar";
                JRadioButton opt = new JRadioButton("Dado 1  ++> = "+dados[0].getNumero());
                JRadioButton opt1 = new JRadioButton("Dado 2  ++> = "+dados[1].getNumero());
                JRadioButton opt2 = new JRadioButton("Dado 3  ++> = "+dados[2].getNumero());
                JRadioButton opt3 = new JRadioButton("Dado 4  ++> = "+dados[3].getNumero());
                JRadioButton opt4 = new JRadioButton("Dado 5  ++> = "+dados[4].getNumero());
                group.add(opt);
                group.add(opt1);
                group.add(opt2);
                group.add(opt3);
                group.add(opt4);
                Object[] array = {msgString1, opt, opt1, opt2, opt3, opt4};
                int op = JOptionPane.showOptionDialog(null, array, "Dados", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opc, opc[0]);
                if (op == 0) {
                    if (opt.isSelected() == true) {
                        dados[0].setVolverALanzar(true);
                    }
                    if (opt1.isSelected() == true) {
                        dados[1].setVolverALanzar(true);
                    }
                    if (opt2.isSelected() == true) {
                        dados[2].setVolverALanzar(true);
                    }
                    if (opt3.isSelected() == true) {
                        dados[3].setVolverALanzar(true);
                    }
                    if (opt4.isSelected() == true) {
                        dados[4].setVolverALanzar(true);
                    }
                    for (int j = 0; j < dados.length; j++) {
                        int nr = (int) (Math.random() * 6 + 1);
                        if (dados[j].isVolverALanzar()==true) {
                            dados[j] = new Dado(nr, false);
                            m = m + "       ===>          "  + dados[j].getNumero() + "\n";
                            m = m + "           " + "         DADO " + (j + 1) + "\n";
                        }else{
                            m = m + "       ===>          " + dados[j].getNumero() + "\n";
                            m = m + "           " + "         DADO " + (j + 1) + "\n";
                        }

                    }
                    dados[1].mostrar(m);
                    
                }

    }
   
    void puntos(int l) {
        int i, j, aux, c = 0, nc = 0, num = 0,nr=0;
        int[] or = new int[5];
//          int[] or ={1,2,3,4,6};   

        for (int k = 0; k < dados.length; k++) {
            or[k] = dados[k].getNumero();
        }
        for (i = 0; i < or.length - 1; i++) {
            for (j = 0; j < or.length - i - 1; j++) {
                if (or[j + 1] < or[j]) {
                    aux = or[j + 1];
                    or[j + 1] = or[j];
                    or[j] = aux;
                }
            }
        }
        System.out.println(or[0] + " " + or[1] + " " + or[2] + " " + or[3] + " " + or[4]);

        for (int k = 0; k < or.length; k++) {
            for (int m = 0; m < or.length; m++) {
                if (or[k]==or[m]) {
                    nr++;
                }
                
            }
            if (nr==1) {
                nr=0;
            }
        }
        if (nr<=1) {
            System.out.println("ll");
            dadosdistintos(l);
        } else {
            aux = or[0];
            for (int n = 0; n < or.length; n++) {
                if (aux == or[n]) {
                    c++;
                } else {
                    if (c > nc) {
                        nc = c;
                        num = aux;
                    }
                    aux = or[n];
                    c = 1;
                }
                if (c == nc && aux > num) {
                    num = aux;
                } else {
                    if (or[4] <= aux && c > 1) {
                        nc = c;
                        num = aux;
                    }
                }
            }

            jugadores[l].setPuntos(num * nc);
        }
    }

    void dadosdistintos(int b) {
        int suma = 0;
        for (Dado dado : dados) {
            suma = suma + dado.getNumero();
        }
        jugadores[b].setPuntos(suma);
        
    }
}
