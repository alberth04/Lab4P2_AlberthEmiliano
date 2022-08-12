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
    public boolean validarMovimiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public char Figura() {
        if (colorPieza == true) {      
            return 'B';
        } else {
            return 'b';
        }
    }
    
}
