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
public class Alfil extends Pieza{

    public Alfil() {
    }

    public Alfil(boolean colorPieza) {
        super(colorPieza);
    }

    public Alfil(int cordX, int cordY, boolean colorPieza) {
        super(cordX, cordY, colorPieza);
    }
    
    
    

    @Override
    public char Figura() {
        if (colorPieza == true) {      
            return 'B';
        } else {
            return 'b';
        }
    }

    @Override
    public boolean validarMovimiento(int movActualX, int movActualY, int movPiezaX, int movPiezaY) {
        boolean mover = false;
        for (int i = 0; i < 8; i++) {
            if(movPiezaY != movPiezaX ||                                        //Diagonal \
              (movPiezaY != movActualY-i && movPiezaX != movActualX+i) ||       //Diagonal />
              (movPiezaY != movActualY+i && movPiezaX != movActualX-i)){        //Diagonal </
                mover = false;
            }else{
                mover = true;
            }
        }
        return mover;
    }
    
}
