package Juego;

import static Juego.Juego.lanzamiento;
import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    static String[] jugadores;
    static int[][] tablaPuntuaciones;
    static int[] lanzamiento() {

        int[] resultados = new int[5]; //Se tiran 5 dados

        resultados[0] = (int) (Math.random() * 6 + 1); //Primer dado
        resultados[1] = (int) (Math.random() * 6 + 1); //Segundo dado
        resultados[2] = (int) (Math.random() * 6 + 1); //Tercer dado
        resultados[3] = (int) (Math.random() * 6 + 1); //Cuarto dado
        resultados[4] = (int) (Math.random() * 6 + 1); //Quinto dado

        return resultados;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cuantos jugadores participaran?: ");
        int n = Integer.parseInt(teclado.nextLine());

        //Pedimos por consola cuantos jugadores participaran
        jugadores = new String[n];
        tablaPuntuaciones = new int[n][5];

        //Ingresamos los nombres de los jugadores
        System.out.println("\nIntroduzca nombres.");
        for (int i = 0; i < n; i++) {
            System.out.printf("Jugador #%d: ", (i + 1));
            jugadores[i] = teclado.nextLine();
        }

        boolean hayGanador = false;

        for (int i = 0; i < 2 && !hayGanador; i++) {
            System.out.print("\n\t\t\tTURNO #" + (i + 1));

            //Ahora cada Jugador lanzará una vez
            for (int j = 0; j < jugadores.length && !hayGanador; j++) {

                System.out.printf("\n\nLanza el jugador %s --> ", jugadores[j]);
                //Pedimos a nuestro metodo que lance dados y recogemos resultado
                int[] dados = lanzamiento();
                System.out.printf("Dado1: %d\tDado2: %d\tDado3: %d\tDado4: %d\tDado5: %d", dados[0], dados[1], dados[2], dados[3], dados[4]);
                //Si ha sacado tres iguales, habrá ganado y los bucles finalizarán
                if (dados[0] == dados[1] && dados[1] == dados[2]) {
                    System.out.println("\nHa ganado el Jugador " + jugadores[j]);
                    hayGanador = true; //Esto pone fin al juego
                } else { //No ha ganado, sumamos y guardamos resultado
                    tablaPuntuaciones[j][i] = dados[0] + dados[1] + dados[2] + dados[3] + dados[4];
                }
            }
            System.out.println("\n\n\t\tPULSE INTRO PARA CONTINUAR");
            teclado.nextLine();
        }

        if (!hayGanador) {
            int mayorPunt = 0;
            String jugadorMayorPunt = new String();
            System.out.println("\n\n\t\tTABLA DE RESULTADOS");
            for (int i = 0; i < jugadores.length; i++) {
                System.out.print("\n" + jugadores[i]);
                for (int j = 0; j < 2; j++) {
                    int puntos = tablaPuntuaciones[i][j];
                    System.out.print("\t" + puntos);
                    if (puntos > mayorPunt) {
                        mayorPunt = puntos;
                        jugadorMayorPunt = jugadores[i];
                    }
                }
            }
            System.out.printf("\n\n***Ha ganado %s al conseguir un puntaje de %d***", jugadorMayorPunt, mayorPunt);
        }
        teclado.close();
        System.out.println("\n\n\t\t\tFIN DE PROGRAMA");

    }
}
