/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_albertthgodoy_emiliano_agurcia;

/**
 *
 * @author emili
 */
public class Caballo extends Pieza {

    public Caballo() {
    }

    public Caballo(boolean colorPieza) {
        super(colorPieza);
    }

    public Caballo(int cordX, int cordY, boolean colorPieza) {
        super(cordX, cordY, colorPieza);
    }

    

    @Override
    public char Figura() {
        if (colorPieza == true) {
            return 'N';
        } else {
            return 'n';
        }
    }

    @Override
    public boolean validarMovimiento(int movActualX, int movActualY, int movPiezaX, int movPiezaY) {
        boolean mover = false;
        if(movPiezaY > 7 || movPiezaX > 7){
            mover = false;
        }else if(movPiezaY == movActualY && movPiezaX == movActualX){
            mover = false;
        }else if((movPiezaY != movActualY-2 && movPiezaX != movActualX-1) ||    //2 Arriba 1 izquierda
           (movPiezaY != movActualY-2 && movPiezaX != movActualX+1) ||          //2 Arriba 1 derecha
           (movPiezaY != movActualY+2 && movPiezaX != movActualX-1) ||          //2 Abajo 1 izquierda
           (movPiezaY != movActualY+2 && movPiezaX != movActualX+1) ||          //2 Abajo 1 derecha
                
           (movPiezaY != movActualY-1 && movPiezaX != movActualX-2) ||          //1 Izquierda 2 arriba
           (movPiezaY != movActualY+1 && movPiezaX != movActualX-2) ||          //1 Izquierda 2 abajo
           (movPiezaY != movActualY-1 && movPiezaX != movActualX+2) ||          //1 Derecha 2 arriba
           (movPiezaY != movActualY+1 && movPiezaX != movActualX+2)){           //1 Derecha 2 abajo
            mover = false;
        }
        
        return mover;
    }

}
