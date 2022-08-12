package lab4p2_albertthgodoy_emiliano_agurcia;

/**
 *
 * @author emili
 */
public class Peon extends Pieza{

    public Peon() {
    }

    public Peon(boolean colorPieza) {
        super(colorPieza);
    }

    public Peon(int cordX, int cordY, boolean colorPieza) {
        super(cordX, cordY, colorPieza);
    }
    

    

    @Override
    public char Figura() {
        if (colorPieza == true) {      
            return 'P';
        } else {
            return 'p';
        }
    }

    @Override
    public boolean validarMovimiento(int movActualX, int movActualY, int movPiezaX, int movPiezaY) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
