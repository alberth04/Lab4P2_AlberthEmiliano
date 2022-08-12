package lab4p2_albertthgodoy_emiliano_agurcia;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author godoy
 */
public class Tablero {

    //Atributos
    private final Pieza[][] tablero = new Pieza[8][8];
    private boolean turnoChess;
    private int movPiezaX, movPiezaY, movActualX, movActualY;

    //Constructor
    public Tablero() {
    }

    /**
     * Metodo para iniciar el tablero con las piezas
     */
    public void iniciarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                //Rellenar el tablero
                //Colocar negras
                if (i == 0) {
                    switch (j) {
                        case 0:
                            tablero[i][j] = new Torre(j, i, turnoChess);

                            break;
                        case 1:
                            tablero[i][j] = new Caballo(j, i, false);
                            break;
                        case 2:
                            tablero[i][j] = new Alfil(j, i, false);
                            break;
                        case 3:
                            tablero[i][j] = new Dama(j, i, false);
                            break;
                        case 4:
                            tablero[i][j] = new Rey(j, i, false);
                            break;
                        case 5:
                            tablero[i][j] = new Alfil(j, i, false);
                            break;
                        case 6:
                            tablero[i][j] = new Caballo(j, i, false);
                            break;
                        case 7:
                            tablero[i][j] = new Torre(j, i, false);
                            break;
                        default:

                    }//fin switch
                } else if (i == 1 && j < 8) {
                    tablero[i][j] = new Peon(j, i, false);
                    //Crear fichas blancas
                } else if (i == 6 && j < 8) {
                    tablero[i][j] = new Peon(j, i, true);
                } else if (i == 7) {
                    switch (j) {
                        case 0:
                            tablero[i][j] = new Torre(j, i, true);
                            break;
                        case 1:
                            tablero[i][j] = new Caballo(j, i, true);
                            break;
                        case 2:
                            tablero[i][j] = new Alfil(j, i, true);
                            break;
                        case 3:
                            tablero[i][j] = new Dama(j, i, true);
                            break;
                        case 4:
                            tablero[i][j] = new Rey(j, i, true);
                            break;
                        case 5:
                            tablero[i][j] = new Alfil(j, i, true);
                            break;
                        case 6:
                            tablero[i][j] = new Caballo(j, i, true);
                            break;
                        case 7:
                            tablero[i][j] = new Torre(j, i, true);
                            break;
                        default:

                    }

                } else {
                    tablero[i][j] = null;
                }
            }
        }//fin for

        //Turno del jugador
        Random rnd = new Random();
        turnoChess = rnd.nextBoolean();
    }

    public void ImprimirTablero() {
        System.out.println("  a  b  c  d  e  f  g  h  ");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print(8 - i);
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] != null) {
                    System.out.printf("[%c]", tablero[i][j].Figura());
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }

    }

    public void moverPieza() {
        Scanner sc = new Scanner(System.in);
        String mover = "";
        if (turnoChess == true) {
            //Turno de las blancas
            System.out.println("===============BLANCAS=================");
            System.out.println("Movimiento: (ejemplo P|a6-a5) ");
            mover = sc.next();
            //Validacion
            while (!mover.matches("[a-zA-Z]\\|[a-zA-Z][1-8]-[a-zA-Z][1-8]")) {
                System.out.println("No existe ese movimiento \nMovimiento: (ejemplo P|a6-a5) ");
                mover = sc.next();
            }

            String[] moverA = mover.split("\\||-");

            switch (moverA[1].charAt(0)) {
                case 'a','A':
                    movActualX = 0;
                    break;
                case 'b','B':
                    movActualX = 1;
                    break;
                case 'c','C':
                    movActualX = 2;
                    break;
                case 'd','D':
                    movActualX = 3;
                    break;
                case 'e','E':
                    movActualX = 4;
                    break;
                case 'f','F':
                    movActualX = 5;
                    break;
                case 'g','G':
                    movActualX = 6;
                    break;
                case 'h','H':
                    movActualX = 7;

                    break;
                default:

                    break;
            }//FIN SWITCH
            
        }
    }

    public boolean movimientoValido() {
        //Validaciones si esta fuera de tablero
        if () {

        }
    }
}//fin class
