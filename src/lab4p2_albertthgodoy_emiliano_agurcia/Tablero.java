package lab4p2_albertthgodoy_emiliano_agurcia;

import java.util.Random;

/**
 *
 * @author godoy
 */
public class Tablero {

    //Atributos
    private final Object[][] tablero = new Tablero[8][8];
    private boolean turnoChess;

    //Constructor
    public Tablero() {
    }

    /**
     * Metodo para iniciar el tablero con las piezas
     */
    public void iniciarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                //Rellenar el tablero
                //Colocar negras
                if (i == 0) {
                    switch (j) {
                        case 0:
                            tablero[i][j] = new Torre(false);
                            break;
                        case 1:
                            tablero[i][j] = new Caballo(false);
                            break;
                        case 2:
                            tablero[i][j] = new Alfil(false);
                            break;
                        case 3:
                            tablero[i][j] = new Dama(false);
                            break;
                        case 4:
                            tablero[i][j] = new Rey(false);
                            break;
                        case 5:
                            tablero[i][j] = new Alfil(false);
                            break;
                        case 6:
                            tablero[i][j] = new Caballo(false);
                            break;
                        case 7:
                            tablero[i][j] = new Torre(false);
                            break;
                        default:

                    }//fin switch
                } else if (i == 1 && j < 8) {
                    tablero[i][j] = new Peon(false);
                    //Crear fichas blancas
                } else if (i == 6 && j < 8) {
                    tablero[i][j] = new Peon(true);
                } else if (i == 7) {
                    switch (j) {
                        case 0:
                            tablero[i][j] = new Torre(true);
                            break;
                        case 1:
                            tablero[i][j] = new Caballo(true);
                            break;
                        case 2:
                            tablero[i][j] = new Alfil(true);
                            break;
                        case 3:
                            tablero[i][j] = new Dama(true);
                            break;
                        case 4:
                            tablero[i][j] = new Rey(true);
                            break;
                        case 5:
                            tablero[i][j] = new Alfil(true);
                            break;
                        case 6:
                            tablero[i][j] = new Caballo(true);
                            break;
                        case 7:
                            tablero[i][j] = new Torre(true);
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
}
