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

    @Override
    public boolean validarMovimiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public char Figura() {
        if (colorPieza == true) {      
            return 'P';
        } else {
            return 'p';
        }
    }
    
}
