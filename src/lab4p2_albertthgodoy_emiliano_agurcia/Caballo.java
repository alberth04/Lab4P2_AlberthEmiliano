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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
